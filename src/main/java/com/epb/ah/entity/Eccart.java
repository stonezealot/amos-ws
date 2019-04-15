package com.epb.ah.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Eccart {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String ecshopId;
	private String custId;
	private BigDecimal totalQty;
	private BigDecimal subTotal;
	private BigDecimal deliveryCharge;
	private BigDecimal installationCharge;
	private BigDecimal grandTotal;
	private BigDecimal evoucherGain;
	private BigDecimal maxUseVoucher;
	private BigDecimal evoucherRedeem;
	private String postalcode;
	private Character addressFlg;
	private String address1;
	private String address2;
	private String dlyZoneId;
	private String timeslotId;
	private Date dlyDate;
	private String dpostalcode;
	private String daddress1;
	private String daddress2;
	private String remark;
	private BigDecimal taxTotal;
	private String firstName;
	private String dmail;
	private String dphone;

	public Eccart() {
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

	public String getEcshopId() {
		return ecshopId;
	}

	public void setEcshopId(String ecshopId) {
		this.ecshopId = ecshopId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public BigDecimal getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(BigDecimal totalQty) {
		this.totalQty = totalQty;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(BigDecimal deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}

	public BigDecimal getInstallationCharge() {
		return installationCharge;
	}

	public void setInstallationCharge(BigDecimal installationCharge) {
		this.installationCharge = installationCharge;
	}

	public BigDecimal getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}

	public BigDecimal getEvoucherGain() {
		return evoucherGain;
	}

	public void setEvoucherGain(BigDecimal evoucherGain) {
		this.evoucherGain = evoucherGain;
	}

	public BigDecimal getMaxUseVoucher() {
		return maxUseVoucher;
	}

	public void setMaxUseVoucher(BigDecimal maxUseVoucher) {
		this.maxUseVoucher = maxUseVoucher;
	}

	public BigDecimal getEvoucherRedeem() {
		return evoucherRedeem;
	}

	public void setEvoucherRedeem(BigDecimal evoucherRedeem) {
		this.evoucherRedeem = evoucherRedeem;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public Character getAddressFlg() {
		return addressFlg;
	}

	public void setAddressFlg(Character addressFlg) {
		this.addressFlg = addressFlg;
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

	public String getDlyZoneId() {
		return dlyZoneId;
	}

	public void setDlyZoneId(String dlyZoneId) {
		this.dlyZoneId = dlyZoneId;
	}

	public String getTimeslotId() {
		return timeslotId;
	}

	public void setTimeslotId(String timeslotId) {
		this.timeslotId = timeslotId;
	}

	public Date getDlyDate() {
		return dlyDate;
	}

	public void setDlyDate(Date dlyDate) {
		this.dlyDate = dlyDate;
	}

	public String getDpostalcode() {
		return dpostalcode;
	}

	public void setDpostalcode(String dpostalcode) {
		this.dpostalcode = dpostalcode;
	}

	public String getDaddress1() {
		return daddress1;
	}

	public void setDaddress1(String daddress1) {
		this.daddress1 = daddress1;
	}

	public String getDaddress2() {
		return daddress2;
	}

	public void setDaddress2(String daddress2) {
		this.daddress2 = daddress2;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getTaxTotal() {
		return taxTotal;
	}

	public void setTaxTotal(BigDecimal taxTotal) {
		this.taxTotal = taxTotal;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDmail() {
		return dmail;
	}

	public void setDmail(String dmail) {
		this.dmail = dmail;
	}

	public String getDphone() {
		return dphone;
	}

	public void setDphone(String dphone) {
		this.dphone = dphone;
	}

}
