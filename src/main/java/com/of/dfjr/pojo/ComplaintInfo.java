package com.of.dfjr.pojo;

import java.io.Serializable;
import java.util.Date;

public class ComplaintInfo implements Serializable {
    private Long id;

    private String complaintId;

    private String complaintPhone;

    private String customerName;

    private Long complaintBusiness;

    private Long customerId;

    private Long complaintChannel;

    private String complaintchannelInfo;

    private String protocolId;

    private String complaintTheme;

    private Long complaintType;

    private String complaintDetail;

    private Long emergencyDegree;

    private Date complaintDate;

    private Date appointTime;

    private Long forwardprocessingDepartment;

    private Long creater;

    private Date createTime;

    private Long modifier;

    private Date modifyTime;

    private Long version;

    private Integer feedbackTime;

    private Integer departmentType;

    private Long processingState;

   // private static final long serialVersionUID = 1L;

    public ComplaintInfo(Long id, String complaintId, String complaintPhone, String customerName, Long complaintBusiness, Long customerId, Long complaintChannel, String complaintchannelInfo, String protocolId, String complaintTheme, Long complaintType, String complaintDetail, Long emergencyDegree, Date complaintDate, Date appointTime, Long forwardprocessingDepartment, Long creater, Date createTime, Long modifier, Date modifyTime, Long version, Integer feedbackTime, Integer departmentType, Long processingState) {
        this.id = id;
        this.complaintId = complaintId;
        this.complaintPhone = complaintPhone;
        this.customerName = customerName;
        this.complaintBusiness = complaintBusiness;
        this.customerId = customerId;
        this.complaintChannel = complaintChannel;
        this.complaintchannelInfo = complaintchannelInfo;
        this.protocolId = protocolId;
        this.complaintTheme = complaintTheme;
        this.complaintType = complaintType;
        this.complaintDetail = complaintDetail;
        this.emergencyDegree = emergencyDegree;
        this.complaintDate = complaintDate;
        this.appointTime = appointTime;
        this.forwardprocessingDepartment = forwardprocessingDepartment;
        this.creater = creater;
        this.createTime = createTime;
        this.modifier = modifier;
        this.modifyTime = modifyTime;
        this.version = version;
        this.feedbackTime = feedbackTime;
        this.departmentType = departmentType;
        this.processingState = processingState;
    }

    public ComplaintInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId == null ? null : complaintId.trim();
    }

    public String getComplaintPhone() {
        return complaintPhone;
    }

    public void setComplaintPhone(String complaintPhone) {
        this.complaintPhone = complaintPhone == null ? null : complaintPhone.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Long getComplaintBusiness() {
        return complaintBusiness;
    }

    public void setComplaintBusiness(Long complaintBusiness) {
        this.complaintBusiness = complaintBusiness;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getComplaintChannel() {
        return complaintChannel;
    }

    public void setComplaintChannel(Long complaintChannel) {
        this.complaintChannel = complaintChannel;
    }

    public String getComplaintchannelInfo() {
        return complaintchannelInfo;
    }

    public void setComplaintchannelInfo(String complaintchannelInfo) {
        this.complaintchannelInfo = complaintchannelInfo == null ? null : complaintchannelInfo.trim();
    }

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId == null ? null : protocolId.trim();
    }

    public String getComplaintTheme() {
        return complaintTheme;
    }

    public void setComplaintTheme(String complaintTheme) {
        this.complaintTheme = complaintTheme == null ? null : complaintTheme.trim();
    }

    public Long getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(Long complaintType) {
        this.complaintType = complaintType;
    }

    public String getComplaintDetail() {
        return complaintDetail;
    }

    public void setComplaintDetail(String complaintDetail) {
        this.complaintDetail = complaintDetail == null ? null : complaintDetail.trim();
    }

    public Long getEmergencyDegree() {
        return emergencyDegree;
    }

    public void setEmergencyDegree(Long emergencyDegree) {
        this.emergencyDegree = emergencyDegree;
    }

    public Date getComplaintDate() {
        return complaintDate;
    }

    public void setComplaintDate(Date complaintDate) {
        this.complaintDate = complaintDate;
    }

    public Date getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(Date appointTime) {
        this.appointTime = appointTime;
    }

    public Long getForwardprocessingDepartment() {
        return forwardprocessingDepartment;
    }

    public void setForwardprocessingDepartment(Long forwardprocessingDepartment) {
        this.forwardprocessingDepartment = forwardprocessingDepartment;
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

    public Integer getFeedbackTime() {
        return feedbackTime;
    }

    public void setFeedbackTime(Integer feedbackTime) {
        this.feedbackTime = feedbackTime;
    }

    public Integer getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(Integer departmentType) {
        this.departmentType = departmentType;
    }

    public Long getProcessingState() {
        return processingState;
    }

    public void setProcessingState(Long processingState) {
        this.processingState = processingState;
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
        ComplaintInfo other = (ComplaintInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getComplaintId() == null ? other.getComplaintId() == null : this.getComplaintId().equals(other.getComplaintId()))
            && (this.getComplaintPhone() == null ? other.getComplaintPhone() == null : this.getComplaintPhone().equals(other.getComplaintPhone()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getComplaintBusiness() == null ? other.getComplaintBusiness() == null : this.getComplaintBusiness().equals(other.getComplaintBusiness()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getComplaintChannel() == null ? other.getComplaintChannel() == null : this.getComplaintChannel().equals(other.getComplaintChannel()))
            && (this.getComplaintchannelInfo() == null ? other.getComplaintchannelInfo() == null : this.getComplaintchannelInfo().equals(other.getComplaintchannelInfo()))
            && (this.getProtocolId() == null ? other.getProtocolId() == null : this.getProtocolId().equals(other.getProtocolId()))
            && (this.getComplaintTheme() == null ? other.getComplaintTheme() == null : this.getComplaintTheme().equals(other.getComplaintTheme()))
            && (this.getComplaintType() == null ? other.getComplaintType() == null : this.getComplaintType().equals(other.getComplaintType()))
            && (this.getComplaintDetail() == null ? other.getComplaintDetail() == null : this.getComplaintDetail().equals(other.getComplaintDetail()))
            && (this.getEmergencyDegree() == null ? other.getEmergencyDegree() == null : this.getEmergencyDegree().equals(other.getEmergencyDegree()))
            && (this.getComplaintDate() == null ? other.getComplaintDate() == null : this.getComplaintDate().equals(other.getComplaintDate()))
            && (this.getAppointTime() == null ? other.getAppointTime() == null : this.getAppointTime().equals(other.getAppointTime()))
            && (this.getForwardprocessingDepartment() == null ? other.getForwardprocessingDepartment() == null : this.getForwardprocessingDepartment().equals(other.getForwardprocessingDepartment()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifier() == null ? other.getModifier() == null : this.getModifier().equals(other.getModifier()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getVersion() == null ? other.getVersion() == null : this.getVersion().equals(other.getVersion()))
            && (this.getFeedbackTime() == null ? other.getFeedbackTime() == null : this.getFeedbackTime().equals(other.getFeedbackTime()))
            && (this.getDepartmentType() == null ? other.getDepartmentType() == null : this.getDepartmentType().equals(other.getDepartmentType()))
            && (this.getProcessingState() == null ? other.getProcessingState() == null : this.getProcessingState().equals(other.getProcessingState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getComplaintId() == null) ? 0 : getComplaintId().hashCode());
        result = prime * result + ((getComplaintPhone() == null) ? 0 : getComplaintPhone().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getComplaintBusiness() == null) ? 0 : getComplaintBusiness().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getComplaintChannel() == null) ? 0 : getComplaintChannel().hashCode());
        result = prime * result + ((getComplaintchannelInfo() == null) ? 0 : getComplaintchannelInfo().hashCode());
        result = prime * result + ((getProtocolId() == null) ? 0 : getProtocolId().hashCode());
        result = prime * result + ((getComplaintTheme() == null) ? 0 : getComplaintTheme().hashCode());
        result = prime * result + ((getComplaintType() == null) ? 0 : getComplaintType().hashCode());
        result = prime * result + ((getComplaintDetail() == null) ? 0 : getComplaintDetail().hashCode());
        result = prime * result + ((getEmergencyDegree() == null) ? 0 : getEmergencyDegree().hashCode());
        result = prime * result + ((getComplaintDate() == null) ? 0 : getComplaintDate().hashCode());
        result = prime * result + ((getAppointTime() == null) ? 0 : getAppointTime().hashCode());
        result = prime * result + ((getForwardprocessingDepartment() == null) ? 0 : getForwardprocessingDepartment().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifier() == null) ? 0 : getModifier().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getVersion() == null) ? 0 : getVersion().hashCode());
        result = prime * result + ((getFeedbackTime() == null) ? 0 : getFeedbackTime().hashCode());
        result = prime * result + ((getDepartmentType() == null) ? 0 : getDepartmentType().hashCode());
        result = prime * result + ((getProcessingState() == null) ? 0 : getProcessingState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", complaintId=").append(complaintId);
        sb.append(", complaintPhone=").append(complaintPhone);
        sb.append(", customerName=").append(customerName);
        sb.append(", complaintBusiness=").append(complaintBusiness);
        sb.append(", customerId=").append(customerId);
        sb.append(", complaintChannel=").append(complaintChannel);
        sb.append(", complaintchannelInfo=").append(complaintchannelInfo);
        sb.append(", protocolId=").append(protocolId);
        sb.append(", complaintTheme=").append(complaintTheme);
        sb.append(", complaintType=").append(complaintType);
        sb.append(", complaintDetail=").append(complaintDetail);
        sb.append(", emergencyDegree=").append(emergencyDegree);
        sb.append(", complaintDate=").append(complaintDate);
        sb.append(", appointTime=").append(appointTime);
        sb.append(", forwardprocessingDepartment=").append(forwardprocessingDepartment);
        sb.append(", creater=").append(creater);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", version=").append(version);
        sb.append(", feedbackTime=").append(feedbackTime);
        sb.append(", departmentType=").append(departmentType);
        sb.append(", processingState=").append(processingState);
       // sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}