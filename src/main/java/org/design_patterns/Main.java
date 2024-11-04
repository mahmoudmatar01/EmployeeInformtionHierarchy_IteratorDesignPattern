package org.design_patterns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmployeeHierarchyCollection hierarchyCollection = new EmployeeHierarchyCollection("test");
        var iterator = hierarchyCollection.createEmployeeCoWorkerIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getNext().getName());
        }
    }
}