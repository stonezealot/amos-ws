package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.EwalletDtl;

public interface EwalletDtlRepository
		extends JpaRepository<EwalletDtl, BigDecimal> {

	List<EwalletDtl> findByCustIdAndOrgIdOrderBySrcDocDateDesc(String custId, String orgId);

}
