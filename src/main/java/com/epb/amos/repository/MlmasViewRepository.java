package com.epb.amos.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.epb.amos.entity.MlmasView;

public interface MlmasViewRepository
		extends JpaRepository<MlmasView, BigDecimal> {

	@Query("select m from MlmasView m where "
			+ "(upper(vslName) like %?1% or upper(suppName) like %?1% or upper(itemRef) like %?1% or upper(description) like %?1% or upper(remark) like %?1% or upper(awbNo) like %?1% or upper(docId) like %?1%) "
			+ "and ((upper(statusFlg) like ?2 or upper(landedItem) = ?2) and statusFlg != 'CANCEL') "
			+ "and ((docDate >= to_date(?3,'yyyy-mm-dd') and docDate <= to_date(?4,'yyyy-mm-dd')) or (stockDate >= to_date(?3,'yyyy-mm-dd') and stockDate <= to_date(?4,'yyyy-mm-dd'))) "
			+ "and (suppName is not null and upper(suppName) like ?5) "
			+ "and (awbNo is not null and upper(awbNo) like ?6) "
			+ "order by vslName,custName,stockDate,landedItem")
	Page<MlmasView> findMlmasView(
			String searchInput, 
			String statusFlg, 
			String fromDateString,
			String toDateString,
			String suppName,
			String awbNo,
			final Pageable pageable);
	
	@Query("select m from MlmasView m where "
			+ "(upper(vslName) like %?1% or upper(suppName) like %?1% or upper(itemRef) like %?1% or upper(description) like %?1% or upper(remark) like %?1% or upper(awbNo) like %?1% or upper(docId) like %?1%) "
			+ "and ((upper(statusFlg) like ?2 or upper(landedItem) = ?2) and statusFlg != 'CANCEL') "
			+ "and ((docDate >= to_date(?3,'yyyy-mm-dd') and docDate <= to_date(?4,'yyyy-mm-dd')) or (stockDate >= to_date(?3,'yyyy-mm-dd') and stockDate <= to_date(?4,'yyyy-mm-dd'))) "
			+ "and (suppName is not null and upper(suppName) like ?5) "
			+ "and (awbNo is not null and upper(awbNo) like ?6) "
			+ "and custId = ?7 "
			+ "order by vslName,custName,stockDate,landedItem")
	Page<MlmasView> findMlmasViewWithCust(
			String searchInput, 
			String statusFlg, 
			String fromDateString,
			String toDateString,
			String suppName,
			String awbNo,
			String custId,
			final Pageable pageable);
	
	@Query("select m from MlmasView m where (upper(vslName) like %?1% or upper(suppName) like %?1% or upper(itemRef) like %?1% or upper(description) like %?1% "
			+ "or upper(remark) like %?1% or upper(awbNo) like %?1% or upper(docId) like %?1%) and (upper(statusFlg) like %?2% or upper(landedItem) like %?2%) and statusFlg != 'CANCEL' "
			+ "and ((docDate >= to_date(?3,'yyyy-mm-dd') and docDate <= to_date(?4,'yyyy-mm-dd')) or (stockDate >= to_date(?3,'yyyy-mm-dd') and stockDate <= to_date(?4,'yyyy-mm-dd'))) "
			+ "and nvl(upper(suppName),'ZXC') like %?5% and nvl(upper(awbNo),'ZXC') like %?6% order by vslName,custName,stockDate,landedItem")
	List<MlmasView> findMlmasView(
			String searchInput, 
			String statusFlg, 
			String fromDateString,
			String toDateString,
			String suppName,
			String awbNo);
	
	@Query("select m from MlmasView m where (upper(vslName) like %?1% or upper(suppName) like %?1% or upper(itemRef) like %?1% or upper(description) like %?1% "
			+ "or upper(remark) like %?1% or upper(awbNo) like %?1% or upper(docId) like %?1%) and (upper(statusFlg) like %?2% or upper(landedItem) like %?2%) and statusFlg != 'CANCEL' "
			+ "and ((docDate >= to_date(?3,'yyyy-mm-dd') and docDate <= to_date(?4,'yyyy-mm-dd')) or (stockDate >= to_date(?3,'yyyy-mm-dd') and stockDate <= to_date(?4,'yyyy-mm-dd'))) "
			+ "and nvl(upper(suppName),'ZXC') like %?5% and nvl(upper(awbNo),'ZXC') like %?6% and custId = ?7 order by vslName,custName,stockDate,landedItem")
	List<MlmasView> findMlmasViewWithCust(
			String searchInput, 
			String statusFlg, 
			String fromDateString,
			String toDateString,
			String suppName,
			String awbNo,
			String custId);
	
	@Query("select m from MlmasView m where ((docDate >= to_date(?1,'yyyy-mm-dd') and docDate <= to_date(?2,'yyyy-mm-dd')) or (stockDate >= to_date(?1,'yyyy-mm-dd') and stockDate <= to_date(?2,'yyyy-mm-dd'))) "
			+ "order by vslName,custName,stockDate,landedItem")
	List<MlmasView> findMlmasViewWithDate(
			String fromDateString,
			String toDateString);

}
