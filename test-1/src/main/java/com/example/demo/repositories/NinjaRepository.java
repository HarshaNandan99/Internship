package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Integer>{

	Optional<Ninja> save(String id);

	public Ninja findByName(String name);
	

}
