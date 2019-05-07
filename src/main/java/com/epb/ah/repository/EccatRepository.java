package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.Eccat;

public interface EccatRepository
		extends JpaRepository<Eccat, BigDecimal> {

	List<Eccat> findByOrgIdOrderBySortNum(final String orgId);
}
