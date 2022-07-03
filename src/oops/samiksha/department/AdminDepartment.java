package oops.samiksha.department;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		String departName = "Admin Department";
		return departName;
	}
	
	public String getTodaysWork() {
		String workInfo = "Complete your documents Submission";
		return workInfo;
	}
	
	public String getWorkDeadline() {
		String deadlineInfo = "Complete by EOD";
		return deadlineInfo;
	}
}
