package oops.samiksha.department;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		String departName = "HR Department";
		return departName;
	}
	public String getTodaysWork() {
		String workInfo = "Fill today's worksheet and mark your attendance";
		return workInfo;
	}
	
	public String getWorkDeadline() {
		String deadlineInfo = "Complete by EOD";
		return deadlineInfo;
	}
	
	public String doActivity() {
		String activityInfo = "team Lunch";
		return activityInfo;
	}
}
