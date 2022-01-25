package com.codespark.springbootbasics.batchprocessing.job;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.codespark.springbootbasics.batchprocessing.EmployeeRepository;

/**
 * Stores a list of employees into the database.
 */
@Component("employeeItemWriter")
public class EmployeeItemWriter implements ItemWriter<Employee> {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void write(List<? extends Employee> employees) throws Exception {
		employeeRepository.saveAll(employees);
	}

}
