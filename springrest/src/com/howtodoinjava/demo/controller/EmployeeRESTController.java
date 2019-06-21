package com.howtodoinjava.demo.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.EmployeeListVO;
import com.howtodoinjava.demo.model.EmployeeVO;

@RestController
@RequestMapping(value = "users")
public class EmployeeRESTController {
	@RequestMapping(value = "user/employees", produces = "application/json")

	public EmployeeListVO getAllEmployees() {
		EmployeeListVO employees = new EmployeeListVO();

		EmployeeVO empOne = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
		EmployeeVO empTwo = new EmployeeVO(2, "Amit", "Singhal", "asinghal@yahoo.com");
		EmployeeVO empThree = new EmployeeVO(3, "Kirti", "Mishra", "kmishra@gmail.com");

		employees.getEmployees().add(empOne);
		employees.getEmployees().add(empTwo);
		employees.getEmployees().add(empThree);

		return employees;
	}

	@RequestMapping(value = "user/employees/{id}")
	public ResponseEntity<EmployeeVO> getEmployeeById(@PathVariable("id") int id) {
		if (id <= 3) {
			System.out.println("inside try and if block");

			EmployeeVO employee = new EmployeeVO(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com");
			return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
		} else {
			System.out.println("inside else bloack");
			throw new RecordNotFoundException("user doesn't exist with this id");

		}

	}

	@PostMapping(consumes = "application/json", value = "user/createemp")

	public ResponseEntity<EmployeeVO> createAllEmployees(@Valid @RequestBody EmployeeVO employee,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			throw new RecordNotFoundException("Invalid data");
		}

		return new ResponseEntity<EmployeeVO>(employee, HttpStatus.OK);
	}

	
}
