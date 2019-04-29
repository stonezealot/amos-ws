package com.epb.ah.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.ah.entity.PpcardLog;

public interface PpcardLogRepository
		extends JpaRepository<PpcardLog, BigDecimal> {

	List<PpcardLog> findByPpIdAndOrgIdOrderBySrcDocDateDesc(String PpId, String orgId);

}
