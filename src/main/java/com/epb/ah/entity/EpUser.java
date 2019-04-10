package com.epb.ah.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EpUser {

	@Id
	private BigDecimal recKey;
	private String userId;
	@JsonIgnore
	private String userPwd;
	private String name;
	@JsonIgnore
	private Character statusFlg;
	private Character adminFlg;
	private String empId;

	public EpUser() {
		super();
	}

	public BigDecimal getRecKey() {
		return recKey;
	}

	public void setRecKey(BigDecimal recKey) {
		this.recKey = recKey;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getStatusFlg() {
		return statusFlg;
	}

	public void setStatusFlg(Character statusFlg) {
		this.statusFlg = statusFlg;
	}

	public Character getAdminFlg() {
		return adminFlg;
	}

	public void setAdminFlg(Character adminFlg) {
		this.adminFlg = adminFlg;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

}
