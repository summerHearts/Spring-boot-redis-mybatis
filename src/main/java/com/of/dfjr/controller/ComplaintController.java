package com.of.dfjr.controller;
import com.github.pagehelper.PageInfo;
import com.of.dfjr.pojo.ComplaintInfo;
import com.of.dfjr.service.ComplaintService;
import com.of.dfjr.util.Paging;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Kenvin on 2018/1/18.
 */

@RestController
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    /**
     * 查询所有的投诉信息列表
     *
     * @return
     */
    @RequestMapping(value = "/complaintInfoList" ,method = RequestMethod.GET)
    public Paging complaintInfoList() {
        System.out.println("第一次进入接口");
        return  complaintService.selectAllComplaint(2,3);
    }

}