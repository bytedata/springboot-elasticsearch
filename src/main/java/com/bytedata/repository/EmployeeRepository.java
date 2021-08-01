package com.bytedata.repository;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.bytedata.model.Employee;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {


	List<Employee> findByFirstName(String firstName);
	
}
