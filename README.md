# ☕ Java Practice & Learning Repository

A clean, structured workspace containing daily practice programs, hands-on exercises, and implementation codes developed while mastering the Java programming language.

---

## 📂 Repository Structure

The codebase is organized chronologically into daily folders, each containing standalone executable Java files and concepts:

```text
Java/
├── JavaDay1/        # Daily practice source files
├── JavaDay2/        # Daily practice source files
├── JavaDay3/        # Daily practice source files
├── JavaDay4/        # Daily practice source files
├── JavaDay5/        # Daily practice source files
├── JavaDay6/        # Daily practice source files
├── JavaDay7/        # Daily practice source files
└── JavaDay8/        # Daily practice source files
```

---

## 🚀 Topics Covered (Learning Journey)

Here is a summary of the Java concepts explored and practiced across the daily folders:

### 📅 Day 1: Java Basics
* **Core Syntax:** Program structure, print statements, primitive data types, literals, and type casting.
* **Operators:** Arithmetic, relational, logical, and assignment operators.
* **Control Flow:** Basic conditional structures (`if`, `if-else`, and `if-else-if` ladders).

### 📅 Day 2: Control Flow & Loops
* **Switch & Ternary:** Using `switch` statements and the ternary operator (`? :`).
* **Loop Structures:** Repeating actions with `while`, `do-while`, and `for` loops (including nested loops).

### 📅 Day 3: Classes, Methods & Arrays
* **OOP Foundations:** Creating custom classes, instantiating objects, instance variables, methods, parameters, and return types.
* **Method Overloading:** Implementing methods with the same name but different signatures.
* **Arrays:** Creating and manipulating 1D arrays, 2D arrays, jagged arrays, and iterating using the enhanced `for-each` loop.

### 📅 Day 4: Strings & Encapsulation
* **String Classes:** Immutable strings (`String`) and mutable strings (`StringBuffer`) along with their common methods.
* **Encapsulation:** Restricting access to data fields with `private` access modifiers and accessing them via Getters & Setters.
* **`this` Keyword:** Resolving namespace ambiguity between fields and parameters.

### 📅 Day 5: Constructors, Static Keyword & Anonymous Objects
* **Constructors:** Default and parameterized constructors to initialize instance states.
* **Static Block & Variables:** Understanding class-level state and the static initialization blocks.
* **Class Loading:** Dynamic loading of classes using `Class.forName()`.
* **Anonymous Objects:** Creating objects that are instantiated but not assigned to reference variables.

### 📅 Day 6: Inheritance & Constructor Chaining
* **Inheritance:** Designing hierarchical relationships (single and multilevel inheritance with classes like `Calc`, `AdvCalc`, and `VeryAdvCalc`).
* **Constructor Chaining:** Controlling constructor execution flow in inheritance chains using `super()` and `this()` calls.

### 📅 Day 7: Packages & Method Overriding
* **Method Overriding:** Overriding parent class methods in child classes to implement specialized behavior.
* **Packages and Imports:** Grouping and managing classes using packages (`package JavaDay7;`) and utilizing import statements.

### 📅 Day 8: Polymorphism, Object Class Methods & Inner Classes
* **Polymorphism:** Understanding dynamic method dispatch and referencing subclass instances via superclass variables.
* **Object Methods Overriding:** Customizing inherited `toString()` and `equals()` methods for class-specific comparisons and representation.
* **`final` Keyword & Inner Classes:** Exploring the restriction of method overriding using the `final` keyword and declaring nested/inner classes.

---

## 📚 Learning Reference

This practice repository follows the structured learning path of the following course:
* **Course:** [Telusko - Complete Java Course (YouTube)](https://www.youtube.com/watch?v=q6z_UCBM5Ek)

---

## 🛠️ Prerequisites & Setup

To compile and run the programs in this repository, ensure you have the **Java Development Kit (JDK)** installed on your machine.

### 1. Verification
Verify if Java is installed and configured on your path by running:
```bash
java -version
javac -version
```

### 2. Recommended Setup
- **JDK Version:** JDK 17 or higher is recommended.
- **Preferred IDEs/Editors:**
  - **VS Code** (with the *Extension Pack for Java* installed)
  - **IntelliJ IDEA**
  - **Eclipse**

---

## 🚀 How to Run the Code

You can compile and run any of the daily programs directly from your terminal.

### Step 1: Compile the Program
Navigate to the root directory of this repository and compile the target Java file using the Java compiler (`javac`):
```bash
javac JavaDay6/Main.java
```

### Step 2: Run the Executable
Execute the compiled bytecode using the Java runner (`java`). Make sure to specify the package-relative path:
```bash
java JavaDay6.Main
```

---

## ⚙️ Environment Configuration (Windows)

If the commands `java` or `javac` are not recognized, follow these steps to add Java to your System PATH:
1. Search for **Edit the system environment variables** in the Windows Search Bar.
2. Click **Environment Variables...** at the bottom right.
3. Under **System Variables**, select the `Path` variable and click **Edit...**.
4. Click **New** and append the path to your JDK's `bin` folder (e.g., `C:\Program Files\Java\jdk-21\bin`).
5. Click **OK** to save and apply the changes. Close and reopen your terminal.