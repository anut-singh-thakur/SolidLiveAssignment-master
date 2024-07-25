package net.media.training.live.srp;


public class Employee {
    private int empId;
    private double monthlySalary;
    private String name;
    private Address address;
    private Leave leave;
    private String manager;


    public Employee(int empId, double monthlySalary, String name, Address address, Leave leave) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.address = address;
        this.leave = leave;
    }

    public Employee() {

    }
    public String toHTML(){
        return HTMLOutput.toHtml(this);
    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Leave getLeave() {
        return leave;
    }

    public void setLeave(Leave leave) {
        this.leave = leave;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
