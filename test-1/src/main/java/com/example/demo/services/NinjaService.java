package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ninja;
import com.example.demo.model.Stud;
import com.example.demo.repositories.NinjaRepository;

@Service
public class NinjaService {
     @Autowired  
	private NinjaRepository ninjaRepository;
     
     @Autowired
     private StudServices studServices;
     
	public Iterable<Ninja> getNinja(){
		return ninjaRepository.findAll();
	}
	
	public void delEmp(String id) {
		
		ninjaRepository.deleteById(Integer.parseInt(id));
	}

	public void insert(Ninja ninja) {
		
		ninjaRepository.save(ninja);
	}
	
	public Optional<Ninja> getNinja(String id)
	{
		System.out.println(id);
		
		return ninjaRepository.save(id);
	}
	
	public Optional<Ninja> getId(String id) {
		
		return ninjaRepository.findById(Integer.parseInt(id));
		
	}
	
	public String getStud(String name) {
		Ninja ninja = ninjaRepository.findByName(name);
		  System.out.println(name);
		
		Stud stud = studServices.getId(ninja.getId());
		System.out.println(ninja.getId());
		
		return name  + "belongs to" +   stud.getArea()   + "area";
	}
}
