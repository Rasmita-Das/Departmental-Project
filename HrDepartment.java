package dept.rasmita.model;

public class HrDepartment extends SuperDepartment {

	public String departmentName() {
		String departmentName = "HR Department";
		return departmentName;
	}
	public String getTodaysWork() {
		String getTodaysWork = "Fill today's Worksheet and mark your Attendance";
		return getTodaysWork;
	}
	public String getWorkDeadline() {
		String getWorkDeadline = "Complete by EOD";
		return getWorkDeadline;
	}
	public String doActivity() {
		String doActivity = "Team Lunch";
		return doActivity;
	}
}
