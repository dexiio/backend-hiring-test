package io.dexi.pizzeria.controller;


import io.dexi.pizzeria.model.Pizza;
import io.dexi.pizzeria.model.Purchase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {


	public PurchaseController() {

	}

	@PostMapping("addPizza")
	public ResponseEntity<Purchase> addToPurchase(@RequestBody Pizza pizza) {
		//TO DO
		/**
		 * Implement the logic to add pizza to the purchase
		 * It will return 200 if the operation was successfull
		 * It will return the error number and the error message if the operation failed
		 */
		return null;
	}

	@PostMapping("submitOrder")
	public ResponseEntity<Void> submitPurchase() {
		//TO DO
		/**
		 * Implement logic to submit purchase of the order
		 * It will return 200 if the operation was successful
		 * It will return the error number and error message the operation failed
		 */
		return null;
	}

}
