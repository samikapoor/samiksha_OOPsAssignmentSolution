package oops.samiksha.department;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		String departName = "Tech Department";
		return departName;
	}
	
	public String getTodaysWork() {
		String workInfo = "Complete coding of module 1";
		return workInfo;
	}
	
	public String getWorkDeadline() {
		String deadlineInfo = "Complete by EOD";
		return deadlineInfo;
	}
	
	public String getTechStackInformation() {
		String stackInfo = "core Java";
		return stackInfo;
	}
}
