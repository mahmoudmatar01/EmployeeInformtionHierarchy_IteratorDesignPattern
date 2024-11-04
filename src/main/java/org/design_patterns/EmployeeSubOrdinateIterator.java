package org.design_patterns;

public class EmployeeSubOrdinateIterator implements EmployeeHierarchyIterator{

    private final EmployeeHierarchyCollection employeeCollection;
    private int currentSubOrdinatePosition = 0;

    public EmployeeSubOrdinateIterator(EmployeeHierarchyCollection employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    @Override
    public Employee getNext() {
        System.out.println("Iterating through a graph");
        if(!hasNext()){
            return null;
        }
        return employeeCollection.getEmployeeList().get(currentSubOrdinatePosition++);
    }

    @Override
    public boolean hasNext() {
        return currentSubOrdinatePosition < employeeCollection.getEmployeeList().size();
    }
}
