package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.Ppcard;

public interface PpcardRepository
		extends JpaRepository<Ppcard, BigDecimal> {

	List<Ppcard> findByPpIdAndOrgId(String ppId, String orgId);

}
