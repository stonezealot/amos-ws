package com.epb.ah.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ecstk {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String stkId;
	private String name;
	private BigDecimal listPrice;
	private BigDecimal netPrice;
	private String ref1;
	private String refFlg1;
	private BigDecimal refPrice1;
	private String skuLabel;
	private String priceLabel;
	private String urlAddr;
	private String brandName;
	private Character b2bFlg;
	private String ref8;
	private BigDecimal ewallet;

	public Ecstk() {
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

	public BigDecimal getListPrice() {
		return listPrice;
	}

	public void setListPrice(BigDecimal listPrice) {
		this.listPrice = listPrice;
	}

	public BigDecimal getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
	}

	public String getRef1() {
		return ref1;
	}

	public void setRef1(String ref1) {
		this.ref1 = ref1;
	}

	public String getRefFlg1() {
		return refFlg1;
	}

	public void setRefFlg1(String refFlg1) {
		this.refFlg1 = refFlg1;
	}

	public BigDecimal getRefPrice1() {
		return refPrice1;
	}

	public void setRefPrice1(BigDecimal refPrice1) {
		this.refPrice1 = refPrice1;
	}

	public String getSkuLabel() {
		return skuLabel;
	}

	public void setSkuLabel(String skuLabel) {
		this.skuLabel = skuLabel;
	}

	public String getPriceLabel() {
		return priceLabel;
	}

	public void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}

	public String getUrlAddr() {
		return urlAddr;
	}

	public void setUrlAddr(String urlAddr) {
		this.urlAddr = urlAddr;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Character getB2bFlg() {
		return b2bFlg;
	}

	public void setB2bFlg(Character b2bFlg) {
		this.b2bFlg = b2bFlg;
	}

	public String getRef8() {
		return ref8;
	}

	public void setRef8(String ref8) {
		this.ref8 = ref8;
	}

	public BigDecimal getEwallet() {
		return ewallet;
	}

	public void setEwallet(BigDecimal ewallet) {
		this.ewallet = ewallet;
	}

}
