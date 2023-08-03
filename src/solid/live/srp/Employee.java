package solid.live.srp;

import java.time.Year;

class Address {
    private String addressStreet;
    private String addressCity;
    private String addressCountry;

    Address(String addressStreet,String addressCity,String addressCountry){
        this.addressCity = addressCity;
        this.addressCountry = addressCountry;
        this.addressStreet = addressStreet;

    }
}
public class Employee {
    private int empId;
    private static int TOTAL_LEAVES_ALLOWED = 30;

    private double monthlySalary;
    private String name;

    private Address address;
    private int leavesTaken;
    private int totalLeaveAllowed;
    private String manager;
    private int yearsInOrg;
    private int thisYear =  Year.now().getValue();
    private int[] leavesLeftPreviously;


    public Employee(int empId, double monthlySalary, String name, Address address, int leavesTaken, int[] leavesLeftPreviously) {
        this.empId = empId;
        this.monthlySalary = monthlySalary;
        this.name = name;
        this.address = address;
        this.leavesTaken = leavesTaken;
        this.leavesLeftPreviously = leavesLeftPreviously;
        this.yearsInOrg = leavesLeftPreviously.length;
    }

    public int totalLeavesLeft() {
        int years = 3;
        if (yearsInOrg < 3) {
            years = yearsInOrg;
        }
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += leavesLeftPreviously[yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }

    public int getEmpId() {
        return empId;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public String getName() {
        return name;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public int getTotalLeaveAllowed() {
        return totalLeaveAllowed;
    }


    public String getManager() {
        return manager;
    }


    //other method related to customer
}

class EmployeeFormatter {
    public String toHtml(Employee employee) {
        String htmlData = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        htmlData += "<div class='right'><span>" + (employee.getTotalLeaveAllowed() - employee.getLeavesTaken()) + "</span>";
        htmlData += "<span>" + Math.round(employee.getMonthlySalary() * 12) + "</span>";
        if (employee.getManager() != null) htmlData += "<span>" + employee.getManager() + "</span>";
        else htmlData += "<span>None</span>";
        htmlData += "<span>" + employee.totalLeavesLeft() + "</span>";
        return htmlData + "</div> </div>";
    }
}