package com.of;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.omg.PortableInterceptor.Interceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;
@Configuration
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.of.dfjr.mapper")

public class MybatisApplication {

	private static final Logger log = LoggerFactory.getLogger(MybatisApplication.class);

	@Bean
	public PageHelper pageHelper() {
		log.info("------Register MyBatis PageHelper");
		PageHelper pageHelper = new PageHelper();
		Properties p = new Properties();
		p.setProperty("offsetAsPageNum", "true");
		p.setProperty("rowBoundsWithCount", "true");
		p.setProperty("reasonable", "true");
		//通过设置pageSize=0或者RowBounds.limit = 0就会查询出全部的结果。
		p.setProperty("pageSizeZero", "true");
		pageHelper.setProperties(p);
		return pageHelper;
	}

	public static void main(String[] args) {
		SpringApplication.run(MybatisApplication.class, args);
	}
}


