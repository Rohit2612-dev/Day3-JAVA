# Day3-JAVA
Understanding how arrays are declared, accessed, and manipulated in Java.  Learning the purpose and behavior of the final keyword.  Using enums effectively for clean and maintainable code.

This repository contains a collection of Java programs demonstrating fundamental concepts such as Object-Oriented Programming (OOP) principles (Inheritance, Polymorphism), class design, Enums, the use of the `final` keyword, and array manipulation.

---

## 🚀 Project Overview

The core of this repository is a simple **Employee Management System (EMS)** demonstrating OOP concepts like inheritance between `Employee`, `Developer`, and `SalesPerson`.

It also includes standalone examples for:
* Enums (`GenderType`)
* Arrays (`Array1`)
* The `final` keyword (`FinalDemo`)
* Polymorphism/Inheritance in a Geometry context (`Circle`, `Shape`)

---

## 🛠️ Setup and Execution

### Prerequisites

* Java Development Kit (JDK) 8 or higher installed.

### Running the Employee Management System

The main entry point for the EMS is the `TestEmployeeSystem.java` file.

1.  **Compile:** Navigate to the source directory and compile the files. Since the EMS classes are within the package `org.ycpait.EmpManagementSystem.entity`, you'll need to compile from the root:
    ```bash
    javac -d . org/ycpait/EmpManagementSystem/TestEmployeeSystem.java
    ```
2.  **Run:**
    ```bash
    java org.ycpait.EmpManagementSystem.TestEmployeeSystem
    ```

### Running Other Examples

To run other examples, compile and run them directly (assuming they are in the default package, except where noted):

* **`TestEnum.java`:**
    ```bash
    javac TestEnum.java GenderType.java
    java TestEnum
    ```
* **`Array1.java`:** This file requires command-line arguments to avoid an `ArrayIndexOutOfBoundsException` on the first line.
    ```bash
    javac Array1.java
    java Array1 "some_argument"
    ```
* **`FinalDemo.java`:** This is a simple demo; running it will not produce output but is used to demonstrate compilation behavior of the `final` keyword.
    ```bash
    javac FinalDemo.java
    java FinalDemo
    ```

---

## 📂 File Descriptions

### Employee Management System (EMS) Files

| File Name | Description |
| :--- | :--- |
| `Employee.java` | **Base class** for all employees. It manages common attributes like `name`, `age`, `salary`, and a static `id`. Contains the base `showDetails()` method. |
| `Developer.java` | **Subclass** of `Employee`. Adds a `bonus` attribute. It overrides `calculateSalary()` to include the bonus and overrides `showDetails()`. |
| `SalesPerson.java` | **Subclass** of `Employee`. Adds `sales` and `CommissionPerSale` attributes. It overrides `calculateSalary()` to include commission and overrides `showDetails()`. |
| `TestEmployeeSystem.java` | The **main application** for the EMS. It uses a `Scanner` for user interaction to register and display employee details (`Employee`, `SalesPerson`, and `Developer`). |

### Utility & Other Demo Files

| File Name | Description |
| :--- | :--- |
| `GenderType.java` | Defines a simple **Java Enum** with `MALE`, `FEMALE`, and `TRANSGENDER` constants. |
| `TestEnum.java` | Demonstrates how to use the `GenderType` enum. |
| `Array1.java` | Demonstrates the declaration, initialization, and iteration of arrays in Java, including the basic `for` loop and the **enhanced `for-in` loop**. *Note: Requires a command-line argument to run.* |
| `FinalDemo.java` | Shows the usage of the **`final` keyword** for declaring constant variables (`PI`, `MAX_HEIGHT`). |

### Geometry Application Files (Incomplete/Demo)

| File Name | Description |
| :--- | :--- |
| `Shape.java` | *(Missing from upload, but implied base class)*. Likely an **abstract class** defining a common structure for shapes. |
| `Circle.java` | A concrete shape class extending the (implied) `Shape` class. Demonstrates method **overriding** (`draw()`, `calculateArea()`) and the use of the `@Override` annotation. |
| `GeometryApplication.java`| Demonstrates **polymorphism** (UpCasting and DownCasting) using the `Shape` and `Circle` classes. |

---

## 💡 Key Concepts Demonstrated

* **Inheritance:** `Developer` and `SalesPerson` extend `Employee`.
* **Polymorphism:** Methods like `showDetails()` and `calculateSalary()` are overridden in subclasses, and the `GeometryApplication` demonstrates UpCasting (`s = c`) and DownCasting (`c = (Circle)s`).
* **Encapsulation:** Use of private fields and public getter/setter methods in all entity classes.
* **Constants:** Use of the `final` keyword in `FinalDemo.java`.
* **Enums:** Defining and using a type-safe list of constants in `GenderType.java`.
* **Arrays:** Different ways to declare, initialize, and iterate over arrays.
