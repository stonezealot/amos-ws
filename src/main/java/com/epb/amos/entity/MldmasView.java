package com.epb.amos.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MldmasView {

	@Id
	private BigDecimal recKey;
	private String custId;
	private Date docDate;
	private String destination;
	private String vslName;
	private String shipName;
	private String marking;
	private String custName;
	private String statusFlg;
	private String permitNo;
	private BigDecimal totalPkgNum;
	private BigDecimal totalPkgWt;
	private String awbNo;
	private String carrier;
	private String consName;
	private Date eta;
	private Date etd;
	private String packAs;
	private String consAddress1;
	private String consAddress2;
	private String consAddress3;
	private String consAddress4;
	private String consCityId;
	private String consPostalcode;
	private String consCountryId;
	private String consPhone;
	private String consFax;
	private String consEmailAddr;
	private String consStateId;
	private String vslId;
	private String docId;

	public MldmasView() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public Date getDocDate() {
		return docDate;
	}

	public void setDocDate(Date docDate) {
		this.docDate = docDate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getVslName() {
		return vslName;
	}

	public void setVslName(String vslName) {
		this.vslName = vslName;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getMarking() {
		return marking;
	}

	public void setMarking(String marking) {
		this.marking = marking;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}

	public String getPermitNo() {
		return permitNo;
	}

	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	public BigDecimal getTotalPkgNum() {
		return totalPkgNum;
	}

	public void setTotalPkgNum(BigDecimal totalPkgNum) {
		this.totalPkgNum = totalPkgNum;
	}

	public BigDecimal getTotalPkgWt() {
		return totalPkgWt;
	}

	public void setTotalPkgWt(BigDecimal totalPkgWt) {
		this.totalPkgWt = totalPkgWt;
	}

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getConsName() {
		return consName;
	}

	public void setConsName(String consName) {
		this.consName = consName;
	}

	public Date getEta() {
		return eta;
	}

	public void setEta(Date eta) {
		this.eta = eta;
	}

	public Date getEtd() {
		return etd;
	}

	public void setEtd(Date etd) {
		this.etd = etd;
	}

	public String getPackAs() {
		return packAs;
	}

	public void setPackAs(String packAs) {
		this.packAs = packAs;
	}

	public String getConsAddress1() {
		return consAddress1;
	}

	public void setConsAddress1(String consAddress1) {
		this.consAddress1 = consAddress1;
	}

	public String getConsAddress2() {
		return consAddress2;
	}

	public void setConsAddress2(String consAddress2) {
		this.consAddress2 = consAddress2;
	}

	public String getConsAddress3() {
		return consAddress3;
	}

	public void setConsAddress3(String consAddress3) {
		this.consAddress3 = consAddress3;
	}

	public String getConsAddress4() {
		return consAddress4;
	}

	public void setConsAddress4(String consAddress4) {
		this.consAddress4 = consAddress4;
	}

	public String getConsCityId() {
		return consCityId;
	}

	public void setConsCityId(String consCityId) {
		this.consCityId = consCityId;
	}

	public String getConsPostalcode() {
		return consPostalcode;
	}

	public void setConsPostalcode(String consPostalcode) {
		this.consPostalcode = consPostalcode;
	}

	public String getConsCountryId() {
		return consCountryId;
	}

	public void setConsCountryId(String consCountryId) {
		this.consCountryId = consCountryId;
	}

	public String getConsPhone() {
		return consPhone;
	}

	public void setConsPhone(String consPhone) {
		this.consPhone = consPhone;
	}

	public String getConsFax() {
		return consFax;
	}

	public void setConsFax(String consFax) {
		this.consFax = consFax;
	}

	public String getConsEmailAddr() {
		return consEmailAddr;
	}

	public void setConsEmailAddr(String consEmailAddr) {
		this.consEmailAddr = consEmailAddr;
	}

	public String getConsStateId() {
		return consStateId;
	}

	public void setConsStateId(String consStateId) {
		this.consStateId = consStateId;
	}

	public String getVslId() {
		return vslId;
	}

	public void setVslId(String vslId) {
		this.vslId = vslId;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

}
