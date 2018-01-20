package com.of.dfjr.mapper;

import com.of.dfjr.pojo.ProcessingRecord;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ProcessingRecordMapper {
    @Delete({
        "delete from processing_record",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into processing_record (id, processingrecord_id, ",
        "personnel_id, complaint_id, ",
        "processingcompletion_time, emergency_degree, ",
        "processing_state, forwardprocessing_department, ",
        "processing_department, processing_record, ",
        "feedback_time, creater, ",
        "create_time, modifier, ",
        "modify_time, version, ",
        "process_name, appoint_time, ",
        "department_type)",
        "values (#{id,jdbcType=BIGINT}, #{processingrecordId,jdbcType=INTEGER}, ",
        "#{personnelId,jdbcType=BIGINT}, #{complaintId,jdbcType=VARCHAR}, ",
        "#{processingcompletionTime,jdbcType=TIMESTAMP}, #{emergencyDegree,jdbcType=BIGINT}, ",
        "#{processingState,jdbcType=BIGINT}, #{forwardprocessingDepartment,jdbcType=BIGINT}, ",
        "#{processingDepartment,jdbcType=BIGINT}, #{processingRecord,jdbcType=VARCHAR}, ",
        "#{feedbackTime,jdbcType=BIGINT}, #{creater,jdbcType=BIGINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{modifier,jdbcType=BIGINT}, ",
        "#{modifyTime,jdbcType=TIMESTAMP}, #{version,jdbcType=BIGINT}, ",
        "#{processName,jdbcType=VARCHAR}, #{appointTime,jdbcType=TIMESTAMP}, ",
        "#{departmentType,jdbcType=BIGINT})"
    })
    int insert(ProcessingRecord record);

    int insertSelective(ProcessingRecord record);

    @Select({
        "select",
        "id, processingrecord_id, personnel_id, complaint_id, processingcompletion_time, ",
        "emergency_degree, processing_state, forwardprocessing_department, processing_department, ",
        "processing_record, feedback_time, creater, create_time, modifier, modify_time, ",
        "version, process_name, appoint_time, department_type",
        "from processing_record",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.of.dfjr.mapper.ProcessingRecordMapper.BaseResultMap")
    ProcessingRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProcessingRecord record);

    @Update({
        "update processing_record",
        "set processingrecord_id = #{processingrecordId,jdbcType=INTEGER},",
          "personnel_id = #{personnelId,jdbcType=BIGINT},",
          "complaint_id = #{complaintId,jdbcType=VARCHAR},",
          "processingcompletion_time = #{processingcompletionTime,jdbcType=TIMESTAMP},",
          "emergency_degree = #{emergencyDegree,jdbcType=BIGINT},",
          "processing_state = #{processingState,jdbcType=BIGINT},",
          "forwardprocessing_department = #{forwardprocessingDepartment,jdbcType=BIGINT},",
          "processing_department = #{processingDepartment,jdbcType=BIGINT},",
          "processing_record = #{processingRecord,jdbcType=VARCHAR},",
          "feedback_time = #{feedbackTime,jdbcType=BIGINT},",
          "creater = #{creater,jdbcType=BIGINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "modifier = #{modifier,jdbcType=BIGINT},",
          "modify_time = #{modifyTime,jdbcType=TIMESTAMP},",
          "version = #{version,jdbcType=BIGINT},",
          "process_name = #{processName,jdbcType=VARCHAR},",
          "appoint_time = #{appointTime,jdbcType=TIMESTAMP},",
          "department_type = #{departmentType,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(ProcessingRecord record);
}