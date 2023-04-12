package com.crudoperation.repository;

import org.springframework.data.repository.CrudRepository;

import com.crudoperation.entity.student;

public interface StudentRepository extends CrudRepository<student, Long> {

}
