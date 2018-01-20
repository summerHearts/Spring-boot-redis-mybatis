package com.of.dfjr.util;

import com.github.pagehelper.Page;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * Created by Kenvin on 2018/1/19.
 */
public class Paging<E> implements Serializable {
    private int pageNum;
    private int pageSize;
    private String orderBy;
    private long total;
    private boolean count;
    private int totalPage;
    private List<E> data;

    public Paging() {
        this.pageNum = 1;
        this.pageSize = 20;
    }

    public Paging(int pageNum, int pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public Paging(int pageNum, int pageSize, String orderBy) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.orderBy = orderBy;
    }

    public void initList(List<E> data) {
        if(data instanceof Page) {
            Page page = (Page)data;
            this.pageNum = page.getPageNum();
            this.pageSize = page.getPageSize();
            this.totalPage = page.getPages();
            this.data = page;
            this.total = page.getTotal();
        } else if(data instanceof Collection) {
            this.pageNum = 1;
            this.pageSize = data.size();
            this.totalPage = this.pageSize > 0?1:0;
            this.data = data;
            this.total = (long)data.size();
        }

    }

    public void initTotalPage() {
        this.totalPage = (int)(this.total / (long)this.pageSize);
        this.totalPage = this.totalPage == 0?1:(this.total % (long)this.pageSize > 0L?this.totalPage + 1:this.totalPage);
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return this.orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public long getTotal() {
        return this.total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public boolean isCount() {
        return this.count;
    }

    public void setCount(boolean count) {
        this.count = count;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<E> getData() {
        return this.data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }


    public boolean equals(Object o) {
        if(o == this) {
            return true;
        } else if(!(o instanceof Paging)) {
            return false;
        } else {
            Paging<?> other = (Paging)o;
            if(!other.canEqual(this)) {
                return false;
            } else if(this.getPageNum() != other.getPageNum()) {
                return false;
            } else if(this.getPageSize() != other.getPageSize()) {
                return false;
            } else {
                label64: {
                    Object this$orderBy = this.getOrderBy();
                    Object other$orderBy = other.getOrderBy();
                    if(this$orderBy == null) {
                        if(other$orderBy == null) {
                            break label64;
                        }
                    } else if(this$orderBy.equals(other$orderBy)) {
                        break label64;
                    }

                    return false;
                }

                if(this.getTotal() != other.getTotal()) {
                    return false;
                } else if(this.isCount() != other.isCount()) {
                    return false;
                } else if(this.getTotalPage() != other.getTotalPage()) {
                    return false;
                } else {
                    Object this$data = this.getData();
                    Object other$data = other.getData();
                    if(this$data == null) {
                        if(other$data != null) {
                            return false;
                        }
                    } else if(!this$data.equals(other$data)) {
                        return false;
                    }

                    return false;
                }
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Paging;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "Paging(pageNum=" + this.getPageNum() + ", pageSize=" + this.getPageSize() + ", orderBy=" + this.getOrderBy() + ", total=" + this.getTotal() + ", count=" + this.isCount() + ", totalPage=" + this.getTotalPage() + ", rowItemList=" + this.getData() + ", extObj="  + ")";
    }
}
