package com.epb.amos.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MlmasView {

	@Id
	private BigDecimal recKey;
	private BigDecimal mlmasRecKey;
	private BigDecimal mlbarcodeRecKey;
	private String orgId;
	private String locId;
	private String docId;
	private Date docDate;
	private String statusFlg;
	private Date stockDate;
	private String userId;
	private String vslId;
	private String vslName;
	private String custId;
	private String custName;
	private String custAddress1;
	private String custAddress2;
	private String custAddress3;
	private String custAddress4;
	private String custCityId;
	private String custStateId;
	private String custCountryId;
	private String custPostalcode;
	private String custPhone;
	private String custFax;
	private String custEmailAddr;
	private BigDecimal pkgNum;
	private String pkgUom;
	private BigDecimal pkgWt;
	private String arrColFlg;
	private String arrColBy;
	private String transportId;
	private String transportName;
	private String awbNo;
	private String permitNo;
	private String description;
	private String landedItem;
	private String prnSpec;
	private String mllocId;
	private BigDecimal shipAmt;
	private String itemRef;
	private String remark;
	private String suppId;
	private String suppName;
	private BigDecimal mldRecKey;
	private String mlBarcode;
	private String mlbarcodeRef1;
	private String mlbarcodeRef2;
	private String mlbarcodeRef3;
	private String mlbarcodeRef4;
	private String dimension;

	public MlmasView() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public BigDecimal getMlmasRecKey() {
		return mlmasRecKey;
	}

	public void setMlmasRecKey(BigDecimal mlmasRecKey) {
		this.mlmasRecKey = mlmasRecKey;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getLocId() {
		return locId;
	}

	public void setLocId(String locId) {
		this.locId = locId;
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

	public String getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}

	public Date getStockDate() {
		return stockDate;
	}

	public void setStockDate(Date stockDate) {
		this.stockDate = stockDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVslId() {
		return vslId;
	}

	public void setVslId(String vslId) {
		this.vslId = vslId;
	}

	public String getVslName() {
		return vslName;
	}

	public void setVslName(String vslName) {
		this.vslName = vslName;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress1() {
		return custAddress1;
	}

	public void setCustAddress1(String custAddress1) {
		this.custAddress1 = custAddress1;
	}

	public String getCustAddress2() {
		return custAddress2;
	}

	public void setCustAddress2(String custAddress2) {
		this.custAddress2 = custAddress2;
	}

	public String getCustAddress3() {
		return custAddress3;
	}

	public void setCustAddress3(String custAddress3) {
		this.custAddress3 = custAddress3;
	}

	public String getCustAddress4() {
		return custAddress4;
	}

	public void setCustAddress4(String custAddress4) {
		this.custAddress4 = custAddress4;
	}

	public String getCustCityId() {
		return custCityId;
	}

	public void setCustCityId(String custCityId) {
		this.custCityId = custCityId;
	}

	public String getCustStateId() {
		return custStateId;
	}

	public void setCustStateId(String custStateId) {
		this.custStateId = custStateId;
	}

	public String getCustCountryId() {
		return custCountryId;
	}

	public void setCustCountryId(String custCountryId) {
		this.custCountryId = custCountryId;
	}

	public String getCustPostalcode() {
		return custPostalcode;
	}

	public void setCustPostalcode(String custPostalcode) {
		this.custPostalcode = custPostalcode;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustFax() {
		return custFax;
	}

	public void setCustFax(String custFax) {
		this.custFax = custFax;
	}

	public String getCustEmailAddr() {
		return custEmailAddr;
	}

	public void setCustEmailAddr(String custEmailAddr) {
		this.custEmailAddr = custEmailAddr;
	}

	public BigDecimal getPkgNum() {
		return pkgNum;
	}

	public void setPkgNum(BigDecimal pkgNum) {
		this.pkgNum = pkgNum;
	}

	public String getPkgUom() {
		return pkgUom;
	}

	public void setPkgUom(String pkgUom) {
		this.pkgUom = pkgUom;
	}

	public BigDecimal getPkgWt() {
		return pkgWt;
	}

	public void setPkgWt(BigDecimal pkgWt) {
		this.pkgWt = pkgWt;
	}

	public String getArrColFlg() {
		return arrColFlg;
	}

	public void setArrColFlg(String arrColFlg) {
		this.arrColFlg = arrColFlg;
	}

	public String getArrColBy() {
		return arrColBy;
	}

	public void setArrColBy(String arrColBy) {
		this.arrColBy = arrColBy;
	}

	public String getTransportId() {
		return transportId;
	}

	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}

	public String getTransportName() {
		return transportName;
	}

	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}

	public String getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(String awbNo) {
		this.awbNo = awbNo;
	}

	public String getPermitNo() {
		return permitNo;
	}

	public void setPermitNo(String permitNo) {
		this.permitNo = permitNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLandedItem() {
		return landedItem;
	}

	public void setLandedItem(String landedItem) {
		this.landedItem = landedItem;
	}

	public String getPrnSpec() {
		return prnSpec;
	}

	public void setPrnSpec(String prnSpec) {
		this.prnSpec = prnSpec;
	}

	public String getMllocId() {
		return mllocId;
	}

	public void setMllocId(String mllocId) {
		this.mllocId = mllocId;
	}

	public BigDecimal getShipAmt() {
		return shipAmt;
	}

	public void setShipAmt(BigDecimal shipAmt) {
		this.shipAmt = shipAmt;
	}

	public String getItemRef() {
		return itemRef;
	}

	public void setItemRef(String itemRef) {
		this.itemRef = itemRef;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public BigDecimal getMlbarcodeRecKey() {
		return mlbarcodeRecKey;
	}

	public void setMlbarcodeRecKey(BigDecimal mlbarcodeRecKey) {
		this.mlbarcodeRecKey = mlbarcodeRecKey;
	}

	public String getMlBarcode() {
		return mlBarcode;
	}

	public void setMlBarcode(String mlBarcode) {
		this.mlBarcode = mlBarcode;
	}

	public String getMlbarcodeRef1() {
		return mlbarcodeRef1;
	}

	public void setMlbarcodeRef1(String mlbarcodeRef1) {
		this.mlbarcodeRef1 = mlbarcodeRef1;
	}

	public String getMlbarcodeRef2() {
		return mlbarcodeRef2;
	}

	public void setMlbarcodeRef2(String mlbarcodeRef2) {
		this.mlbarcodeRef2 = mlbarcodeRef2;
	}

	public String getMlbarcodeRef3() {
		return mlbarcodeRef3;
	}

	public void setMlbarcodeRef3(String mlbarcodeRef3) {
		this.mlbarcodeRef3 = mlbarcodeRef3;
	}

	public String getMlbarcodeRef4() {
		return mlbarcodeRef4;
	}

	public void setMlbarcodeRef4(String mlbarcodeRef4) {
		this.mlbarcodeRef4 = mlbarcodeRef4;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public BigDecimal getMldRecKey() {
		return mldRecKey;
	}

	public void setMldRecKey(BigDecimal mldRecKey) {
		this.mldRecKey = mldRecKey;
	}

}
