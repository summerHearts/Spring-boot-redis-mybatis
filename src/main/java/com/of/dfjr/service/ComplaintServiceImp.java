package com.of.dfjr.service;

import com.github.pagehelper.PageHelper;
import com.of.dfjr.mapper.ComplaintInfoMapper;
import com.of.dfjr.pojo.ComplaintInfo;
import com.of.dfjr.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kenvin on 2018/1/18.
 */

@Service
public class ComplaintServiceImp  implements ComplaintService{

    @Autowired
    private ComplaintInfoMapper complaintInfoMapper;

    @Override
    public ComplaintInfo complaintInfoList() {
        return complaintInfoMapper.selectByPrimaryKey((long) 13);
    }

    @Override
    public Paging selectAllComplaint(int pageSize ,int pageNumber) {

        Paging page = new Paging(1,5);
        PageHelper.startPage(1, 5);
        List<ComplaintInfo> list=complaintInfoMapper.selectAllComplaint();
        page.initList(list);
        return page;
    }
}
