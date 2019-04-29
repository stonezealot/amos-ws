package com.epb.ah.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PpcardLog {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String ppId;
	private Character ppType;
	private BigDecimal ppAmt;
	private Date srcDocDate;
	private String srcDocId;

	public PpcardLog() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getPpId() {
		return ppId;
	}

	public void setPpId(String ppId) {
		this.ppId = ppId;
	}

	public Character getPpType() {
		return ppType;
	}

	public void setPpType(Character ppType) {
		this.ppType = ppType;
	}

	public BigDecimal getPpAmt() {
		return ppAmt;
	}

	public void setPpAmt(BigDecimal ppAmt) {
		this.ppAmt = ppAmt;
	}

	public Date getSrcDocDate() {
		return srcDocDate;
	}

	public void setSrcDocDate(Date srcDocDate) {
		this.srcDocDate = srcDocDate;
	}

	public String getSrcDocId() {
		return srcDocId;
	}

	public void setSrcDocId(String srcDocId) {
		this.srcDocId = srcDocId;
	}

}
