package com.gm.armydemo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gm.armydemo.domain.Military;
import com.gm.armydemo.services.MilitaryService;

@RestController
@RequestMapping(value = "/military")
public class MilitaryResource {
	
	@Autowired
	private MilitaryService service;
	
	@RequestMapping(value = "/{id}" , method = RequestMethod.GET)
	public ResponseEntity<?> findById(@PathVariable Integer id){
		Military obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
