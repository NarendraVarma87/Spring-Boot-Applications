package com.varma.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.varma.www.model.Employe;
import com.varma.www.repository.EmployeRepository;

@Service
public class EmployeService 
{
	@Autowired
	EmployeRepository employeRepository;
	public Employe addEmployeDetails (Employe employe) {
		return employeRepository.save(employe);
		
	}
	public List<Employe> getEmploye() {
		return employeRepository.findAll();
	}
	public Employe getEmployeById(int empId) {
		return employeRepository.findById(empId).get();
	}
	public String deleteEmploye(int empId) {
		employeRepository.deleteById(empId);
		return "Record Deleted";
	}
	public String updateEmploye(Employe employe) {
		Employe cust=employeRepository.findById(employe.getEmpId()).get();
		
		cust.setEmpName(employe.getEmpName());
				
		cust.setEmpAdd(employe.getEmpAdd());
		
		cust.setEmpSal(employe.getEmpSal());
				
		employeRepository.save(cust);
		return "updated Successfullyyyy";
		
	}
}
