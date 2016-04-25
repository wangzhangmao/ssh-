package com.atguigu.spring.Dao;

import java.util.List;

import org.hibernate.Query;

import com.atguigu.spring.entity.Department;

public class DepartmentDao extends BaseDao{
	
	public List<Department> list(){
		String hql="from Department";
		Query query=getSession().createQuery(hql);
		return query.list();
	}

}
