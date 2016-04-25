package com.atguigu.spring.Action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.atguigu.spring.entity.Employee;
import com.atguigu.spring.servlet.DepartmentServlet;
import com.atguigu.spring.servlet.EmployeeServlet;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class EmoloyeeAction implements RequestAware, ModelDriven<Employee>,
		Preparable {

	private EmployeeServlet employeeServlet;
	private DepartmentServlet departmentServlet;
	private Integer id;

	public void setId(Integer id) {
		this.id = id;
	}

	public DepartmentServlet getDepartmentServlet() {
		return departmentServlet;
	}

	public void setDepartmentServlet(DepartmentServlet departmentServlet) {
		this.departmentServlet = departmentServlet;
	}

	public EmployeeServlet getEmployeeServlet() {
		return employeeServlet;
	}

	public void setEmployeeServlet(EmployeeServlet employeeServlet) {
		this.employeeServlet = employeeServlet;
	}

	public String list() {
		request.put("employees", employeeServlet.getAll());
		return "list";
	}
	
	public String editsuccess(){
		
		employeeServlet.saveOrUpdate(emp);
		return "editsuccess";
	}

	/**
	 * @return
	 */
	public String input() {
//		System.out.println(emp.getId() );
//		if (emp.getId() != null) {
//			Employee emp1 = employeeServlet.get(emp.getId());
//			emp.setLastName(emp1.getLastName());
//			emp.setEmail(emp1.getEmail());
//			emp.setBirth(emp1.getBirth());
//			ActionContext.getContext().getValueStack().push(employeeServlet.get(emp.getId());
//		}
		request.put("deps", departmentServlet.getAll());
		return "input";
	}

	public String edit(){
		ActionContext.getContext().getValueStack().push(employeeServlet.get(emp.getId()));
		request.put("deps", departmentServlet.getAll());
		return "edit";
	}
	public String delete() {
		employeeServlet.delete(emp.getId());
		return "delete";
	}

	public String save() {
		System.out.println(emp);
		emp.setCreateTime(new Date());
		employeeServlet.saveOrUpdate(emp);
		return "save";
	}

	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		request = arg0;

	}

	private Employee emp;

	@Override
	public Employee getModel() {

		emp = new Employee();

		return emp;

	}

	@Override
	public void prepare() throws Exception {
	}

}
