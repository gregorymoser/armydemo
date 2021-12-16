package com.gm.armydemo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gm.armydemo.domain.Military;
import com.gm.armydemo.repositories.MilitaryRepository;

@Service
public class MilitaryService {
	
	@Autowired
	private MilitaryRepository repository;
	
	public Military find (Integer id) {
		
		Optional<Military> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
}
