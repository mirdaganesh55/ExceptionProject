package com.java.jan30;

import java.sql.SQLException;
import java.util.List;

public class EmployShowMain {
	
	public static void main(String[] args) {
		EmployDAO dao = new EmployDaoImpl();
		try {
			List<Employ> employList = dao.showEmployDao();
			for (Employ employ : employList) {
				System.out.println(employ);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
