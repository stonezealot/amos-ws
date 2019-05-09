package com.epb.ah.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ecbanner {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String bannerId;
	private String name;
	private String subTitle1;
	private String subTitle2;
	private String subTitle3;
	private String urlAddr;
	private String iconAddr;
	private String httpUrl;
	private String remark;
	private String paraValue1;
	private String paraType1;
	private String paraValue2;
	private String paraType2;

	public Ecbanner() {
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

	public String getBannerId() {
		return bannerId;
	}

	public void setBannerId(String bannerId) {
		this.bannerId = bannerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubTitle1() {
		return subTitle1;
	}

	public void setSubTitle1(String subTitle1) {
		this.subTitle1 = subTitle1;
	}

	public String getSubTitle2() {
		return subTitle2;
	}

	public void setSubTitle2(String subTitle2) {
		this.subTitle2 = subTitle2;
	}

	public String getSubTitle3() {
		return subTitle3;
	}

	public void setSubTitle3(String subTitle3) {
		this.subTitle3 = subTitle3;
	}

	public String getUrlAddr() {
		return urlAddr;
	}

	public void setUrlAddr(String urlAddr) {
		this.urlAddr = urlAddr;
	}

	public String getIconAddr() {
		return iconAddr;
	}

	public void setIconAddr(String iconAddr) {
		this.iconAddr = iconAddr;
	}

	public String getHttpUrl() {
		return httpUrl;
	}

	public void setHttpUrl(String httpUrl) {
		this.httpUrl = httpUrl;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getParaValue1() {
		return paraValue1;
	}

	public void setParaValue1(String paraValue1) {
		this.paraValue1 = paraValue1;
	}

	public String getParaType1() {
		return paraType1;
	}

	public void setParaType1(String paraType1) {
		this.paraType1 = paraType1;
	}

	public String getParaValue2() {
		return paraValue2;
	}

	public void setParaValue2(String paraValue2) {
		this.paraValue2 = paraValue2;
	}

	public String getParaType2() {
		return paraType2;
	}

	public void setParaType2(String paraType2) {
		this.paraType2 = paraType2;
	}

}
