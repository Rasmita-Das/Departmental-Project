package dept.rasmita.main;

import java.util.Scanner;

import dept.rasmita.model.AdminDepartment;
import dept.rasmita.model.HrDepartment;
import dept.rasmita.model.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {

		AdminDepartment admin = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();
		
		System.out.println("Choose the Department");
		System.out.println("1. Admin Department \n2. HR Department \n3.Tech Department");

			try (Scanner sc = new Scanner(System.in)) {
				int num = sc.nextInt();
		
						switch (num) {
						
						case 1:
							System.out.println("Welcome to Admin Department");
							System.out.println(admin.departmentName());
							System.out.println(admin.getTodaysWork());
							System.out.println(admin.getWorkDeadline());
							System.out.println(admin.isTodayAHoliday());
							break;
							
						case 2:
							System.out.println("Welcome to HR Department");
							System.out.println(hr.departmentName());
							System.out.println(hr.getTodaysWork());
							System.out.println(hr.getWorkDeadline());
							System.out.println(hr.doActivity());
							System.out.println(hr.isTodayAHoliday());
							break;
							
						case 3:
							System.out.println("Welcome to Tech Department");
							System.out.println(tech.departmentName());
							System.out.println(tech.getTodaysWork());
							System.out.println(tech.getWorkDeadline());
							System.out.println(tech.getTechStackInformation());
							System.out.println(tech.isTodayAHoliday());
							break;
							
						default :
							System.out.println("Invalid Option! \nPlease try again!");
							break;
						}							
				}
		}
}