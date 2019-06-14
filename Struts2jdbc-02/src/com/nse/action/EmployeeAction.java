package com.nse.action;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

import com.nse.dao.EmployeeRepository;
import com.nse.dao.EmployeeRepositoryImpl;
import com.nse.model.Employee;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {
	EmployeeRepository emp = null;
	private Employee employee = new Employee();
	
	// Employee employee = null;

	/*
	 * public String create(int id,String name) { System.out.println(
	 * "calling add method"); emp.add(id,name); return "success"; }
	 */

	/*public String create() {
		emp = new EmployeeRepositoryImpl();
		System.out.println("calling add method");
		System.out.println("repo impl" + emp);
		emp.add(employee);
		return "success";
	}*/

	public String create() {
		Client client = ClientBuilder.newClient(new ClientConfig().register(LoggingFilter.class));
		WebTarget webTarget = client.target("http://localhost:8070/Struts2jdbc-02/rest").path("getemployees")
				.path("getEmployee").path("9");
		System.out.println(employee.getId());
		Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
		Response response = invocationBuilder.get();

		 employee = response.readEntity(Employee.class);
       System.out.println("Result"+ employee);
		System.out.println(response.getStatus());
		System.out.println(employee);
		return "success";
	}

	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;
	}
}
