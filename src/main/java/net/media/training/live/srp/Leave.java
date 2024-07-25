package net.media.training.live.srp;

public class Leave {
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private int totalLeaveAllowed;
    private int leavesTaken;
    private int[] leavesLeftPreviously;
    private int yearsInOrg;

    public Leave(int leavesTaken, int[] leavesLeftPreviously) {
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.leavesTaken = leavesTaken;
        //this.totalLeaveAllowed = totalLeaveAllowed;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public int getTotalLeaveLeftPreviously(){
        int years = 3;
        if ( yearsInOrg < 3) {
            years = yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }

    public static int getTotalLeavesAllowed() {
        return TOTAL_LEAVES_ALLOWED;
    }

    public static void setTotalLeavesAllowed(int totalLeavesAllowed) {
        TOTAL_LEAVES_ALLOWED = totalLeavesAllowed;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }

    public void setTotalLeaveAllowed(int totalLeaveAllowed) {
        this.totalLeaveAllowed = totalLeaveAllowed;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public void setLeavesTaken(int leavesTaken) {
        this.leavesTaken = leavesTaken;
    }

    public int[] getLeavesLeftPreviously() {
        return leavesLeftPreviously;
    }

    public void setLeavesLeftPreviously(int[] leavesLeftPreviously) {
        this.leavesLeftPreviously = leavesLeftPreviously;
    }

    public int getYearsInOrg() {
        return yearsInOrg;
    }

    public void setYearsInOrg(int yearsInOrg) {
        this.yearsInOrg = yearsInOrg;
    }
}
