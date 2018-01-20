package com.of.dfjr.service;

import com.github.pagehelper.PageInfo;
import com.of.dfjr.pojo.ComplaintInfo;
import com.of.dfjr.util.Paging;

import java.util.List;

/**
 * Created by Kenvin on 2018/1/18.
 */
public interface ComplaintService {
    ComplaintInfo complaintInfoList();

    Paging selectAllComplaint(int pageSize , int pageNumber) ;
}
