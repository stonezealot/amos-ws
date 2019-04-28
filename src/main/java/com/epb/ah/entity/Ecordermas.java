package com.epb.ah.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ecordermas {

	@Id
	private BigDecimal recKey;
	private String docId;
	private Date docDate;
	private BigDecimal totalQty;
	private BigDecimal grantTotal;
	private BigDecimal totalTax;
	private Character statusFlg;
	private String vipId;
	private String ecshopId;

	public Ecordermas() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public Date getDocDate() {
		return docDate;
	}

	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}

	public BigDecimal getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(BigDecimal totalQty) {
		this.totalQty = totalQty;
	}

	public BigDecimal getGrantTotal() {
		return grantTotal;
	}

	public void setGrantTotal(BigDecimal grantTotal) {
		this.grantTotal = grantTotal;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public Character getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(Character statusFlg) {
		this.statusFlg = statusFlg;
	}

	public String getVipId() {
		return vipId;
	}

	public void setVipId(String vipId) {
		this.vipId = vipId;
	}

	public String getEcshopId() {
		return ecshopId;
	}

	public void setEcshopId(String ecshopId) {
		this.ecshopId = ecshopId;
	}

}
