package com.bytedata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bytedata.model.Employee;
import com.bytedata.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;

	@PostMapping("/saveEmployee")
	public int saveEmployee(@RequestBody List<Employee> employee) {
		repository.saveAll(employee);
		return employee.size();
	}

	@GetMapping("/findAllEmployee")
	public Iterable<Employee> firndAllCustomer() {
		return repository.findAll();
	}

	@GetMapping("/firstName/{firstName}")
	public List<Employee> findByFirstName(@PathVariable String firstName) {
		return repository.findByFirstName(firstName);
	}

}
