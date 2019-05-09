package com.epb.ah.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ecbest {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String ecbestId;
	private String name;
	private String urlAddr;
	private Character positionFlg;
	private String subTitle1;
	private String subTitle2;
	private String subTitle3;
	private String httpUrl;
	private Character statusFlg;
	private BigDecimal sortNum;

	public Ecbest() {
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

	public String getEcbestId() {
		return ecbestId;
	}

	public void setEcbestId(String ecbestId) {
		this.ecbestId = ecbestId;
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

	public Character getPositionFlg() {
		return positionFlg;
	}

	public void setPositionFlg(Character positionFlg) {
		this.positionFlg = positionFlg;
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

	public String getHttpUrl() {
		return httpUrl;
	}

	public void setHttpUrl(String httpUrl) {
		this.httpUrl = httpUrl;
	}

	public Character getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(Character statusFlg) {
		this.statusFlg = statusFlg;
	}

	public BigDecimal getSortNum() {
		return sortNum;
	}

	public void setSortNum(BigDecimal sortNum) {
		this.sortNum = sortNum;
	}

}
