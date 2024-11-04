package org.design_patterns;

public interface IterableCollection {

    EmployeeHierarchyIterator createEmployeeDirectReportIterator();
    EmployeeHierarchyIterator createEmployeeCoWorkerIterator();
    EmployeeHierarchyIterator createEmployeeSubOrdinateIterator();
}
