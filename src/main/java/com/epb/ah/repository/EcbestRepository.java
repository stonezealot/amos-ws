package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.Ecbest;

public interface EcbestRepository
		extends JpaRepository<Ecbest, BigDecimal> {

	List<Ecbest> findByStatusFlgAndOrgId(final Character statusFlg, final String orgId);

}
