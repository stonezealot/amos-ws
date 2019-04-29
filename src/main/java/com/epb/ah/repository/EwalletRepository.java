package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.Ewallet;

public interface EwalletRepository
		extends JpaRepository<Ewallet, BigDecimal> {

	List<Ewallet> findByOrgIdAndCustId(String orgId, String custId);
}
