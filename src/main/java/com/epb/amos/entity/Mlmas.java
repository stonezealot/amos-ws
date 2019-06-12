package com.epb.amos.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mlmas {

	@Id
	private BigDecimal recKey;
	private String suppId;
	private String suppName;
//	private String statusFlg;
	private String custId;

	public Mlmas() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getSuppId() {
		return suppId;
	}

	public void setSuppId(String suppId) {
		this.suppId = suppId;
	}

	public String getSuppName() {
		return suppName;
	}

	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}

//	public String getStatusFlg() {
//		return statusFlg;
//	}
//
//	public void setStatusFlg(String statusFlg) {
//		this.statusFlg = statusFlg;
//	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

}
