package org.design_patterns;

import java.util.List;

public class EmployeeHierarchyCollection implements IterableCollection{

    private final String employeeID;
    private final List<Employee> employeeList;

    public EmployeeHierarchyCollection(String employeeID) {
        this.employeeID = employeeID;
        this.employeeList = List.of(
                new Employee("1234","Mahmoud"),
                new Employee("5678","Ahmed")
        );
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public EmployeeHierarchyIterator createEmployeeDirectReportIterator() {
        return new EmployeeDirectReportIterator(this);
    }

    @Override
    public EmployeeHierarchyIterator createEmployeeCoWorkerIterator() {
        return new EmployeeCoWorkerIterator(this);
    }

    @Override
    public EmployeeHierarchyIterator createEmployeeSubOrdinateIterator() {
        return new EmployeeSubOrdinateIterator(this);
    }
}
