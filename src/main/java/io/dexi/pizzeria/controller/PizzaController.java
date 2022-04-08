package io.dexi.pizzeria.controller;

import io.dexi.pizzeria.model.Pizza;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaController {


	@PostMapping("/pizza")
	public ResponseEntity<Pizza> createPizza(@RequestBody Pizza pizza){
		// TO DO
		/**
		 * Implement save logic that save Pizza
		 * returns status 200 and the pizza created if the operation was a success
		 * returns status error number and the error message if the operation was a failure
		 */
		return null;
	}

	@GetMapping("/pizza")
	public ResponseEntity<Iterable<Pizza>> getPizzas(@RequestParam(value = "topping", required = false) String topping){
		// TO DO
		/**
		 * receives as input pizza topping
		 * return all the pizza if the topping is empty
		 * If the topping is specified return all pizza that include the topping
		 */
		return null;
	}
}
