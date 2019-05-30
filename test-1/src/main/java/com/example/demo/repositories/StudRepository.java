package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Stud;

public interface StudRepository extends CrudRepository<Stud, Integer> {

	public Stud findById(int Id);
}






