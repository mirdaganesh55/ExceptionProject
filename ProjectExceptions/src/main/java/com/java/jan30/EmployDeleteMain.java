package com.java.jan30;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployDeleteMain {
	
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		EmployDAO dao = new EmployDaoImpl();
		try {
			System.out.println(dao.deleteEmployDao(empno));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
}
