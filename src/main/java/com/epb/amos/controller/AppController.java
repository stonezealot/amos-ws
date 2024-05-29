package com.epb.amos.controller;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.epb.amos.bean.MldmasViewInfo;
import com.epb.amos.bean.MlmasViewInfo;
import com.epb.amos.entity.EpAttach;
import com.epb.amos.entity.EpVersion;
import com.epb.amos.entity.MlStockDtl;
import com.epb.amos.entity.MlStockSump;
import com.epb.amos.entity.MldmasView;
import com.epb.amos.entity.MlmasDespatchView;
import com.epb.amos.entity.MlmasSuppDistinct;
import com.epb.amos.entity.MlmasView;
import com.epb.amos.entity.Mlvessel;
import com.epb.amos.repository.EpAttachRepository;
import com.epb.amos.repository.EpVersionRepository;
import com.epb.amos.repository.MlStockDtlRepository;
import com.epb.amos.repository.MlStockSumpRepository;
import com.epb.amos.repository.MldmasViewRepository;
import com.epb.amos.repository.MlmasDespatchViewRepository;
import com.epb.amos.repository.MlmasSuppDistinctRepository;
import com.epb.amos.repository.MlmasViewRepository;
import com.epb.amos.repository.MlvesselRepository;
import com.epb.amos.service.ProcedureService;

@RestController
@CrossOrigin(allowCredentials = "true", allowedHeaders = "*", value = "*")
@RequestMapping("/api")
public class AppController {

	//
	// request mappings
	//

	@GetMapping("/orders")
	public ResponseEntity<List<MlmasView>> getOrders(
			@RequestParam
			final String custId) {

		final MlmasView probe = new MlmasView();
		probe.setCustId(custId);

		final List<MlmasView> mlmasViews = this.mlmasViewRepository
				.findAll(
						Example.of(probe),
						Sort.by("vslName", "custName", "stockDate", "landedItem"));
		return ResponseEntity.ok(mlmasViews);
	}

	@GetMapping("/all-orders")
	public ResponseEntity<List<MlmasView>> getAllOrders(
			@RequestParam(required = false)
			final String custId,
			@RequestParam(required = false)
			final String fromDateString,
			@RequestParam(required = false)
			final String toDateString,
			@RequestParam(required = false)
			final String searchInput,
			@RequestParam(required = false)
			final String statusFlg,
			@RequestParam(required = false)
			final String suppName,
			@RequestParam(required = false)
			final String awbNo) {

		if (custId == null) {
			final List<MlmasView> mlmasViews = this.mlmasViewRepository
					.findMlmasView(searchInput == null ? "" : searchInput.toUpperCase(),
							statusFlg == null ? "" : statusFlg.toUpperCase(),
							fromDateString,
							toDateString,
							suppName == null ? "" : suppName,
							awbNo == null ? "" : awbNo);

			return ResponseEntity.ok(mlmasViews);
		} else {
			final List<MlmasView> mlmasViews = this.mlmasViewRepository
					.findMlmasViewWithCust(searchInput == null ? "" : searchInput.toUpperCase(),
							statusFlg == null ? "" : statusFlg.toUpperCase(),
							fromDateString,
							toDateString,
							suppName == null ? "" : suppName,
							awbNo == null ? "" : awbNo,
							custId);

			return ResponseEntity.ok(mlmasViews);
		}
//		final List<MlmasView> mlmasViews = this.mlmasViewRepository
//				.findMlmasViewWithDate(fromDateString,toDateString);

//		return ResponseEntity.ok(mlmasViews);
	}

	@GetMapping("/all-orders2")
	public ResponseEntity<Page<MlmasView>> getAllOrders2(
			@RequestParam(required = false)
			final String custId,
			@RequestParam(required = false)
			final String fromDateString,
			@RequestParam(required = false)
			final String toDateString,
			@RequestParam(required = false)
			final String searchInput,
			@RequestParam(required = false)
			final String statusFlg,
			@RequestParam(required = false)
			final String suppName,
			@RequestParam(required = false)
			final String awbNo,
			@RequestParam(required = false)
			final String vesselList,
			final Pageable pageable) {

		if (custId == null) {
			final Page<MlmasView> mlmasViews = this.mlmasViewRepository
					.findMlmasView(searchInput == null ? "" : searchInput.toUpperCase(),
							statusFlg == null ? "" : statusFlg.toUpperCase(),
							fromDateString,
							toDateString,
							suppName == null ? "" : suppName,
							awbNo == null ? "" : awbNo,
							pageable);

			return ResponseEntity.ok(mlmasViews);
		} else {
			final Page<MlmasView> mlmasViews = this.mlmasViewRepository
					.findMlmasViewWithCust(searchInput == null ? "" : searchInput.toUpperCase(),
							statusFlg == null ? "" : statusFlg.toUpperCase(),
							fromDateString,
							toDateString,
							suppName == null ? "" : suppName,
							awbNo == null ? "" : awbNo,
							custId,
							pageable);

			return ResponseEntity.ok(mlmasViews);
		}
	}

//	@GetMapping("/new-orders")
//	public ResponseEntity<Page<MlmasView>> getAllOrdersNew(
//			@RequestParam(required = false)
//			final String custId,
//			@RequestParam
//			final String searchInput,
//			@RequestParam
//			final String statusFlg,
//			@RequestParam
//			final String fromDateString,
//			@RequestParam
//			final String toDateString,
//			@RequestParam
//			final String suppName,
//			@RequestParam
//			final String awbNo,
//			final Pageable pageable) {
//
//		if (custId == null) {
//			final Page<MlmasView> mlmasViews = this.mlmasViewRepository
//					.findMlmasView(searchInput.toUpperCase(), statusFlg.toUpperCase(), fromDateString, toDateString,
//							suppName, awbNo, pageable);
//
//			return ResponseEntity.ok(mlmasViews);
//		} else {
//			final Page<MlmasView> mlmasViews = this.mlmasViewRepository
//					.findMlmasViewWithCust(searchInput.toUpperCase(), statusFlg.toUpperCase(), fromDateString,
//							toDateString,
//							suppName, awbNo, custId, pageable);
//
//			return ResponseEntity.ok(mlmasViews);
//		}
//
//	}

	@GetMapping("/orders/{recKey}")
	public ResponseEntity<MlmasViewInfo> getOrderDetails(
			@PathVariable
			final BigDecimal recKey) {

		final Optional<MlmasView> mlmasView = this.mlmasViewRepository
				.findById(recKey);

		final List<MldmasView> mldmasView = this.mldmasViewRepository.findMldmasView(recKey);

		if (!mlmasView.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		final MlmasViewInfo mlmasViewInfo = new MlmasViewInfo(mlmasView, mldmasView);

		return ResponseEntity.ok(mlmasViewInfo);
	}

	@GetMapping("/orders-ml")
	public ResponseEntity<List<MlmasView>> getOrderDetailsml(
			@RequestParam
			final BigDecimal recKey,
			@RequestParam
			final BigDecimal mlbarcodeRecKey) {

		MlmasView probe = new MlmasView();
		probe.setRecKey(recKey);
		probe.setMlbarcodeRecKey(mlbarcodeRecKey);

		final List<MlmasView> mlmasView = this.mlmasViewRepository
				.findAll(Example.of(probe));

		return ResponseEntity.ok(mlmasView);
	}

	@GetMapping("/orders-by-despatch-id")
	public ResponseEntity<List<MlmasDespatchView>> getOrdersByDespatchId(
			@RequestParam
			final BigDecimal despatchId) {

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
			@RequestParam
			final String custId) {

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
				.findAll(Sort.by("name", "vslId"));

		return ResponseEntity.ok(mlvessels);
	}

	@GetMapping("/despatches")
	public ResponseEntity<List<MldmasView>> getDespatches(
			@RequestParam
			final String custId) {

		final MldmasView probe = new MldmasView();
		probe.setCustId(custId);

		Order order1 = new Order(Direction.ASC, "vslName");
		Order order2 = new Order(Direction.ASC, "custName");
		Order order3 = new Order(Direction.DESC, "docDate");
		List<Sort.Order> list = new ArrayList<>();
		list.add(order1);
		list.add(order2);
		list.add(order3);
		Sort sort = Sort.by(list);

		final List<MldmasView> mldmasViews = this.mldmasViewRepository
				.findAll(
						Example.of(probe),
						sort);
		return ResponseEntity.ok(mldmasViews);
	}

	@GetMapping("/all-despatches")
	public ResponseEntity<List<MldmasView>> getAllDespatches() {

		Order order1 = new Order(Direction.ASC, "vslName");
		Order order2 = new Order(Direction.ASC, "custName");
		Order order3 = new Order(Direction.DESC, "docDate");
		List<Sort.Order> list = new ArrayList<>();
		list.add(order1);
		list.add(order2);
		list.add(order3);
		Sort sort = Sort.by(list);

		final List<MldmasView> mldmasViews = this.mldmasViewRepository
				.findAll(sort);

		return ResponseEntity.ok(mldmasViews);
	}

	@GetMapping("/despatches/{recKey}")
	public ResponseEntity<MldmasViewInfo> getDespatchDetails(
			@PathVariable
			final BigDecimal recKey) {

		final Optional<MldmasView> mldmasView = this.mldmasViewRepository
				.findById(recKey);

		final MlmasDespatchView probe = new MlmasDespatchView();
		probe.setMldRecKey(recKey);

		final List<MlmasDespatchView> mlmasDespatchViews = this.mlmasDespatchViewRepository
				.findAll(
						Example.of(probe),
						Sort.by("vslName", "custName", "stockDate", "landedItem"));

		if (!mldmasView.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		final MldmasViewInfo mldmasViewInfo = new MldmasViewInfo(mldmasView, mlmasDespatchViews);

		return ResponseEntity.ok(mldmasViewInfo);
	}

	@GetMapping("/despatches-by-order-id")
	public ResponseEntity<List<MldmasView>> getDespatchesByOrderId(
			@RequestParam
			final BigDecimal orderId) {

		final List<MldmasView> mldmasView = this.mldmasViewRepository.findMldmasView(orderId);

		return ResponseEntity.ok(mldmasView);
	}

	@GetMapping("/inventories")
	public ResponseEntity<List<MlStockSump>> getInventories(
			@RequestParam
			final String storeId) {

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
			@RequestParam
			final String storeId,
			@RequestParam
			final String stkId) {

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
			@RequestParam
			final String stkId,
			@RequestParam
			final String storeId) {

		final List<MlStockDtl> mlStockDtls = this.mlStockDtlRepository
				.findByStkIdAndStoreIdOrderByRecKey(stkId, storeId);

		return ResponseEntity.ok(mlStockDtls);
	}

	@GetMapping("/attachments")
	public ResponseEntity<List<EpAttach>> getAttachments(
			@RequestParam
			final BigDecimal srcRecKey) {

		final List<EpAttach> epAttaches = this.epAttachRepository
				.findBySrcRecKeyOrderByName(srcRecKey);

		return ResponseEntity.ok(epAttaches);
	}

	@GetMapping("/version")
	public ResponseEntity<EpVersion> getEpbVersion() {

		final Optional<EpVersion> epVersion = this.epVersionRepository.findAll().stream().findFirst();

		return epVersion.isPresent()
				? ResponseEntity.ok(epVersion.get())
				: ResponseEntity.notFound().build();
	}

	//
	// private methods
	//

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

//	private final Log log = LogFactory.getLog(AppController.class);

	private final JdbcTemplate jdbcTemplate;

	private final MlmasViewRepository mlmasViewRepository;
	private final MlmasSuppDistinctRepository mlmasSuppDistinctRepository;
	private final MlmasDespatchViewRepository mlmasDespatchViewRepository;
	private final MldmasViewRepository mldmasViewRepository;
	private final MlStockSumpRepository mlStockSumpRepository;
	private final MlStockDtlRepository mlStockDtlRepository;
	private final EpAttachRepository epAttachRepository;
	private final MlvesselRepository mlvesselRepository;
	private final EpVersionRepository epVersionRepository;

//	private final ProcedureService procedureService;

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
			final MlmasSuppDistinctRepository mlmasSuppDistinctRepository,
			final MlmasDespatchViewRepository mlmasDespatchViewRepository,
			final MldmasViewRepository mldmasViewRepository,
			final MlStockSumpRepository mlStockSumpRepository,
			final MlStockDtlRepository mlStockDtlRepository,
			final EpAttachRepository epAttachRepository,
			final MlvesselRepository mlvesselRepository,
			final EpVersionRepository epVersionRepository) {

		super();

		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);
		this.mlmasViewRepository = mlmasViewRepository;
		this.mlmasSuppDistinctRepository = mlmasSuppDistinctRepository;
		this.mlmasDespatchViewRepository = mlmasDespatchViewRepository;
		this.mldmasViewRepository = mldmasViewRepository;
		this.mlStockSumpRepository = mlStockSumpRepository;
		this.mlStockDtlRepository = mlStockDtlRepository;
		this.epAttachRepository = epAttachRepository;
		this.mlvesselRepository = mlvesselRepository;
		this.epVersionRepository = epVersionRepository;

//		this.procedureService = procedureService;

	}

}
