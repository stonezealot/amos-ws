package com.epb.ah.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ewallet {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String custId;
	private BigDecimal ewalletAmt;

	public Ewallet() {
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

	public BigDecimal getEwalletAmt() {
		return ewalletAmt;
	}

	public void setEwalletAmt(BigDecimal ewalletAmt) {
		this.ewalletAmt = ewalletAmt;
	}

}
