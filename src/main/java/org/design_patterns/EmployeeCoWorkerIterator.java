package org.design_patterns;

public class EmployeeCoWorkerIterator implements EmployeeHierarchyIterator{

    private final EmployeeHierarchyCollection employeeCollection;
    private int currentCoWorkerPosition = 0;

    public EmployeeCoWorkerIterator(EmployeeHierarchyCollection employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    @Override
    public Employee getNext() {
        System.out.println("Iterating through a graph");
        if(!hasNext()){
            return null;
        }
        return employeeCollection.getEmployeeList().get(currentCoWorkerPosition++);
    }

    @Override
    public boolean hasNext() {
        return currentCoWorkerPosition < employeeCollection.getEmployeeList().size();
    }
}
