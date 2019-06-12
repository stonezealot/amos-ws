package com.epb.amos.controller;

import java.math.BigDecimal;
import java.security.MessageDigest;
import java.time.format.DateTimeFormatter;

import java.util.List;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epb.amos.bean.MldmasViewInfo;
import com.epb.amos.bean.MlmasViewInfo;
import com.epb.amos.entity.EpAttach;
import com.epb.amos.entity.MlStockDtl;
import com.epb.amos.entity.MlStockSump;
import com.epb.amos.entity.MldmasView;
import com.epb.amos.entity.Mlmas;
import com.epb.amos.entity.MlmasDespatchView;
import com.epb.amos.entity.MlmasSuppDistinct;
import com.epb.amos.entity.MlmasView;
import com.epb.amos.entity.Mlvessel;
import com.epb.amos.repository.EpAttachRepository;
import com.epb.amos.repository.MlStockDtlRepository;
import com.epb.amos.repository.MlStockSumpRepository;
import com.epb.amos.repository.MldmasViewRepository;
import com.epb.amos.repository.MlmasDespatchViewRepository;
import com.epb.amos.repository.MlmasRepository;
import com.epb.amos.repository.MlmasSuppDistinctRepository;
import com.epb.amos.repository.MlmasViewRepository;
import com.epb.amos.repository.MlvesselRepository;
import com.epb.amos.service.ProcedureResponse;
import com.epb.amos.service.ProcedureService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AppController {

	//
	// request mappings
	//

	@GetMapping("/orders")
	public ResponseEntity<List<MlmasView>> getOrders(
			@RequestParam final String custId) {

		final MlmasView probe = new MlmasView();
		probe.setCustId(custId);

		final List<MlmasView> mlmasViews = this.mlmasViewRepository
				.findAll(
						Example.of(probe),
						Sort.by("vslName", "custName", "stockDate", "landedItem"));
		return ResponseEntity.ok(mlmasViews);
	}

	@GetMapping("/all-orders")
	public ResponseEntity<List<MlmasView>> getAllOrders() {

		final List<MlmasView> mlmasViews = this.mlmasViewRepository
				.findAll(Sort.by("vslName", "custName", "stockDate", "landedItem"));
		return ResponseEntity.ok(mlmasViews);
	}

	@GetMapping("/orders/{recKey}")
	public ResponseEntity<MlmasViewInfo> getOrderDetails(
			@PathVariable final BigDecimal recKey) {

		final Optional<MlmasView> mlmasView = this.mlmasViewRepository
				.findById(recKey);
		if (!mlmasView.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		final MlmasViewInfo mlmasViewInfo = new MlmasViewInfo(
				this.getMlmasViewFromJDBC(recKey));

		return ResponseEntity.ok(mlmasViewInfo);
	}

	@GetMapping("/orders-by-despatch-id")
	public ResponseEntity<List<MlmasDespatchView>> getOrdersByDespatchId(
			@RequestParam final BigDecimal despatchId) {

		final MlmasDespatchView probe = new MlmasDespatchView();
		probe.setMldRecKey(despatchId);

		final List<MlmasDespatchView> mlmasDespatchViews = this.mlmasDespatchViewRepository
				.findAll(
						Example.of(probe),
						Sort.by("vslName", "custName", "stockDate", "landedItem"));
		return ResponseEntity.ok(mlmasDespatchViews);
	}

	@GetMapping("/search-suppliers")
	public ResponseEntity<List<MlmasSuppDistinct>> searchSuppliers(
			@RequestParam final String custId) {
		
		final MlmasSuppDistinct probe = new MlmasSuppDistinct();
		probe.setCustId(custId);	
		
		final List<MlmasSuppDistinct> mlmasSuppDistincts = this.mlmasSuppDistinctRepository
				.findAll(
						Example.of(probe),
						Sort.by("suppName"));

		return ResponseEntity.ok(mlmasSuppDistincts);
	}
	
	@GetMapping("/search-all-suppliers")
	public ResponseEntity<List<MlmasSuppDistinct>> searchAllSuppliers() {
		
		final List<MlmasSuppDistinct> mlmasSuppDistincts = this.mlmasSuppDistinctRepository
				.findAll(Sort.by("suppName"));

		return ResponseEntity.ok(mlmasSuppDistincts);
	}
	
	@GetMapping("/search-vessels")
	public ResponseEntity<List<Mlvessel>> searchVessels() {
		
		final List<Mlvessel> mlvessels = this.mlvesselRepository
				.findAll(Sort.by("vslId"));

		return ResponseEntity.ok(mlvessels);
	}
	

	@GetMapping("/despatches")
	public ResponseEntity<List<MldmasView>> getDespatches(
			@RequestParam final String custId) {

		final MldmasView probe = new MldmasView();
		probe.setCustId(custId);

		final List<MldmasView> mldmasViews = this.mldmasViewRepository
				.findAll(
						Example.of(probe),
						Sort.by("vslName", "custName", "docDate"));
		return ResponseEntity.ok(mldmasViews);
	}

	@GetMapping("/all-despatches")
	public ResponseEntity<List<MldmasView>> getAllDespatches() {

		final List<MldmasView> mldmasViews = this.mldmasViewRepository
				.findAll(Sort.by("vslName", "custName", "docDate"));

		return ResponseEntity.ok(mldmasViews);
	}

	@GetMapping("/despatches/{recKey}")
	public ResponseEntity<MldmasViewInfo> getDespatchDetails(
			@PathVariable final BigDecimal recKey) {

		final Optional<MldmasView> mldmasView = this.mldmasViewRepository
				.findById(recKey);
		if (!mldmasView.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		final MldmasViewInfo mldmasViewInfo = new MldmasViewInfo(
				this.getMldmasViewFromJDBC(recKey));

		return ResponseEntity.ok(mldmasViewInfo);
	}

	@GetMapping("/inventories")
	public ResponseEntity<List<MlStockSump>> getInventories(
			@RequestParam final String storeId) {

		final MlStockSump probe = new MlStockSump();
		probe.setStoreId(storeId);

		final List<MlStockSump> mlStockSumps = this.mlStockSumpRepository
				.findAll(
						Example.of(probe),
						Sort.by("description"));
		return ResponseEntity.ok(mlStockSumps);
	}

	@GetMapping("/inventory-info")
	public ResponseEntity<List<MlStockSump>> getInventoryInfo(
			@RequestParam final String storeId,
			@RequestParam final String stkId) {

		final MlStockSump probe = new MlStockSump();
		probe.setStoreId(storeId);
		probe.setStkId(stkId);

		final List<MlStockSump> mlStockSumps = this.mlStockSumpRepository
				.findAll(
						Example.of(probe));

		return ResponseEntity.ok(mlStockSumps);
	}

	@GetMapping("/all-inventories")
	public ResponseEntity<List<MlStockSump>> getAllInventories() {

		final List<MlStockSump> mlStockSumps = this.mlStockSumpRepository
				.findAll(Sort.by("description"));

		return ResponseEntity.ok(mlStockSumps);
	}

	@GetMapping("/movements")
	public ResponseEntity<List<MlStockDtl>> getMovements(
			@RequestParam final String stkId,
			@RequestParam final String storeId) {

		final List<MlStockDtl> mlStockDtls = this.mlStockDtlRepository
				.findByStkIdAndStoreIdOrderByRecKey(stkId, storeId);

		return ResponseEntity.ok(mlStockDtls);
	}

	@GetMapping("/attachments")
	public ResponseEntity<List<EpAttach>> getAttachments(
			@RequestParam final BigDecimal srcRecKey) {

		final List<EpAttach> epAttaches = this.epAttachRepository
				.findBySrcRecKeyOrderByName(srcRecKey);

		return ResponseEntity.ok(epAttaches);
	}

	//
	// private methods
	//

	private MlmasView getMlmasViewFromJDBC(final BigDecimal recKey) {
		// for situations where procedure (JDBC) has just updated the table
		return this.jdbcTemplate.queryForObject(
				"select * from MLMAS_VIEW where rec_key = ?",
				new Object[] { recKey },
				BeanPropertyRowMapper.newInstance(MlmasView.class));
	}

	private MldmasView getMldmasViewFromJDBC(final BigDecimal recKey) {
		// for situations where procedure (JDBC) has just updated the table
		return this.jdbcTemplate.queryForObject(
				"select * from MLDMAS_VIEW where rec_key = ?",
				new Object[] { recKey },
				BeanPropertyRowMapper.newInstance(MldmasView.class));
	}

	//
	// fields
	//

	private final Log log = LogFactory.getLog(AppController.class);

	private final JdbcTemplate jdbcTemplate;

	private final MlmasViewRepository mlmasViewRepository;
	private final MlmasRepository mlmasRepository;
	private final MlmasSuppDistinctRepository mlmasSuppDistinctRepository;
	private final MlmasDespatchViewRepository mlmasDespatchViewRepository;
	private final MldmasViewRepository mldmasViewRepository;
	private final MlStockSumpRepository mlStockSumpRepository;
	private final MlStockDtlRepository mlStockDtlRepository;
	private final EpAttachRepository epAttachRepository;
	private final MlvesselRepository mlvesselRepository;

	private final ProcedureService procedureService;

	private final String dateFormatPattern = "yyyy-MM-dd";
	final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
			this.dateFormatPattern);

	//
	// constructor
	//

	@Autowired
	public AppController(
			final JdbcTemplate jdbcTemplate,
			final ProcedureService procedureService,
			final MlmasViewRepository mlmasViewRepository,
			final MlmasRepository mlmasRepository,
			final MlmasSuppDistinctRepository mlmasSuppDistinctRepository,
			final MlmasDespatchViewRepository mlmasDespatchViewRepository,
			final MldmasViewRepository mldmasViewRepository,
			final MlStockSumpRepository mlStockSumpRepository,
			final MlStockDtlRepository mlStockDtlRepository,
			final EpAttachRepository epAttachRepository,
			final MlvesselRepository mlvesselRepository) {

		super();

		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);
		this.mlmasViewRepository = mlmasViewRepository;
		this.mlmasRepository = mlmasRepository;
		this.mlmasSuppDistinctRepository = mlmasSuppDistinctRepository;
		this.mlmasDespatchViewRepository = mlmasDespatchViewRepository;
		this.mldmasViewRepository = mldmasViewRepository;
		this.mlStockSumpRepository = mlStockSumpRepository;
		this.mlStockDtlRepository = mlStockDtlRepository;
		this.epAttachRepository = epAttachRepository;
		this.mlvesselRepository = mlvesselRepository;

		this.procedureService = procedureService;

	}

}
