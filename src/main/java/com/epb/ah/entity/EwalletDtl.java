package com.epb.ah.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EwalletDtl {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String custId;
	private Character type;
	private BigDecimal ewalletAmt;
	private Date srcDocDate;
	private String srcDocId;

	public EwalletDtl() {
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

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public Character getType() {
		return type;
	}

	public void setType(Character type) {
		this.type = type;
	}

	public BigDecimal getEwalletAmt() {
		return ewalletAmt;
	}

	public void setEwalletAmt(BigDecimal ewalletAmt) {
		this.ewalletAmt = ewalletAmt;
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
