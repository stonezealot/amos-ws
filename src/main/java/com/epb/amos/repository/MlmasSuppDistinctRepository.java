package com.epb.amos.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.amos.entity.MlmasSuppDistinct;

public interface MlmasSuppDistinctRepository
		extends JpaRepository<MlmasSuppDistinct, BigDecimal> {

	List<MlmasSuppDistinct> findByCustId(String custId);

}
