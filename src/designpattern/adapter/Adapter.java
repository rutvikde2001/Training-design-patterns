package designpattern.adapter;

import designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class Adapter implements LeaveRecord {

    private ThirdPartyLeaveRecord thirdPartyLeaveRecord;

    public Adapter() {
        thirdPartyLeaveRecord = new ThirdPartyLeaveRecord();
    }

    public String getMostAbsentEmployee() {
        Employee mostAbsentEmployee = thirdPartyLeaveRecord.getMostAbsentEmployee();
        String name = mostAbsentEmployee.getName();
        return name;
    }

    public int getEmployeeAbsences(String employeeName) {
        int employeeAbsences = thirdPartyLeaveRecord.getEmployeeAbsences(new Employee(employeeName));
        return employeeAbsences;
    }


}

