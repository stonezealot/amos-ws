package com.epb.ah.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EcbookmarkView {

	@Id
	private BigDecimal recKey;
	private BigDecimal stkRecKey;
	private String orgId;
	private String custId;
	private String ecshopId;
	private String stkId;
	private String name;
	private BigDecimal netPrice;
	private Date createDate;

	public EcbookmarkView() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public BigDecimal getStkRecKey() {
		return stkRecKey;
	}

	public void setStkRecKey(BigDecimal stkRecKey) {
		this.stkRecKey = stkRecKey;
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

	public String getEcshopId() {
		return ecshopId;
	}

	public void setEcshopId(String ecshopId) {
		this.ecshopId = ecshopId;
	}

	public String getStkId() {
		return stkId;
	}

	public void setStkId(String stkId) {
		this.stkId = stkId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
