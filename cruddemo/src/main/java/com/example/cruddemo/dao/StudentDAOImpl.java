package com.example.cruddemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.cruddemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO{

	private EntityManager entityManager;
	
	@Autowired
	private StudentDAOImpl(EntityManager entityManager)
	{
		this.entityManager=entityManager;
	}
	
	@Override
	@Transactional
	public void save(Student theStudent) {
		entityManager.persist(theStudent);
	}

	
}
