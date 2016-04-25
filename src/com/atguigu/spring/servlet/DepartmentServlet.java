package com.atguigu.spring.servlet;

import java.util.List;

import com.atguigu.spring.Dao.DepartmentDao;
import com.atguigu.spring.entity.Department;

public class DepartmentServlet {
	
	private DepartmentDao departmentDao;

	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	
	
	public List<Department> getAll(){
		return departmentDao.list();
		
	}

}
