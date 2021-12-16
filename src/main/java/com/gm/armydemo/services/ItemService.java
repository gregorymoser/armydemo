package com.gm.armydemo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gm.armydemo.domain.Item;
import com.gm.armydemo.repositories.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository repository;
	
	public Item find(Integer id) {
		Optional<Item> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
}
