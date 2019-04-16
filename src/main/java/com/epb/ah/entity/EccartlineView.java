package com.epb.ah.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EccartlineView {

	@Id
	private BigDecimal recKey;
	private String custId;
	private String ecshopId;
	private Character cashcarry;
	private String stkId;
	private String name;
	private String model;
	private BigDecimal uomQty;
	private String uom;
	private BigDecimal uomRatio;
	private BigDecimal stkQty;
	private String uomId;
	private BigDecimal netPrice;
	private BigDecimal lineTotal;
	private String remark;
	private String urlAddr;
	private Character b2bFlg;
	private Character installationFlg;
	private String cat6_id;
	private String cat6_name;
	private String ref8;

	public EccartlineView() {
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

	public String getEcshopId() {
		return ecshopId;
	}

	public void setEcshopId(String ecshopId) {
		this.ecshopId = ecshopId;
	}

	public Character getCashcarry() {
		return cashcarry;
	}

	public void setCashcarry(Character cashcarry) {
		this.cashcarry = cashcarry;
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public BigDecimal getUomQty() {
		return uomQty;
	}

	public void setUomQty(BigDecimal uomQty) {
		this.uomQty = uomQty;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public BigDecimal getUomRatio() {
		return uomRatio;
	}

	public void setUomRatio(BigDecimal uomRatio) {
		this.uomRatio = uomRatio;
	}

	public BigDecimal getStkQty() {
		return stkQty;
	}

	public void setStkQty(BigDecimal stkQty) {
		this.stkQty = stkQty;
	}

	public String getUomId() {
		return uomId;
	}

	public void setUomId(String uomId) {
		this.uomId = uomId;
	}

	public BigDecimal getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(BigDecimal netPrice) {
		this.netPrice = netPrice;
	}

	public BigDecimal getLineTotal() {
		return lineTotal;
	}

	public void setLineTotal(BigDecimal lineTotal) {
		this.lineTotal = lineTotal;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUrlAddr() {
		return urlAddr;
	}

	public void setUrlAddr(String urlAddr) {
		this.urlAddr = urlAddr;
	}

	public Character getB2bFlg() {
		return b2bFlg;
	}

	public void setB2bFlg(Character b2bFlg) {
		this.b2bFlg = b2bFlg;
	}

	public Character getInstallationFlg() {
		return installationFlg;
	}

	public void setInstallationFlg(Character installationFlg) {
		this.installationFlg = installationFlg;
	}

	public String getCat6_id() {
		return cat6_id;
	}

	public void setCat6_id(String cat6_id) {
		this.cat6_id = cat6_id;
	}

	public String getCat6_name() {
		return cat6_name;
	}

	public void setCat6_name(String cat6_name) {
		this.cat6_name = cat6_name;
	}

	public String getRef8() {
		return ref8;
	}

	public void setRef8(String ref8) {
		this.ref8 = ref8;
	}

}
