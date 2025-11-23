# Design Patterns Repository

[![Java](https://img.shields.io/badge/Java-11+-blue.svg)](https://www.oracle.com/java/)
[![Maven](https://img.shields.io/badge/Maven-3.6+-green.svg)](https://maven.apache.org/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

> A comprehensive collection of 23 GoF (Gang of Four) design patterns implemented in Java with complete test coverage and documentation.

## 📋 Table of Contents

- [Overview](#overview)
- [Design Patterns](#design-patterns)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Building the Project](#building-the-project)
- [Running Tests](#running-tests)
- [Pattern Categories](#pattern-categories)
- [Contributing](#contributing)
- [License](#license)

## 🎯 Overview

This repository contains well-structured, production-ready implementations of all 23 classic design patterns from the Gang of Four (GoF) book. Each pattern includes:

- ✅ **Clean, refactored code** following Java best practices
- ✅ **Comprehensive unit tests** with JUnit 5
- ✅ **JavaDoc documentation** for all classes and methods
- ✅ **Real-world examples** demonstrating practical usage
- ✅ **Maven project structure** for easy building and dependency management

## 🏗️ Design Patterns

### Creational Patterns

| Pattern | Description | Status |
|---------|-------------|--------|
| [Abstract Factory](design-patterns/abstractFactory) | Provides an interface for creating families of related objects | ✅ |
| [Builder](design-patterns/builder) | Constructs complex objects step by step | ✅ |
| [Factory Method](design-patterns/factoryMethod) | Creates objects without specifying the exact class | ✅ |
| [Prototype](design-patterns/prototype) | Creates objects by cloning existing instances | ✅ |
| [Singleton](design-patterns/singleton) | Ensures a class has only one instance | ✅ |

### Structural Patterns

| Pattern | Description | Status |
|---------|-------------|--------|
| [Adapter](design-patterns/adapter) | Allows incompatible interfaces to work together | ✅ |
| [Bridge](design-patterns/bridge) | Separates abstraction from implementation | ✅ |
| [Composite](design-patterns/composite) | Composes objects into tree structures | ✅ |
| [Decorator](design-patterns/decorator) | Adds behavior to objects dynamically | ✅ |
| [Facade](design-patterns/facade) | Provides a simplified interface to a complex subsystem | ✅ |
| [Flyweight](design-patterns/flyweight) | Shares state to support large numbers of fine-grained objects | ✅ |
| [Proxy](design-patterns/proxy) | Provides a placeholder for another object | ✅ |

### Behavioral Patterns

| Pattern | Description | Status |
|---------|-------------|--------|
| [Chain of Responsibility](design-patterns/chainOfResponsability) | Passes requests along a chain of handlers | ✅ |
| [Command](design-patterns/command) | Encapsulates requests as objects | ✅ |
| [Interpreter](design-patterns/interpreter) | Defines a representation for grammar and an interpreter | ✅ |
| [Iterator](design-patterns/iterator) | Provides a way to access elements of a collection | ✅ |
| [Mediator](design-patterns/mediator) | Defines how objects interact with each other | ✅ |
| [Memento](design-patterns/memento) | Captures and restores an object's internal state | ✅ |
| [Observer](design-patterns/observer) | Notifies multiple objects about state changes | ✅ |
| [State](design-patterns/state) | Allows an object to alter its behavior when its internal state changes | ✅ |
| [Strategy](design-patterns/strategy) | Defines a family of algorithms and makes them interchangeable | ✅ |
| [Template Method](design-patterns/templateMethod) | Defines the skeleton of an algorithm | ✅ |
| [Visitor](design-patterns/visitor) | Separates algorithms from the objects they operate on | ✅ |

## 📁 Project Structure

```
repository-organizer/
├── design-patterns/
│   ├── abstractFactory/
│   │   ├── pom.xml
│   │   ├── src/
│   │   │   ├── main/java/org/example/
│   │   │   └── test/java/
│   ├── adapter/
│   ├── bridge/
│   ├── ... (other patterns)
│   └── README.md
├── .gitignore
├── LICENSE
└── README.md
```

Each pattern follows a standard Maven project structure:

```
<pattern-name>/
├── pom.xml                    # Maven configuration
├── src/
│   ├── main/java/org/example/ # Source code
│   └── test/java/             # Unit tests
└── .gitignore                 # Pattern-specific ignores
```

## 🚀 Getting Started

### Prerequisites

- **Java 11** or higher
- **Maven 3.6+**
- **Git**

### Installation

1. Clone the repository:
```bash
git clone https://github.com/fabricioguidine/repository-organizer.git
cd repository-organizer
```

2. Verify installation:
```bash
java -version
mvn -version
```

## 🔨 Building the Project

### Build All Patterns

To build all design patterns at once:

```bash
mvn clean install
```

### Build Individual Pattern

Navigate to a specific pattern directory and build:

```bash
cd design-patterns/abstractFactory
mvn clean install
```

### Build with Tests

```bash
mvn clean test
```

## 🧪 Running Tests

### Run All Tests

```bash
mvn test
```

### Run Tests for Specific Pattern

```bash
cd design-patterns/singleton
mvn test
```

### Run Specific Test Class

```bash
cd design-patterns/abstractFactory
mvn test -Dtest=EmployeeTest
```

## 📚 Pattern Categories

### Creational Patterns
These patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.

**Key Patterns:**
- **Abstract Factory**: Create families of related objects
- **Builder**: Construct complex objects step by step
- **Factory Method**: Delegate object creation to subclasses
- **Prototype**: Clone objects for creation
- **Singleton**: Ensure single instance existence

### Structural Patterns
These patterns explain how to assemble objects and classes into larger structures while keeping these structures flexible and efficient.

**Key Patterns:**
- **Adapter**: Make incompatible interfaces compatible
- **Bridge**: Separate abstraction from implementation
- **Composite**: Compose objects into tree structures
- **Decorator**: Add responsibilities dynamically
- **Facade**: Provide unified interface to subsystem
- **Flyweight**: Share state to reduce memory usage
- **Proxy**: Control access to objects

### Behavioral Patterns
These patterns are concerned with algorithms and the assignment of responsibilities between objects.

**Key Patterns:**
- **Chain of Responsibility**: Pass requests along a chain
- **Command**: Encapsulate requests as objects
- **Interpreter**: Define grammar representation
- **Iterator**: Access elements sequentially
- **Mediator**: Define object interaction
- **Memento**: Capture and restore state
- **Observer**: Notify dependents of changes
- **State**: Alter behavior with state changes
- **Strategy**: Define interchangeable algorithms
- **Template Method**: Define algorithm skeleton
- **Visitor**: Separate algorithms from objects

## 💡 Usage Examples

### Abstract Factory Example

```java
AbstractFactory factory = new InternalEmployeeFactory();
Employee employee = new Employee(factory);
String payroll = employee.generatePayroll();
```

### Singleton Example

```java
DatabaseConnection connection = DatabaseConnection.getInstance();
```

### Strategy Example

```java
User user = new User();
String result = user.savePDF("document");
```

## 🤝 Contributing

Contributions are welcome! Please follow these guidelines:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-pattern`)
3. Commit your changes (`git commit -m 'Add amazing pattern'`)
4. Push to the branch (`git push origin feature/amazing-pattern`)
5. Open a Pull Request

### Code Style

- Follow Java naming conventions
- Add JavaDoc comments for all public classes and methods
- Write unit tests for all new code
- Ensure all tests pass before submitting

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🙏 Acknowledgments

- Design patterns based on the classic "Design Patterns: Elements of Reusable Object-Oriented Software" by the Gang of Four
- Built with Java and Maven
- Tested with JUnit 5

