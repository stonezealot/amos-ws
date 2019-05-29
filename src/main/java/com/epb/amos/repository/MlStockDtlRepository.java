package com.epb.amos.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epb.amos.entity.MlStockDtl;

public interface MlStockDtlRepository
		extends JpaRepository<MlStockDtl, BigDecimal> {

	List<MlStockDtl> findByStkIdAndStoreIdOrderByRecKey(String stkId, String storeId);

}
