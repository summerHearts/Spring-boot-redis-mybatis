package com.of.dfjr.pojo;

import java.io.Serializable;
import java.util.Date;

public class ProcessingRecord implements Serializable {
    private Long id;

    private Integer processingrecordId;

    private Long personnelId;

    private String complaintId;

    private Date processingcompletionTime;

    private Long emergencyDegree;

    private Long processingState;

    private Long forwardprocessingDepartment;

    private Long processingDepartment;

    private String processingRecord;

    private Long feedbackTime;

    private Long creater;

    private Date createTime;

    private Long modifier;

    private Date modifyTime;

    private Long version;

    private String processName;

    private Date appointTime;

    private Long departmentType;

    private static final long serialVersionUID = 1L;

    public ProcessingRecord(Long id, Integer processingrecordId, Long personnelId, String complaintId, Date processingcompletionTime, Long emergencyDegree, Long processingState, Long forwardprocessingDepartment, Long processingDepartment, String processingRecord, Long feedbackTime, Long creater, Date createTime, Long modifier, Date modifyTime, Long version, String processName, Date appointTime, Long departmentType) {
        this.id = id;
        this.processingrecordId = processingrecordId;
        this.personnelId = personnelId;
        this.complaintId = complaintId;
        this.processingcompletionTime = processingcompletionTime;
        this.emergencyDegree = emergencyDegree;
        this.processingState = processingState;
        this.forwardprocessingDepartment = forwardprocessingDepartment;
        this.processingDepartment = processingDepartment;
        this.processingRecord = processingRecord;
        this.feedbackTime = feedbackTime;
        this.creater = creater;
        this.createTime = createTime;
        this.modifier = modifier;
        this.modifyTime = modifyTime;
        this.version = version;
        this.processName = processName;
        this.appointTime = appointTime;
        this.departmentType = departmentType;
    }

    public ProcessingRecord() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProcessingrecordId() {
        return processingrecordId;
    }

    public void setProcessingrecordId(Integer processingrecordId) {
        this.processingrecordId = processingrecordId;
    }

    public Long getPersonnelId() {
        return personnelId;
    }

    public void setPersonnelId(Long personnelId) {
        this.personnelId = personnelId;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId == null ? null : complaintId.trim();
    }

    public Date getProcessingcompletionTime() {
        return processingcompletionTime;
    }

    public void setProcessingcompletionTime(Date processingcompletionTime) {
        this.processingcompletionTime = processingcompletionTime;
    }

    public Long getEmergencyDegree() {
        return emergencyDegree;
    }

    public void setEmergencyDegree(Long emergencyDegree) {
        this.emergencyDegree = emergencyDegree;
    }

    public Long getProcessingState() {
        return processingState;
    }

    public void setProcessingState(Long processingState) {
        this.processingState = processingState;
    }

    public Long getForwardprocessingDepartment() {
        return forwardprocessingDepartment;
    }

    public void setForwardprocessingDepartment(Long forwardprocessingDepartment) {
        this.forwardprocessingDepartment = forwardprocessingDepartment;
    }

    public Long getProcessingDepartment() {
        return processingDepartment;
    }

    public void setProcessingDepartment(Long processingDepartment) {
        this.processingDepartment = processingDepartment;
    }

    public String getProcessingRecord() {
        return processingRecord;
    }

    public void setProcessingRecord(String processingRecord) {
        this.processingRecord = processingRecord == null ? null : processingRecord.trim();
    }

    public Long getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Long feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public Long getCreater() {
        return creater;
    }

    public void setCreater(Long creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifier() {
        return modifier;
    }

    public void setModifier(Long modifier) {
        this.modifier = modifier;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Long getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(Long departmentType) {
        this.departmentType = departmentType;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ProcessingRecord other = (ProcessingRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProcessingrecordId() == null ? other.getProcessingrecordId() == null : this.getProcessingrecordId().equals(other.getProcessingrecordId()))
            && (this.getPersonnelId() == null ? other.getPersonnelId() == null : this.getPersonnelId().equals(other.getPersonnelId()))
            && (this.getComplaintId() == null ? other.getComplaintId() == null : this.getComplaintId().equals(other.getComplaintId()))
            && (this.getProcessingcompletionTime() == null ? other.getProcessingcompletionTime() == null : this.getProcessingcompletionTime().equals(other.getProcessingcompletionTime()))
            && (this.getEmergencyDegree() == null ? other.getEmergencyDegree() == null : this.getEmergencyDegree().equals(other.getEmergencyDegree()))
            && (this.getProcessingState() == null ? other.getProcessingState() == null : this.getProcessingState().equals(other.getProcessingState()))
            && (this.getForwardprocessingDepartment() == null ? other.getForwardprocessingDepartment() == null : this.getForwardprocessingDepartment().equals(other.getForwardprocessingDepartment()))
            && (this.getProcessingDepartment() == null ? other.getProcessingDepartment() == null : this.getProcessingDepartment().equals(other.getProcessingDepartment()))
            && (this.getProcessingRecord() == null ? other.getProcessingRecord() == null : this.getProcessingRecord().equals(other.getProcessingRecord()))
            && (this.getFeedbackTime() == null ? other.getFeedbackTime() == null : this.getFeedbackTime().equals(other.getFeedbackTime()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getProcessName() == null ? other.getProcessName() == null : this.getProcessName().equals(other.getProcessName()))
            && (this.getAppointTime() == null ? other.getAppointTime() == null : this.getAppointTime().equals(other.getAppointTime()))
            && (this.getDepartmentType() == null ? other.getDepartmentType() == null : this.getDepartmentType().equals(other.getDepartmentType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProcessingrecordId() == null) ? 0 : getProcessingrecordId().hashCode());
        result = prime * result + ((getPersonnelId() == null) ? 0 : getPersonnelId().hashCode());
        result = prime * result + ((getComplaintId() == null) ? 0 : getComplaintId().hashCode());
        result = prime * result + ((getProcessingcompletionTime() == null) ? 0 : getProcessingcompletionTime().hashCode());
        result = prime * result + ((getEmergencyDegree() == null) ? 0 : getEmergencyDegree().hashCode());
        result = prime * result + ((getProcessingState() == null) ? 0 : getProcessingState().hashCode());
        result = prime * result + ((getForwardprocessingDepartment() == null) ? 0 : getForwardprocessingDepartment().hashCode());
        result = prime * result + ((getProcessingDepartment() == null) ? 0 : getProcessingDepartment().hashCode());
        result = prime * result + ((getProcessingRecord() == null) ? 0 : getProcessingRecord().hashCode());
        result = prime * result + ((getFeedbackTime() == null) ? 0 : getFeedbackTime().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getProcessName() == null) ? 0 : getProcessName().hashCode());
        result = prime * result + ((getAppointTime() == null) ? 0 : getAppointTime().hashCode());
        result = prime * result + ((getDepartmentType() == null) ? 0 : getDepartmentType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", processingrecordId=").append(processingrecordId);
        sb.append(", personnelId=").append(personnelId);
        sb.append(", complaintId=").append(complaintId);
        sb.append(", processingcompletionTime=").append(processingcompletionTime);
        sb.append(", emergencyDegree=").append(emergencyDegree);
        sb.append(", processingState=").append(processingState);
        sb.append(", forwardprocessingDepartment=").append(forwardprocessingDepartment);
        sb.append(", processingDepartment=").append(processingDepartment);
        sb.append(", processingRecord=").append(processingRecord);
        sb.append(", feedbackTime=").append(feedbackTime);
        sb.append(", creater=").append(creater);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", version=").append(version);
        sb.append(", processName=").append(processName);
        sb.append(", appointTime=").append(appointTime);
        sb.append(", departmentType=").append(departmentType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}