package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Ninja;
import com.example.demo.services.NinjaService;
import com.example.demo.services.StudServices;

public class StudController {
	@Autowired
	private StudServices studServices;
	@Autowired
	private NinjaService ninjaServices;
	
	
}

//@GetMapping("/GetById/{id}")
//public Optional<Ninja> getId(@PathVariable String id){
	
//	return  ninjaServices.getId(id);
//}
