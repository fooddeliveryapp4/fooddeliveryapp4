package com.nv.foodapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nv.foodapp.entity.Cart;
import com.nv.foodapp.entity.Item;

@RestController
@RequestMapping("/restaurant/cart")
@CrossOrigin(origins= {"http://localhost:4200","http://localhost:2022"},allowedHeaders = "*")
public class CartRestController {
	
	public class CartController {
	    private Cart cart = new Cart();

	    @PostMapping("/add")
	    public void addToCart(@RequestBody Item foodItem) {
	        cart.addItem(foodItem);
	    }

	    @GetMapping("/cartget")
	    public Cart getCart() {
	        return cart;
	    }
	}

}
