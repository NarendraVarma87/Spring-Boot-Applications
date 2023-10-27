package com.varma.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.varma.www.model.Employe;
import com.varma.www.service.EmployeService;

@RestController
@RequestMapping("/data")
public class EmployeController {
@Autowired
EmployeService employeService;
@PostMapping("/add")
public Employe addEmployeDetails(@RequestBody Employe employe) {
	return employeService.addEmployeDetails(employe);
}
@GetMapping("/fetch")
public List<Employe> getEmploye(@RequestBody Employe employe) {
	return employeService.getEmploye();
}
@GetMapping("/fetch/{empId}")
public Employe getEmployeById(@PathVariable int empId) {
	return employeService.getEmployeById(empId);
}
@DeleteMapping("/delete/{empId}")
public String deleteEmploye(@PathVariable int empId) {
	return employeService.deleteEmploye(empId);
}
@PutMapping("/update")
public String updateEmploye(@RequestBody Employe employe) {
	return employeService.updateEmploye(employe);
	
	
}

}
