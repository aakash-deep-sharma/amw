package com.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

	Employee findByEmployeeName(String name);
	List<Employee> findByAddress_state(String state);
	List<Employee> findByEmployeeNameAndAddressState(String employeeName , String state);
}
