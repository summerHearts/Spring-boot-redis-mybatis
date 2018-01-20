1、 配置Redis. POM.xml文件中添加依赖信息
 ```
<dependency>
	  <groupId>org.springframework.boot</groupId>
	  <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
```

##2、在application.yml文件中增加需要配置Redis的连接信息。

```
  redis:
      # redis数据库索引（默认为0），我们使用索引为3的数据库，避免和其他数据库冲突
      database: 3
      # redis服务器地址（默认为localhost）
      host: localhost
      # redis端口（默认为6379）
      port: 6379
      # redis访问密码（默认为空）
      password:
      # redis连接超时时间（单位为毫秒）
      timeout: 0
      # redis连接池配置
      pool:
        # 最大可用连接数（默认为8，负数表示无限）
        max-active: 8
        # 最大空闲连接数（默认为8，负数表示无限）
        max-idle: 8
        # 最小空闲连接数（默认为0，该值只有为正数才有作用）
        min-idle: 0
        # 从连接池中获取连接最大等待时间（默认为-1，单位为毫秒，负数表示无限）
        max-wait: -1
```
由于我们在pom.xml中已经引入了spring-boot-starter-data-redis库，所以Spring Boot会帮我们自动加载Redis的连接。

##3、将Redis作为二级缓存

  - Mybatis的二级缓存可以自动地对数据库的查询做缓存，并且可以在更新数据时同时自动地更新缓存。

  - 实现Mybatis的二级缓存很简单，只需要新建一个类实现`org.apache.ibatis.cache.Cache`接口即可。

   - 该接口共有以下五个方法：

    - `String getId()`：mybatis缓存操作对象的标识符。一个mapper对应一个mybatis的缓存操作对象。
    - `void putObject(Object key, Object value)`：将查询结果塞入缓存。
    - `Object getObject(Object key)`：从缓存中获取被缓存的查询结果。
    - `Object removeObject(Object key)`：从缓存中删除对应的key、value。只有在回滚时触发。一般我们也可以不用实现，具体使用方式请参考`org.apache.ibatis.cache.decorators.TransactionalCache。`
    - `void clear()`：发生更新时，清除缓存。
    -` int getSize()`：可选实现。返回缓存的数量。
    - `ReadWriteLock getReadWriteLock()`：可选实现。用于实现原子性的缓存操作。

![](http://upload-images.jianshu.io/upload_images/325120-2d421b94a180f472.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

  - 1.  自己实现的二级缓存，必须要有一个带id的构造函数，否则会报错。
  - 2.  我们使用Spring封装的`redisTemplate`来操作Redis。**网上所有介绍redis做二级缓存的文章都是直接用jedis库，但是笔者认为这样不够Spring Style，而且，`redisTemplate`封装了底层的实现，未来如果我们不用jedis了，我们可以直接更换底层的库，而不用修改上层的代码。更方便的是，使用`redisTemplate`，我们不用关心redis连接的释放问题，否则新手很容易忘记释放连接而导致应用卡死。**
  - 3.  需要注意的是，这里不能通过autowire的方式引用`redisTemplate`，因为`RedisCache`并不是Spring容器里的bean。所以我们需要手动地去调用容器的`getBean`方法来拿到这个bean。
  - 4.  我们采用的redis序列化方式是默认的jdk序列化。所以数据库的查询对象（比如ComplaintInfo类）需要实现`Serializable`接口。

##4、开启二级缓存
 - 接下来，我们需要在ComplaintInfoMapper.xml中开启二级缓存：

![](http://upload-images.jianshu.io/upload_images/325120-82d6ecc8ea4bbdb0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-ce7a0ae7487aff8c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)

![](http://upload-images.jianshu.io/upload_images/325120-9e49fade414b29e2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/800)



表示开启基于redis的二级缓存，并且在update语句中，我们设置flushCache为true，这样在更新ComplaintInfo信息时，能够自动失效缓存（本质上调用的是clear方法）。
