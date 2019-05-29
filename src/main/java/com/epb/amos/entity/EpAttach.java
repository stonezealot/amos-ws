package com.epb.amos.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EpAttach {

	@Id
	private BigDecimal recKey;
	private String timeStamp;
	private String srcOrgId;
	private String srcLocId;
	private String srcAppCode;
	private BigDecimal srcRecKey;
	private String srcDocId;
	private String fileName;
	private String fileId;
	private String name;
	private String doctypeId;
	private String accId;
	private String accName;
	private String stkId;
	private String projId;
	private String wfId;
	private String nodeId;
	private String taskId;
	private String ftpFileName;
	private Date createDate;
	private String createUserId;
	private Date lastupdate;
	private String lastupdateUserId;
	private BigDecimal srcLineRecKey;

	public EpAttach() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getSrcOrgId() {
		return srcOrgId;
	}

	public void setSrcOrgId(String srcOrgId) {
		this.srcOrgId = srcOrgId;
	}

	public String getSrcLocId() {
		return srcLocId;
	}

	public void setSrcLocId(String srcLocId) {
		this.srcLocId = srcLocId;
	}

	public String getSrcAppCode() {
		return srcAppCode;
	}

	public void setSrcAppCode(String srcAppCode) {
		this.srcAppCode = srcAppCode;
	}

	public BigDecimal getSrcRecKey() {
		return srcRecKey;
	}

	public void setSrcRecKey(BigDecimal srcRecKey) {
		this.srcRecKey = srcRecKey;
	}

	public String getSrcDocId() {
		return srcDocId;
	}

	public void setSrcDocId(String srcDocId) {
		this.srcDocId = srcDocId;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoctypeId() {
		return doctypeId;
	}

	public void setDoctypeId(String doctypeId) {
		this.doctypeId = doctypeId;
	}

	public String getAccId() {
		return accId;
	}

	public void setAccId(String accId) {
		this.accId = accId;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getStkId() {
		return stkId;
	}

	public void setStkId(String stkId) {
		this.stkId = stkId;
	}

	public String getProjId() {
		return projId;
	}

	public void setProjId(String projId) {
		this.projId = projId;
	}

	public String getWfId() {
		return wfId;
	}

	public void setWfId(String wfId) {
		this.wfId = wfId;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getFtpFileName() {
		return ftpFileName;
	}

	public void setFtpFileName(String ftpFileName) {
		this.ftpFileName = ftpFileName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getLastupdate() {
		return lastupdate;
	}

	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}

	public String getLastupdateUserId() {
		return lastupdateUserId;
	}

	public void setLastupdateUserId(String lastupdateUserId) {
		this.lastupdateUserId = lastupdateUserId;
	}

	public BigDecimal getSrcLineRecKey() {
		return srcLineRecKey;
	}

	public void setSrcLineRecKey(BigDecimal srcLineRecKey) {
		this.srcLineRecKey = srcLineRecKey;
	}

}
