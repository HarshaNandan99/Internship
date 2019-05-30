package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ninja;
import com.example.demo.model.Stud;
import com.example.demo.repositories.NinjaRepository;
import com.example.demo.repositories.StudRepository;

@Service
public class StudServices {
	@Autowired
	private StudRepository studRepository;
	
	public Iterable<Stud> getStud(){
		
		return studRepository.findAll();
	}
	public Stud getId(int id){
		System.out.println(id);
		
		return studRepository.findById(id);
	}

}


