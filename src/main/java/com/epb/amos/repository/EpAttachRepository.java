package com.epb.amos.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.amos.entity.EpAttach;

public interface EpAttachRepository
		extends JpaRepository<EpAttach, BigDecimal> {

	List<EpAttach> findBySrcRecKeyOrderByName(BigDecimal srcRecKey);

}
