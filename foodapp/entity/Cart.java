package com.nv.foodapp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Cart {
	 private List<Item> items = new ArrayList<>();

	    public void addItem(Item item) {
	        items.add(item);
	    }

	    public List<Item> getItems() {
	        return items;
	    }

	    public void setItems(List<Item> items) {
	        this.items = items;
	    }

}
