package com.nse.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.nse.model.Employee;
import com.nse.util.DBUtils;

public class EmployeeRepositoryImpl implements EmployeeRepository {

	Employee employee = null;
	Connection con = DBUtils.getConnection();

	/*@Override
	public void add(Employee employee) {
		System.out.println("called add method");
		String SQL = "INSERT INTO customer1 VALUES (?,?)";

		try {
			PreparedStatement pstmt = con.prepareStatement(SQL);
			//System.out.println(customer.getId()+"user input values"+customer.getName());
			pstmt.setInt(1,employee.getId());
			pstmt.setString(2,employee.getName());
			System.out.println("call >>"+pstmt);
			int affectedRows = pstmt.executeUpdate();
			System.out.println(affectedRows+"rows affected");

		}
        
		catch (Exception e) {
			System.out.println(e);
		}
	}*/

	/*@Override
	public void delete() {
		String SQL = "DELETE FROM customer1 WHERE id = ?";

		int affectedrows = 0;

		try (PreparedStatement pstmt = con.prepareStatement(SQL)) {

			pstmt.setInt(1, customer.getId());

			affectedrows = pstmt.executeUpdate();
			System.out.println(affectedrows + "rows deleted");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}*/

	/*@Override
	public List<Employee> findAll() {
		List<Employee> list = new ArrayList<>();

		String SQL = "SELECT * FROM customer1";

		try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(SQL)) {
			while (rs.next()) {
				Employee cust = new Employee();
				cust.setId(rs.getInt(1));
				cust.setName(rs.getString(2));
				list.add(cust);

			}

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

		return list;
	}*/

	
	/*public Employee findById(int id) {
		System.out.println("employee finding by id"+id);
		
		String SQL = "SELECT * FROM customer1 where id = 9";
		System.out.println(SQL);
		try {
			PreparedStatement pstmt = con.prepareStatement(SQL);
		//	pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int id1=rs.getInt(1);
				String name=rs.getString(2);
				employee.setId(id1);
				employee.setName(name);

			}
			System.out.println("After employee"+ employee);

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return employee;
	}*/

	/*@Override
	public void updateName(int id, String name) {
		String SQL = "UPDATE customer1 " + "SET name = ? " + "WHERE id = ?";

		try (

				PreparedStatement pstmt = con.prepareStatement(SQL)) {

			pstmt.setString(1, name);
			pstmt.setInt(2, id);

			int affectedrows = pstmt.executeUpdate();
			System.out.println(affectedrows + " rows updated successfully");

		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}

	}*/

}
