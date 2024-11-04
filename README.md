# EmployeeInformationHierarchy_IteratorDesignPattern

This project demonstrates the **Iterator Design Pattern** by implementing a system for iterating through different types of employee hierarchies in an organization. The design provides a flexible and consistent way to traverse employee data, whether by direct reports, co-workers, or subordinates, without exposing the internal structure of the employee collection.

## Project Structure

The project includes the following components:

1. **Employee (Class)**
   - Represents an employee in the organization.
   - Contains fields for `employeeID` and `name` with getter methods.
   - Serves as a data class to store basic employee information.

2. **EmployeeHierarchyIterator (Interface)**
   - Defines methods for an iterator that traverses employee collections.
   - `getNext()`: Retrieves the next employee in the collection.
   - `hasNext()`: Checks if there are more employees left to iterate through.

3. **EmployeeCoWorkerIterator, EmployeeDirectReportIterator, EmployeeSubOrdinateIterator (Concrete Iterators)**
   - Each of these classes implements `EmployeeHierarchyIterator` and provides specific traversal logic:
     - `EmployeeCoWorkerIterator`: Traverses co-workers in the hierarchy.
     - `EmployeeDirectReportIterator`: Traverses direct reports.
     - `EmployeeSubOrdinateIterator`: Traverses subordinates.
   - Each iterator maintains its position within the collection, moving through the list of employees based on its specific traversal type.

4. **IterableCollection (Interface)**
   - Declares methods for creating different types of iterators.
   - Allows the client code to create iterators without directly interacting with the concrete iterator classes.

5. **EmployeeHierarchyCollection (Concrete Collection)**
   - Implements `IterableCollection`, representing a collection of employees.
   - Provides methods to create instances of the different iterator types:
     - `createEmployeeDirectReportIterator()`
     - `createEmployeeCoWorkerIterator()`
     - `createEmployeeSubOrdinateIterator()`
   - Contains a sample list of employees that can be accessed and iterated over through the defined iterators.

6. **Main (Driver Class)**
   - Demonstrates the use of `EmployeeHierarchyCollection` and iterators to access employees in the hierarchy.
   - Calls `createEmployeeCoWorkerIterator()` to traverse co-workers, printing each employee's name to the console.

## How It Works

1. **Iterator Pattern**:
   - The Iterator Design Pattern is applied here to provide a uniform interface (`EmployeeHierarchyIterator`) for accessing elements within a complex collection (e.g., an employee hierarchy).
   - Each iterator type (`CoWorker`, `DirectReport`, and `SubOrdinate`) implements the same interface, so client code can interact with any type of iterator without knowing the specific implementation details.

2. **Hierarchical Traversal**:
   - `EmployeeHierarchyCollection` acts as the collection, holding employee data and providing factory methods to create different types of iterators.
   - By using iterators, the client can move through the collection according to a specific hierarchy, whether that be direct reports, co-workers, or subordinates.

## Sample Output

Running the `Main` class with the sample hierarchy collection produces output similar to:

```plaintext
Iterating through a graph
Mahmoud
Iterating through a graph
Ahmed
```


## Key Takeaways
- Iterator Design Pattern: Provides a way to access elements in a collection sequentially without exposing the underlying structure, increasing modularity and flexibility.
- Multiple Iterators: Each type of iterator allows for traversing different aspects of the hierarchy, providing a clean separation of concerns and making it easy to add more traversal options if needed.
- Encapsulation of Traversal Logic: By encapsulating traversal within iterators, the main collection class `(EmployeeHierarchyCollection)` remains focused on managing the collection, not how it's traversed.


## Usage
1. Clone the repository and navigate to the project directory.
2. Compile the project files.
3. Run the `Main` class to see the Iterator Pattern in action, which will iterate through a sample list of employees using the co-worker iterator.
