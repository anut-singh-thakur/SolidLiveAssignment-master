package net.media.training.live.srp;

public class HTMLOutput{

	public static String toHtml(Employee employee) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employee.getLeave().getTotalLeaveAllowed() - employee.getLeave().getLeavesTaken()) + "</span>";
        str += "<span>" + Math.round(employee.getMonthlySalary() * 12) + "</span>";
        if (employee.getManager() != null) str += "<span>" + employee.getManager() + "</span>";
        else str += "<span>None</span>";
        int totalLeaveLeftPreviously = employee.getLeave().getTotalLeaveLeftPreviously();
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}