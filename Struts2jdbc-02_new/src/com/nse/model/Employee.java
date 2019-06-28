package com.nse.model;

import java.io.File;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Employee implements Serializable {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	int id;
	String name;
	private File fileUpload1;
	private String fileUpload1ContentType;
	private String fileUpload1FileName;
	

	public File getFileUpload1() {
		return fileUpload1;
	}

	public void setFileUpload1(File fileUpload1) {
		this.fileUpload1 = fileUpload1;
	}

	public String getFileUpload1ContentType() {
		return fileUpload1ContentType;
	}

	public void setFileUpload1ContentType(String fileUpload1ContentType) {
		this.fileUpload1ContentType = fileUpload1ContentType;
	}

	public String getFileUpload1FileName() {
		return fileUpload1FileName;
	}

	public void setFileUpload1FileName(String fileUpload1FileName) {
		this.fileUpload1FileName = fileUpload1FileName;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
