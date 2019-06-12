package com.epb.amos.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epb.amos.entity.Mlmas;

public interface MlmasRepository
		extends JpaRepository<Mlmas, BigDecimal> {

	List<Mlmas> findDistinctMlmasByCustId(String custId);

	@Query(value = "select distinct s.supp_name,s.supp_id,s.rec_key from Mlmas s where s.cust_id = 001", nativeQuery = true)

	public List<Mlmas> getMlmas();
	
}
