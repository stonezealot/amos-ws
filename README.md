# amos-ws

## AppController

```Java

@RequestMapping("/api")
public class AppController

    @GetMapping("/orders")
	public ResponseEntity<List<MlmasView>> getOrders(
			@RequestParam final String custId)
			
	@GetMapping("/all-orders")
	public ResponseEntity<List<MlmasView>> getAllOrders()
	
	@GetMapping("/orders/{recKey}")
	public ResponseEntity<List<MlmasView>> getOrderDetails(
			@PathVariable final BigDecimal recKey)
			
	@GetMapping("/orders-ml")
	public ResponseEntity<List<MlmasView>> getOrderDetailsml(
			@RequestParam final BigDecimal recKey,
			@RequestParam final BigDecimal mlbarcodeRecKey)
			
	@GetMapping("/orders-by-despatch-id")
	public ResponseEntity<List<MlmasDespatchView>> getOrdersByDespatchId(
			@RequestParam final BigDecimal despatchId)
			
	@GetMapping("/search-suppliers")
	public ResponseEntity<List<MlmasSuppDistinct>> searchSuppliers(
			@RequestParam final String custId)
	
	@GetMapping("/search-all-suppliers")
	public ResponseEntity<List<MlmasSuppDistinct>> searchAllSuppliers()
	
	@GetMapping("/search-vessels")
	public ResponseEntity<List<Mlvessel>> searchVessels()
	
	@GetMapping("/despatches")
	public ResponseEntity<List<MldmasView>> getDespatches(
			@RequestParam final String custId)
			
	@GetMapping("/all-despatches")
	public ResponseEntity<List<MldmasView>> getAllDespatches()
	
	@GetMapping("/despatches/{recKey}")
	public ResponseEntity<MldmasViewInfo> getDespatchDetails(
			@PathVariable final BigDecimal recKey)
			
	@GetMapping("/inventories")
	public ResponseEntity<List<MlStockSump>> getInventories(
			@RequestParam final String storeId)
			
	@GetMapping("/inventory-info")
	public ResponseEntity<List<MlStockSump>> getInventoryInfo(
			@RequestParam final String storeId,
			@RequestParam final String stkId)
			
	@GetMapping("/all-inventories")
	public ResponseEntity<List<MlStockSump>> getAllInventories()
	
	@GetMapping("/movements")
	public ResponseEntity<List<MlStockDtl>> getMovements(
			@RequestParam final String stkId,
			@RequestParam final String storeId)
			
	@GetMapping("/attachments")
	public ResponseEntity<List<EpAttach>> getAttachments(
			@RequestParam final BigDecimal srcRecKey)						
	
	
	
	