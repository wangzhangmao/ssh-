package com.atguigu.spring.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.atguigu.spring.entity.Employee;

public class EmployeeDao extends BaseDao{
	
	public void delete(Integer id){
		String hql="delete from Employee where id=?";
		getSession().createQuery(hql).setInteger(0, id).executeUpdate();
		
	}
	public List<Employee> getAll(){
		String hql="from Employee e LEFT OUTER JOIN FETCH e.department";
		Query query=getSession().createQuery(hql);
		return query.list();
	}

	public void saveOrUpdate(Employee employee){
		getSession().saveOrUpdate(employee);
	}

	public Employee get(Integer id) {
		
		return (Employee) getSession().get(Employee.class, id);
		
	}
}
