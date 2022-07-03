package oops.samiksha.driver;

import oops.samiksha.department.*;

public class Driver {

	public static void main(String[] args) {
		String 	holidayInfo,
				adminDepartName,
				adminWorkInfo,
				adminDeadlineInfo,
				hrDepartName,
				hrWorkInfo,
				hrDeadlineInfo,
				hrActivityInfo,
				techDepartName,
				techWorkInfo,
				techDeadlineInfo,
				techStackInfo;
		// TODO Auto-generated method stub
		
		// Super department Method calls
		SuperDepartment supObj = new SuperDepartment();
		holidayInfo = supObj.isTodayAHoliday();
		
		// Admin department Method calls
		AdminDepartment adminObj = new AdminDepartment();
		adminDepartName = adminObj.departmentName();
		adminWorkInfo = adminObj.getTodaysWork();
		adminDeadlineInfo = adminObj.getWorkDeadline();
		
		System.out.println("Welcome to " + adminDepartName);
		System.out.println(adminWorkInfo);
		System.out.println(adminDeadlineInfo);
		System.out.println(holidayInfo);
		System.out.println("");
		
		// HR department Method calls
		HrDepartment hrObj = new HrDepartment();
		hrDepartName = hrObj.departmentName();
		hrWorkInfo = hrObj.getTodaysWork();
		hrDeadlineInfo = hrObj.getWorkDeadline();
		hrActivityInfo = hrObj.doActivity();
		
		System.out.println("Welcome to " + hrDepartName);
		System.out.println(hrActivityInfo);
		System.out.println(hrWorkInfo);
		System.out.println(hrDeadlineInfo);
		System.out.println(holidayInfo);
		System.out.println("");
		
		// HR department Method calls
		TechDepartment techObj = new TechDepartment();
		techDepartName = techObj.departmentName();
		techWorkInfo = techObj.getTodaysWork();
		techDeadlineInfo = techObj.getWorkDeadline();
		techStackInfo = techObj.getTechStackInformation();
		
		System.out.println("Welcome to " + techDepartName);
		System.out.println(techWorkInfo);
		System.out.println(techDeadlineInfo);
		System.out.println(techStackInfo);
		System.out.println(holidayInfo);
		System.out.println("");
	}

}
