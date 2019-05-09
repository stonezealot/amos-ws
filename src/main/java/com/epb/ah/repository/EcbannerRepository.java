package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.Ecbanner;

public interface EcbannerRepository
		extends JpaRepository<Ecbanner, BigDecimal> {

	List<Ecbanner> findByOrgIdOrderByBannerId(final String orgId);

}
