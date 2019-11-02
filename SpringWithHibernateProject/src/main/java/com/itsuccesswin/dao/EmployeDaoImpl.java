package com.itsuccesswin.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.itsuccesswin.beans.Employee;

public class EmployeDaoImpl implements EmployeeDao {
	
	String status="";
	private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Transactional
	public String insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Employee serchEmployee(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public String deleteEmployee(int eno) {
		// TODO Auto-generated method stub
		return null;
	}

}
