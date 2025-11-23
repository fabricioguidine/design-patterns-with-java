# 🎨 Design Patterns Collection

[![Java](https://img.shields.io/badge/Java-11+-blue.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-green.svg)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A comprehensive, production-ready implementation of all 23 classic GoF (Gang of Four) design patterns in Java. Each pattern includes complete test coverage, comprehensive documentation, and real-world examples.

## 📑 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Design Patterns](#design-patterns)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Building and Testing](#building-and-testing)
- [Project Structure](#project-structure)
- [Usage Examples](#usage-examples)
- [Pattern Categories](#pattern-categories)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

## 📖 Overview

This repository provides well-structured, production-ready implementations of all 23 classic design patterns from the Gang of Four (GoF) book. The codebase has been fully refactored to English, follows Java best practices, and includes comprehensive documentation and testing.

**Key Highlights:**
- ✅ All 23 GoF design patterns implemented
- ✅ Complete unit test coverage with JUnit 5
- ✅ Comprehensive JavaDoc documentation
- ✅ Real-world, practical examples
- ✅ Maven-based project structure
- ✅ Fully refactored to English
- ✅ Input validation and error handling
- ✅ Production-ready code quality

## ✨ Features

- **🧹 Clean Code**: Well-structured, readable implementations following Java best practices
- **🧪 Comprehensive Testing**: Complete unit test coverage using JUnit 5 with edge case handling
- **📚 Documentation**: JavaDoc comments for all classes and methods
- **🌍 Real Examples**: Practical, real-world use cases for each pattern
- **🔧 Maven Ready**: Each pattern is a standalone Maven project with dependency management
- **🌐 English Codebase**: All class names, method names, and strings translated to English
- **🛡️ Input Validation**: Proper validation and error handling throughout

## 🎯 Design Patterns

### 🏗️ Creational Patterns (5)

These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

| Pattern | Description | Link |
|---------|-------------|------|
| **🏭 Abstract Factory** | Provides an interface for creating families of related objects | [View](design-patterns/creational/abstractFactory) |
| **🔨 Builder** | Constructs complex objects step by step | [View](design-patterns/creational/builder) |
| **🏭 Factory Method** | Creates objects without specifying the exact class | [View](design-patterns/creational/factoryMethod) |
| **📋 Prototype** | Creates objects by cloning existing instances | [View](design-patterns/creational/prototype) |
| **🔒 Singleton** | Ensures a class has only one instance | [View](design-patterns/creational/singleton) |

### 🏛️ Structural Patterns (7)

These patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

| Pattern | Description | Link |
|---------|-------------|------|
| **🔌 Adapter** | Allows incompatible interfaces to work together | [View](design-patterns/structural/adapter) |
| **🌉 Bridge** | Separates abstraction from implementation | [View](design-patterns/structural/bridge) |
| **🌳 Composite** | Composes objects into tree structures | [View](design-patterns/structural/composite) |
| **🎨 Decorator** | Adds behavior to objects dynamically | [View](design-patterns/structural/decorator) |
| **🏢 Facade** | Provides a simplified interface to a complex subsystem | [View](design-patterns/structural/facade) |
| **🪶 Flyweight** | Shares state to support large numbers of fine-grained objects | [View](design-patterns/structural/flyweight) |
| **🎭 Proxy** | Provides a placeholder for another object | [View](design-patterns/structural/proxy) |

### 🎭 Behavioral Patterns (11)

These patterns are concerned with algorithms and the assignment of responsibilities between objects.

| Pattern | Description | Link |
|---------|-------------|------|
| **⛓️ Chain of Responsibility** | Passes requests along a chain of handlers | [View](design-patterns/behavioral/chainOfResponsibility) |
| **📝 Command** | Encapsulates requests as objects | [View](design-patterns/behavioral/command) |
| **🔤 Interpreter** | Defines a representation for grammar and an interpreter | [View](design-patterns/behavioral/interpreter) |
| **🔄 Iterator** | Provides a way to access elements of a collection | [View](design-patterns/behavioral/iterator) |
| **🤝 Mediator** | Defines how objects interact with each other | [View](design-patterns/behavioral/mediator) |
| **💾 Memento** | Captures and restores an object's internal state | [View](design-patterns/behavioral/memento) |
| **👀 Observer** | Notifies multiple objects about state changes | [View](design-patterns/behavioral/observer) |
| **🔄 State** | Allows an object to alter its behavior when its internal state changes | [View](design-patterns/behavioral/state) |
| **⚔️ Strategy** | Defines a family of algorithms and makes them interchangeable | [View](design-patterns/behavioral/strategy) |
| **📄 Template Method** | Defines the skeleton of an algorithm | [View](design-patterns/behavioral/templateMethod) |
| **👨‍💼 Visitor** | Separates algorithms from the objects they operate on | [View](design-patterns/behavioral/visitor) |

## 🚀 Getting Started

### 📋 Prerequisites

Before you begin, ensure you have the following installed:

- **☕ Java Development Kit (JDK) 11 or higher**
  - Download from [Oracle](https://www.oracle.com/java/technologies/downloads/) or [OpenJDK](https://openjdk.org/)
  - Verify installation: `java -version`

- **📦 Apache Maven 3.6 or higher**
  - Download from [Maven Website](https://maven.apache.org/download.cgi)
  - Verify installation: `mvn -version`

- **🔀 Git** (for cloning the repository)
  - Download from [Git Website](https://git-scm.com/downloads)

### 💻 Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/fabricioguidine/repository-organizer.git
   cd repository-organizer
   ```

2. **Verify your environment**
   ```bash
   java -version
   mvn -version
   ```

3. **Build the project**
   ```bash
   mvn clean install
   ```

## 🔨 Building and Testing

### 🏗️ Build All Patterns

To build all design patterns at once:

```bash
mvn clean install
```

This will compile all patterns, run all tests, and package the artifacts.

### 📦 Build Individual Pattern

Navigate to a specific pattern directory and build:

```bash
cd design-patterns/creational/abstractFactory
mvn clean install
```

### 🧪 Run All Tests

```bash
mvn test
```

### 🎯 Run Tests for Specific Pattern

```bash
cd design-patterns/creational/singleton
mvn test
```

### 🔍 Run Specific Test Class

```bash
cd design-patterns/creational/abstractFactory
mvn test -Dtest=EmployeeTest
```

### ⏭️ Build Without Tests

```bash
mvn clean install -DskipTests
```

## 📁 Project Structure

```
repository-organizer/
├── design-patterns/
│   ├── creational/
│   │   ├── abstractFactory/
│   │   ├── builder/
│   │   ├── factoryMethod/
│   │   ├── prototype/
│   │   └── singleton/
│   ├── structural/
│   │   ├── adapter/
│   │   ├── bridge/
│   │   ├── composite/
│   │   ├── decorator/
│   │   ├── facade/
│   │   ├── flyweight/
│   │   └── proxy/
│   └── behavioral/
│       ├── chainOfResponsibility/
│       ├── command/
│       ├── interpreter/
│       ├── iterator/
│       ├── mediator/
│       ├── memento/
│       ├── observer/
│       ├── state/
│       ├── strategy/
│       ├── templateMethod/
│       └── visitor/
├── pom.xml                    # Parent Maven POM
├── LICENSE                    # MIT License
└── README.md                  # This file
```

Each pattern follows a standard Maven project structure:

```
<pattern-name>/
├── pom.xml                    # Maven project configuration
├── src/
│   ├── main/java/org/example/ # Source code with JavaDoc
│   └── test/java/             # Comprehensive unit tests
```

## 💡 Usage Examples

### 🏭 Abstract Factory Pattern

```java
// Create a factory for internal employees
AbstractFactory factory = new InternalEmployeeFactory();
Employee employee = new Employee(factory);

// Generate payroll and report
String payroll = employee.generatePayroll();
String report = employee.generateReport();
```

### 🔒 Singleton Pattern

```java
// Get the singleton instance
DatabaseConnection connection = DatabaseConnection.getInstance();
connection.connect("jdbc:mysql://localhost:3306/mydb", "user", "password");
```

### ⚔️ Strategy Pattern

```java
// Create a user with different file format strategies
User user = new User();
String result = user.savePDF("document.pdf");
String result2 = user.saveXML("data.xml");
```

### 🔨 Builder Pattern

```java
// Build a motorcycle step by step
Motorcycle motorcycle = new MotorcycleBuilder()
    .setBrand("Honda")
    .setModel("CBR")
    .setYear(2023)
    .setColor("Red")
    .setPrice(15000.0f)
    .build();
```

## 📚 Pattern Categories

### 🏗️ Creational Patterns

These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

**Key Patterns:**
- **🏭 Abstract Factory**: Create families of related objects without specifying their concrete classes
- **🔨 Builder**: Construct complex objects step by step with validation
- **🏭 Factory Method**: Delegate object creation to subclasses
- **📋 Prototype**: Clone objects for creation instead of creating new instances
- **🔒 Singleton**: Ensure a class has only one instance with global access

### 🏛️ Structural Patterns

These patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

**Key Patterns:**
- **🔌 Adapter**: Make incompatible interfaces compatible
- **🌉 Bridge**: Separate abstraction from implementation
- **🌳 Composite**: Compose objects into tree structures to represent part-whole hierarchies
- **🎨 Decorator**: Add responsibilities to objects dynamically
- **🏢 Facade**: Provide a unified interface to a complex subsystem
- **🪶 Flyweight**: Share state to reduce memory usage for large numbers of objects
- **🎭 Proxy**: Control access to objects, providing a placeholder

### 🎭 Behavioral Patterns

These patterns are concerned with algorithms and the assignment of responsibilities between objects.

**Key Patterns:**
- **⛓️ Chain of Responsibility**: Pass requests along a chain of handlers
- **📝 Command**: Encapsulate requests as objects
- **🔤 Interpreter**: Define grammar representation and interpreter
- **🔄 Iterator**: Access elements of a collection sequentially
- **🤝 Mediator**: Define how objects interact with each other
- **💾 Memento**: Capture and restore an object's internal state
- **👀 Observer**: Notify multiple objects about state changes
- **🔄 State**: Alter an object's behavior when its internal state changes
- **⚔️ Strategy**: Define a family of algorithms and make them interchangeable
- **📄 Template Method**: Define the skeleton of an algorithm
- **👨‍💼 Visitor**: Separate algorithms from the objects they operate on

## 🤝 Contributing

This project welcomes contributions and suggestions. Most contributions require you to agree to a Contributor License Agreement (CLA) declaring that you have the right to, and actually do, grant us the rights to use your contribution.

### 📝 How to Contribute

1. **🍴 Fork the repository**
   ```bash
   git fork https://github.com/fabricioguidine/repository-organizer.git
   ```

2. **🌿 Create a feature branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

3. **✏️ Make your changes**
   - Follow Java naming conventions
   - Add JavaDoc comments for all public classes and methods
   - Write unit tests for all new code
   - Ensure all tests pass

4. **💾 Commit your changes**
   ```bash
   git commit -m "Add: Description of your changes"
   ```

5. **📤 Push to your branch**
   ```bash
   git push origin feature/your-feature-name
   ```

6. **🔄 Open a Pull Request**
   - Provide a clear description of your changes
   - Reference any related issues
   - Ensure all CI checks pass

### 📋 Code Style Guidelines

- Follow Java naming conventions (PascalCase for classes, camelCase for methods)
- Add JavaDoc comments for all public classes and methods
- Write unit tests with JUnit 5 for all new code
- Use `@DisplayName` annotations for better test readability
- Ensure all tests pass before submitting
- Add input validation where appropriate
- Handle exceptions properly

### 🐛 Reporting Issues

If you find a bug or have a suggestion, please open an issue on GitHub with:
- A clear title and description
- Steps to reproduce (for bugs)
- Expected vs actual behavior
- Environment details (Java version, Maven version, OS)

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📚 Additional Resources

- 📖 [Design Patterns: Elements of Reusable Object-Oriented Software](https://en.wikipedia.org/wiki/Design_Patterns) - Original GoF book
- ☕ [Java Documentation](https://docs.oracle.com/javase/) - Official Java documentation
- 📦 [Maven Documentation](https://maven.apache.org/guides/) - Maven build tool documentation
- 🧪 [JUnit 5 Documentation](https://junit.org/junit5/docs/current/user-guide/) - Testing framework documentation

