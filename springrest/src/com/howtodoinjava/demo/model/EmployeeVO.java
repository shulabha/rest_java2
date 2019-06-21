package com.howtodoinjava.demo.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class EmployeeVO implements Serializable 
{
    private static final long serialVersionUID = 1L;
 
    @XmlAttribute
    @NotNull(message="Please enter an Id")
    private Integer id;
     
    @XmlElement
    @NotNull(message="Please enter a firstName")
    private String firstName;
     
    @XmlElement
    @NotNull(message="Please enter a valid lastName")
    private String lastName;
     
    @XmlElement
    @NotNull(message="Please enter an email")
    private String email;
     
    public EmployeeVO(Integer id, String firstName, String lastName, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
     
    public EmployeeVO(){
         
    }
 
    
 
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
    public String toString() {
        return "EmployeeVO [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", email=" + email + "]";
    }
}
