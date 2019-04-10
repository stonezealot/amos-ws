package com.epb.ah.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Opentable {

	@Id
	private BigDecimal recKey;
	private String orgId;
	private String shopId;
	private String sectionId;
	private String tableId;
	private Character statusFlg;
	private Character splitFlg;
	private BigInteger pax;
	private String vipId;
	private String vipName;
	private String vipPhone;
	private String classId;
	private Date seatTime;
	private Date firstServeTime;
	private Date lastServeTime;
	private Date reserveTime;
	private BigDecimal totalItem;
	private BigDecimal serviceCharge;
	private String sourceId;
	private String refTableId;
	private Character hostFlg;
	private String remark;
	private Character sendFlg;
	private BigDecimal vipDisc;
	private BigDecimal vipPtsMoney;
	private BigDecimal cumPts;
	private BigDecimal beforeDisc;
	private BigDecimal totalDisc;
	private BigDecimal totalNet;
	private BigDecimal totalTax;
	private BigDecimal grandTotal;
	private BigDecimal payment;
	private BigDecimal roundAmt;
	private BigDecimal balance;
	private BigDecimal tender;
	private BigDecimal change;
	private String discId;
	private String cardNo;
	private BigDecimal tips;
	private String mergeTableId;
	private Character splitTableFlg;
	private Integer adhocItem;
	private BigDecimal sortNum;

	public Opentable() {
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

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public Character getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(Character statusFlg) {
		this.statusFlg = statusFlg;
	}

	public Character getSplitFlg() {
		return splitFlg;
	}

	public void setSplitFlg(Character splitFlg) {
		this.splitFlg = splitFlg;
	}

	public BigInteger getPax() {
		return pax;
	}

	public void setPax(BigInteger pax) {
		this.pax = pax;
	}

	public String getVipId() {
		return vipId;
	}

	public void setVipId(String vipId) {
		this.vipId = vipId;
	}

	public String getVipName() {
		return vipName;
	}

	public void setVipName(String vipName) {
		this.vipName = vipName;
	}

	public String getVipPhone() {
		return vipPhone;
	}

	public void setVipPhone(String vipPhone) {
		this.vipPhone = vipPhone;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public Date getSeatTime() {
		return seatTime;
	}

	public void setSeatTime(Date seatTime) {
		this.seatTime = seatTime;
	}

	public Date getFirstServeTime() {
		return firstServeTime;
	}

	public void setFirstServeTime(Date firstServeTime) {
		this.firstServeTime = firstServeTime;
	}

	public Date getLastServeTime() {
		return lastServeTime;
	}

	public void setLastServeTime(Date lastServeTime) {
		this.lastServeTime = lastServeTime;
	}

	public Date getReserveTime() {
		return reserveTime;
	}

	public void setReserveTime(Date reserveTime) {
		this.reserveTime = reserveTime;
	}

	public BigDecimal getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(BigDecimal totalItem) {
		this.totalItem = totalItem;
	}

	public BigDecimal getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(BigDecimal serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getRefTableId() {
		return refTableId;
	}

	public void setRefTableId(String refTableId) {
		this.refTableId = refTableId;
	}

	public Character getHostFlg() {
		return hostFlg;
	}

	public void setHostFlg(Character hostFlg) {
		this.hostFlg = hostFlg;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Character getSendFlg() {
		return sendFlg;
	}

	public void setSendFlg(Character sendFlg) {
		this.sendFlg = sendFlg;
	}

	public BigDecimal getVipDisc() {
		return vipDisc;
	}

	public void setVipDisc(BigDecimal vipDisc) {
		this.vipDisc = vipDisc;
	}

	public BigDecimal getVipPtsMoney() {
		return vipPtsMoney;
	}

	public void setVipPtsMoney(BigDecimal vipPtsMoney) {
		this.vipPtsMoney = vipPtsMoney;
	}

	public BigDecimal getCumPts() {
		return cumPts;
	}

	public void setCumPts(BigDecimal cumPts) {
		this.cumPts = cumPts;
	}

	public BigDecimal getBeforeDisc() {
		return beforeDisc;
	}

	public void setBeforeDisc(BigDecimal beforeDisc) {
		this.beforeDisc = beforeDisc;
	}

	public BigDecimal getTotalDisc() {
		return totalDisc;
	}

	public void setTotalDisc(BigDecimal totalDisc) {
		this.totalDisc = totalDisc;
	}

	public BigDecimal getTotalNet() {
		return totalNet;
	}

	public void setTotalNet(BigDecimal totalNet) {
		this.totalNet = totalNet;
	}

	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public BigDecimal getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}

	public BigDecimal getPayment() {
		return payment;
	}

	public void setPayment(BigDecimal payment) {
		this.payment = payment;
	}

	public BigDecimal getRoundAmt() {
		return roundAmt;
	}

	public void setRoundAmt(BigDecimal roundAmt) {
		this.roundAmt = roundAmt;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public BigDecimal getTender() {
		return tender;
	}

	public void setTender(BigDecimal tender) {
		this.tender = tender;
	}

	public BigDecimal getChange() {
		return change;
	}

	public void setChange(BigDecimal change) {
		this.change = change;
	}

	public String getDiscId() {
		return discId;
	}

	public void setDiscId(String discId) {
		this.discId = discId;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public BigDecimal getTips() {
		return tips;
	}

	public void setTips(BigDecimal tips) {
		this.tips = tips;
	}

	public String getMergeTableId() {
		return mergeTableId;
	}

	public void setMergeTableId(String mergeTableId) {
		this.mergeTableId = mergeTableId;
	}

	public Character getSplitTableFlg() {
		return splitTableFlg;
	}

	public void setSplitTableFlg(Character splitTableFlg) {
		this.splitTableFlg = splitTableFlg;
	}

	public Integer getAdhocItem() {
		return adhocItem;
	}

	public void setAdhocItem(Integer adhocItem) {
		this.adhocItem = adhocItem;
	}

	public BigDecimal getSortNum() {
		return sortNum;
	}

	public void setSortNum(BigDecimal sortNum) {
		this.sortNum = sortNum;
	}

}
