package com.epb.ah.controller;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;

import java.util.List;
import java.util.Optional;

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

import com.epb.ah.bean.AddToCartPayload;
import com.epb.ah.bean.CartlineEditCashcarryPayload;
import com.epb.ah.bean.CartlineEditInstallationPayload;
import com.epb.ah.bean.CartlineEditQtyPayload;
import com.epb.ah.bean.CartlineQtyPayload;
import com.epb.ah.bean.EcstkInfo;
import com.epb.ah.entity.Eccart;
import com.epb.ah.entity.EccartlineView;
import com.epb.ah.entity.EcskuOverviewPicture;
import com.epb.ah.entity.EcskuSpecPicture;
import com.epb.ah.entity.Ecstk;
import com.epb.ah.repository.EcstkRepository;
import com.epb.ah.repository.EccartRepository;
import com.epb.ah.repository.EccartlineViewRepository;
import com.epb.ah.repository.EcskuOverviewPictureRepository;
import com.epb.ah.repository.EcskuSpecPictureRepository;
import com.epb.ah.service.ProcedureResponse;
import com.epb.ah.service.ProcedureService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class AppController {

	//
	// request mappings
	//

	@GetMapping("/stocks")
	public ResponseEntity<List<Ecstk>> getEcstks(
			@RequestParam final String orgId) {

		final Ecstk probe = new Ecstk();
		probe.setOrgId(orgId);
		// on optional sectionId
		final List<Ecstk> ecstks = this.ecstkRepository
				.findAll(
						Example.of(probe),
						Sort.by("stkId"));
		return ResponseEntity.ok(ecstks);
	}

	@GetMapping("/stocks/{recKey}")
	public ResponseEntity<EcstkInfo> getEcstkInfo(
			@PathVariable final BigDecimal recKey) {
		final Optional<Ecstk> ecstk = this.ecstkRepository
				.findById(recKey);
		if (!ecstk.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		final EcstkInfo ecstkInfo = new EcstkInfo(
				this.getEcstkFromJDBC(recKey));

		return ResponseEntity.ok(ecstkInfo);
	}

	@GetMapping("/carts")
	public ResponseEntity<List<Eccart>> getEccarts(
			@RequestParam final String custId,
			@RequestParam final String ecshopId) {

		final List<Eccart> eccarts = this.eccartRepository
				.findByCustIdAndEcshopId(custId, ecshopId);

		return ResponseEntity.ok(eccarts);
	}

	@GetMapping("/cartlines")
	public ResponseEntity<List<EccartlineView>> getEccartlines(
			@RequestParam final String custId,
			@RequestParam final String ecshopId) {

		final List<EccartlineView> eccartlineViews = this.eccartlineViewRepository
				.findByCustIdAndEcshopId(custId, ecshopId);

		return ResponseEntity.ok(eccartlineViews);
	}

	@GetMapping("/overviews")
	public ResponseEntity<List<EcskuOverviewPicture>> getOverviewPictures(
			@RequestParam final String stkId,
			@RequestParam(required = false) final String orgId) {
		final EcskuOverviewPicture probe = new EcskuOverviewPicture();
		probe.setStkId(stkId);

		if (orgId != null && !orgId.isEmpty()) {
			probe.setOrgId(orgId);
		}

		final List<EcskuOverviewPicture> ecskuOverviewPictures = this.ecskuOverviewPictureRepository
				.findAll(
						Example.of(probe),
						Sort.by("sortNum"));

		return ResponseEntity.ok(ecskuOverviewPictures);
	}

	@GetMapping("/specs")
	public ResponseEntity<List<EcskuSpecPicture>> getSpecPictures(
			@RequestParam final String stkId,
			@RequestParam(required = false) final String orgId) {
		final EcskuSpecPicture probe = new EcskuSpecPicture();
		probe.setStkId(stkId);

		if (orgId != null && !orgId.isEmpty()) {
			probe.setOrgId(orgId);
		}

		final List<EcskuSpecPicture> ecskuSpecPictures = this.ecskuSpecPictureRepository
				.findAll(
						Example.of(probe),
						Sort.by("sortNum"));

		return ResponseEntity.ok(ecskuSpecPictures);
	}

	@PostMapping("/cartlines/{recKey}/qty-plus")
	public ResponseEntity<List<EccartlineView>> cartlineQtyPlus(
			@PathVariable final String recKey,
			@RequestBody final CartlineQtyPayload payload) {

		final ProcedureResponse response = this.procedureService
				.ecEditCartInc(
						"",
						recKey,
						payload.getOrgId(),
						payload.getCustId(),
						payload.getEcshopId());
		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		return this.getEccartlines(payload.getCustId(), payload.getEcshopId());

	}

	@PostMapping("/cartlines/{recKey}/qty-minus")
	public ResponseEntity<List<EccartlineView>> cartlineQtyMinus(
			@PathVariable final String recKey,
			@RequestBody final CartlineQtyPayload payload) {

		final ProcedureResponse response = this.procedureService
				.ecEditCartDec(
						"",
						recKey,
						payload.getOrgId(),
						payload.getCustId(),
						payload.getEcshopId());
		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		return this.getEccartlines(payload.getCustId(), payload.getEcshopId());

	}

	@PostMapping("/cartlines/{recKey}/edit-qty")
	public ResponseEntity<List<EccartlineView>> cartlineEditQty(
			@PathVariable final String recKey,
			@RequestBody final CartlineEditQtyPayload payload) {

		final ProcedureResponse response = this.procedureService
				.ecEditCartQty(
						"",
						recKey,
						payload.getOrgId(),
						payload.getCustId(),
						payload.getEcshopId(),
						payload.getStkId(),
						payload.getQty());
		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		return this.getEccartlines(payload.getCustId(), payload.getEcshopId());

	}

	@PostMapping("/cartlines/{recKey}/edit-installation")
	public ResponseEntity<List<EccartlineView>> cartlineEditInstallation(
			@PathVariable final String recKey,
			@RequestBody final CartlineEditInstallationPayload payload) {

		final ProcedureResponse response = this.procedureService
				.ecEditCartInstallation(
						"",
						recKey,
						payload.getOrgId(),
						payload.getCustId(),
						payload.getEcshopId(),
						payload.getStkId(),
						payload.getInstallation());
		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		return this.getEccartlines(payload.getCustId(), payload.getEcshopId());

	}
	
	@PostMapping("/cartlines/{recKey}/edit-cashcarry")
	public ResponseEntity<List<EccartlineView>> cartlineEditCashcarry(
			@PathVariable final String recKey,
			@RequestBody final CartlineEditCashcarryPayload payload) {

		final ProcedureResponse response = this.procedureService
				.ecEditCartCashcarry(
						"",
						recKey,
						payload.getOrgId(),
						payload.getCustId(),
						payload.getEcshopId(),
						payload.getStkId(),
						payload.getCashcarry());
		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		return this.getEccartlines(payload.getCustId(), payload.getEcshopId());

	}

	@PostMapping("/cartlines/{recKey}/delete")
	public ResponseEntity<List<EccartlineView>> cartlineDelete(
			@PathVariable final String recKey,
			@RequestBody final CartlineQtyPayload payload) {

		final ProcedureResponse response = this.procedureService
				.ecDeleteCart(
						"",
						recKey,
						payload.getOrgId(),
						payload.getCustId(),
						payload.getEcshopId());

		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		return this.getEccartlines(payload.getCustId(), payload.getEcshopId());

	}

	@PostMapping("add-to-cart")
	public ResponseEntity<List<EccartlineView>> addToCart(
			@RequestBody final AddToCartPayload payload) {

		final ProcedureResponse response = this.procedureService
				.ecAddCart(
						"",
						payload.getOrgId(),
						payload.getCustId(),
						payload.getGuestFlg(),
						payload.getEcshopId(),
						payload.getStkId(),
						payload.getQty(),
						payload.getCashcarry(),
						payload.getInstallationFlg());

		if (!ProcedureService.ERR_CODE_OK.equals(response.getErrCode())) {
			throw new RuntimeException(response.getErrMsg());
		}

		return this.getEccartlines(payload.getCustId(), payload.getEcshopId());
	}

	//
	// private methods
	//

	private Ecstk getEcstkFromJDBC(final BigDecimal recKey) {
		// for situations where procedure (JDBC) has just updated the table
		return this.jdbcTemplate.queryForObject(
				"select * from ECSTK where rec_key = ?",
				new Object[] { recKey },
				BeanPropertyRowMapper.newInstance(Ecstk.class));
	}

	//
	// fields
	//

//	private final Log log = LogFactory.getLog(AppController.class);

	private final JdbcTemplate jdbcTemplate;

	private final EcstkRepository ecstkRepository;
	private final EccartRepository eccartRepository;
	private final EccartlineViewRepository eccartlineViewRepository;
	private final EcskuOverviewPictureRepository ecskuOverviewPictureRepository;
	private final EcskuSpecPictureRepository ecskuSpecPictureRepository;

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
			final EcstkRepository ecstkRepository,
			final EccartRepository eccartRepository,
			final EccartlineViewRepository eccartlineViewRepository,
			final EcskuOverviewPictureRepository ecskuOverviewPictureRepository,
			final EcskuSpecPictureRepository ecskuSpecPictureRepository) {

		super();

		this.jdbcTemplate = jdbcTemplate;
		this.jdbcTemplate.setResultsMapCaseInsensitive(true);

		this.procedureService = procedureService;

		this.ecstkRepository = ecstkRepository;
		this.eccartRepository = eccartRepository;
		this.eccartlineViewRepository = eccartlineViewRepository;
		this.ecskuOverviewPictureRepository = ecskuOverviewPictureRepository;
		this.ecskuSpecPictureRepository = ecskuSpecPictureRepository;

	}

}
