package com.epb.amos.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mlvessel {

	@Id
	private BigDecimal recKey;
	private String vslId;
	private String name;
	private String mlownerId;
	private String statusFlg;

	public Mlvessel() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getVslId() {
		return vslId;
	}

	public void setVslId(String vslId) {
		this.vslId = vslId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMlownerId() {
		return mlownerId;
	}

	public void setMlownerId(String mlownerId) {
		this.mlownerId = mlownerId;
	}

	public String getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(String statusFlg) {
		this.statusFlg = statusFlg;
	}

}
