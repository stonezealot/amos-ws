package com.epb.ah.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String custId;
	private String name;
	private String nameLang;
	private String attnTo;
	private String currId;
	private String taxRef;
	private String taxId;
	private Character taxFlg;
	private String customergroupId;
	private String customercatId;
	private String payId;
	private String termId;
	private BigDecimal creditLimit;
	private Character statusFlg;
	private Integer accCloseDay;
	private Character partialDlyFlg;
	private String address1;
	private String address2;
	private String emailAddr;
	private String remark;
	private String phone;
	private String postalcode;

	public Customer() {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameLang() {
		return nameLang;
	}

	public void setNameLang(String nameLang) {
		this.nameLang = nameLang;
	}

	public String getAttnTo() {
		return attnTo;
	}

	public void setAttnTo(String attnTo) {
		this.attnTo = attnTo;
	}

	public String getCurrId() {
		return currId;
	}

	public void setCurrId(String currId) {
		this.currId = currId;
	}

	public String getTaxRef() {
		return taxRef;
	}

	public void setTaxRef(String taxRef) {
		this.taxRef = taxRef;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public Character getTaxFlg() {
		return taxFlg;
	}

	public void setTaxFlg(Character taxFlg) {
		this.taxFlg = taxFlg;
	}

	public String getCustomergroupId() {
		return customergroupId;
	}

	public void setCustomergroupId(String customergroupId) {
		this.customergroupId = customergroupId;
	}

	public String getCustomercatId() {
		return customercatId;
	}

	public void setCustomercatId(String customercatId) {
		this.customercatId = customercatId;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getTermId() {
		return termId;
	}

	public void setTermId(String termId) {
		this.termId = termId;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Character getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(Character statusFlg) {
		this.statusFlg = statusFlg;
	}

	public Integer getAccCloseDay() {
		return accCloseDay;
	}

	public void setAccCloseDay(Integer accCloseDay) {
		this.accCloseDay = accCloseDay;
	}

	public Character getPartialDlyFlg() {
		return partialDlyFlg;
	}

	public void setPartialDlyFlg(Character partialDlyFlg) {
		this.partialDlyFlg = partialDlyFlg;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

}
