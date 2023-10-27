package com.varma.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.varma.www.model.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Integer>
{

}
