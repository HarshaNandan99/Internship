package com.example.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ninja;
import com.example.demo.services.NinjaService;


@RestController
public class NinjaController {
	@Autowired
	private NinjaService ninjaServices;
	
	@GetMapping("/ninja")
	public Iterable<Ninja> getNinja(){
		return ninjaServices.getNinja();
		
	} 
	
	@PostMapping("/Insert")
	public void  getById(@RequestBody Ninja ninja) {
		 ninjaServices.insert(ninja);
	}
	
	@DeleteMapping("/Delete/{id}")
	public void delEmp(@PathVariable String id) {
		ninjaServices.delEmp(id);
	}
	@GetMapping("/GetById/{id}")
	public Optional<Ninja> getId(@PathVariable String id){
		
		return  ninjaServices.getId(id);
	}
	
	@GetMapping("/GetDetails/{Name}")
	public String getDetails(@PathVariable String Name) {
	return ninjaServices.getStud(Name);
	
	}
}
