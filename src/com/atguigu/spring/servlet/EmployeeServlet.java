package com.atguigu.spring.servlet;

import java.util.List;

import com.atguigu.spring.Dao.EmployeeDao;
import com.atguigu.spring.entity.Employee;

public class EmployeeServlet {
	
	
	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	public void delete(Integer id){
		employeeDao.delete(id);
	}
	
	public void saveOrUpdate(Employee employee){
		employeeDao.saveOrUpdate(employee);
	}
	
	public List<Employee> getAll(){
		
		List<Employee> emps=employeeDao.getAll();
		return emps;
	}


	public Employee get(Integer id) {
		
		return employeeDao.get(id);
	}

}
