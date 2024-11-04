package org.design_patterns;

public class EmployeeDirectReportIterator implements EmployeeHierarchyIterator{

    private final EmployeeHierarchyCollection employeeCollection;
    private int currentDirectReportPosition = 0;

    public EmployeeDirectReportIterator(EmployeeHierarchyCollection employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    @Override
    public Employee getNext() {
        System.out.println("Iterating through a graph");
        if(!hasNext()){
            return null;
        }
        return employeeCollection.getEmployeeList().get(currentDirectReportPosition++);
    }

    @Override
    public boolean hasNext() {
        return currentDirectReportPosition < employeeCollection.getEmployeeList().size();
    }
}
