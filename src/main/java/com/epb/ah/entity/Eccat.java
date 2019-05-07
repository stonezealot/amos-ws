package com.epb.ah.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Eccat {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private BigDecimal sortNum;
	private String eccatId;
	private String name;
	private String urlAddr;

	public Eccat() {
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

	public BigDecimal getSortNum() {
		return sortNum;
	}

	public void setSortNum(BigDecimal sortNum) {
		this.sortNum = sortNum;
	}

	public String getEccatId() {
		return eccatId;
	}

	public void setEccatId(String eccatId) {
		this.eccatId = eccatId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrlAddr() {
		return urlAddr;
	}

	public void setUrlAddr(String urlAddr) {
		this.urlAddr = urlAddr;
	}

}
