package com.epb.amos.repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epb.amos.entity.MldmasView;

public interface MldmasViewRepository
		extends JpaRepository<MldmasView, BigDecimal> {

	@Query("select m from MldmasView m where exists ( select 1 from Mldline where masRecKey = m.recKey and srcRecKey = ?1)")
	List<MldmasView> findMldmasView(BigDecimal srcRecKey);

	Optional<MldmasView> findByRecKey(BigDecimal recKey);

}
