package com.nse.rest;

import java.awt.PageAttributes.MediaType;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.nse.dao.EmployeeRepository;
import com.nse.dao.EmployeeRepositoryImpl;
import com.nse.model.Employee;

@Path("/getemployees")
public class EmployeeRest {
	EmployeeRepository emp = null;
	@GET
	@Path("/getEmployee/{id}")
	@Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON,javax.ws.rs.core.MediaType.APPLICATION_XML})
	public Employee getEmployeeById(@PathParam("id")String id)
	{
		emp=new EmployeeRepositoryImpl();
		System.out.println("calling add method");
		System.out.println("repo impl"+emp);
		return emp.findById(Integer.parseInt(id));
        
        
	}
	
	@GET
	@Path("/getboth")
	@Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON,javax.ws.rs.core.MediaType.APPLICATION_XML})
	public Employee hello()
	{
		
		Employee s = new Employee();
        s.setId(10);
        s.setName("JavaInterviewPoint");
        
        return s;
	}
	/*@GET
	@Path("/getEmployee")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Student getAllEmployes()
	{
		
		Student s = new Student();
        s.setAge("10");
        s.setName("JavaInterviewPoint");
        
        return s;
	}*/
}
