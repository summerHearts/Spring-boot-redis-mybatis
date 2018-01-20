package com.of.dfjr.mapper;

import com.of.dfjr.pojo.ComplaintInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
public interface ComplaintInfoMapper {  //mapper.xml文件
    @Delete({
        "delete from complaint_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into complaint_info (id, complaint_id, ",
        "complaint_phone, customer_name, ",
        "complaint_business, customer_id, ",
        "complaint_channel, complaintchannel_info, ",
        "protocol_id, complaint_theme, ",
        "complaint_type, complaint_detail, ",
        "emergency_degree, complaint_date, ",
        "appoint_time, forwardprocessing_department, ",
        "creater, create_time, ",
        "modifier, modify_time, ",
        "version, feedback_time, ",
        "department_type, processing_state)",
        "values (#{id,jdbcType=BIGINT}, #{complaintId,jdbcType=VARCHAR}, ",
        "#{complaintPhone,jdbcType=VARCHAR}, #{customerName,jdbcType=VARCHAR}, ",
        "#{complaintBusiness,jdbcType=BIGINT}, #{customerId,jdbcType=BIGINT}, ",
        "#{complaintChannel,jdbcType=BIGINT}, #{complaintchannelInfo,jdbcType=VARCHAR}, ",
        "#{protocolId,jdbcType=VARCHAR}, #{complaintTheme,jdbcType=VARCHAR}, ",
        "#{complaintType,jdbcType=BIGINT}, #{complaintDetail,jdbcType=VARCHAR}, ",
        "#{emergencyDegree,jdbcType=BIGINT}, #{complaintDate,jdbcType=TIMESTAMP}, ",
        "#{appointTime,jdbcType=TIMESTAMP}, #{forwardprocessingDepartment,jdbcType=BIGINT}, ",
        "#{creater,jdbcType=BIGINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{modifier,jdbcType=BIGINT}, #{modifyTime,jdbcType=TIMESTAMP}, ",
        "#{version,jdbcType=BIGINT}, #{feedbackTime,jdbcType=INTEGER}, ",
        "#{departmentType,jdbcType=INTEGER}, #{processingState,jdbcType=BIGINT})"
    })
    int insert(ComplaintInfo record);

    int insertSelective(ComplaintInfo record);

    @Select({
        "select",
        "id, complaint_id, complaint_phone, customer_name, complaint_business, customer_id, ",
        "complaint_channel, complaintchannel_info, protocol_id, complaint_theme, complaint_type, ",
        "complaint_detail, emergency_degree, complaint_date, appoint_time, forwardprocessing_department, ",
        "creater, create_time, modifier, modify_time, version, feedback_time, department_type, ",
        "processing_state",
        "from complaint_info",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.of.dfjr.mapper.ComplaintInfoMapper.BaseResultMap")
    ComplaintInfo selectByPrimaryKey(Long id);


    List<ComplaintInfo> selectAllComplaint();


    int updateByPrimaryKeySelective(ComplaintInfo record);

    @Update({
        "update complaint_info",
        "set complaint_id = #{complaintId,jdbcType=VARCHAR},",
          "complaint_phone = #{complaintPhone,jdbcType=VARCHAR},",
          "customer_name = #{customerName,jdbcType=VARCHAR},",
          "complaint_business = #{complaintBusiness,jdbcType=BIGINT},",
          "customer_id = #{customerId,jdbcType=BIGINT},",
          "complaint_channel = #{complaintChannel,jdbcType=BIGINT},",
          "complaintchannel_info = #{complaintchannelInfo,jdbcType=VARCHAR},",
          "protocol_id = #{protocolId,jdbcType=VARCHAR},",
          "complaint_theme = #{complaintTheme,jdbcType=VARCHAR},",
          "complaint_type = #{complaintType,jdbcType=BIGINT},",
          "complaint_detail = #{complaintDetail,jdbcType=VARCHAR},",
          "emergency_degree = #{emergencyDegree,jdbcType=BIGINT},",
          "complaint_date = #{complaintDate,jdbcType=TIMESTAMP},",
          "appoint_time = #{appointTime,jdbcType=TIMESTAMP},",
          "forwardprocessing_department = #{forwardprocessingDepartment,jdbcType=BIGINT},",
          "creater = #{creater,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modifier = #{modifier,jdbcType=BIGINT},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "version = #{version,jdbcType=BIGINT},",
          "feedback_time = #{feedbackTime,jdbcType=INTEGER},",
          "department_type = #{departmentType,jdbcType=INTEGER},",
          "processing_state = #{processingState,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ComplaintInfo record);
}