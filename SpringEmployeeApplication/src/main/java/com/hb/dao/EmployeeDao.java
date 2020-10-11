package com.hb.dao;

import java.util.List;

import com.hb.model.Employee;

public interface EmployeeDao {

	public int save(Employee e);
	
	public List<Employee> getEmployees();
	
	public Employee getEmpById(int id);
	
	public int delete(int id);
	
	public int update(Employee emp);
	
}
