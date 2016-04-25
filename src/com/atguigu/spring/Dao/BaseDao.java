package com.atguigu.spring.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDao {
	
private SessionFactory sessionfactory;
	
	
	
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	public Session getSession(){
		
		return this.sessionfactory.getCurrentSession();
	}

}
