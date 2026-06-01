# design-patterns-with-java

Hands-on implementations of the 23 Gang of Four design patterns in Java, for study.
Each pattern lives in its own Maven module with a small, self-contained example and JUnit 5 tests.

[![CI](https://github.com/fabricioguidine/design-patterns-with-java/actions/workflows/ci.yml/badge.svg)](https://github.com/fabricioguidine/design-patterns-with-java/actions/workflows/ci.yml) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE) [![Java](https://img.shields.io/badge/Java-17%2B-orange.svg?logo=openjdk&logoColor=white)](https://openjdk.org) [![Maven](https://img.shields.io/badge/build-Maven-C71A36.svg?logo=apachemaven&logoColor=white)](https://maven.apache.org)

A multi-module Maven project that groups every classic GoF pattern under one of the three
canonical categories: Creational, Structural, and Behavioral. The root POM aggregates all
modules and centralizes dependency and plugin management (JUnit 5, AssertJ, JaCoCo, Spotless,
Checkstyle, SpotBugs). Each module uses the base package `org.example`.

## Patterns

### Creational

| Pattern | Note | Path |
|---|---|---|
| Abstract Factory | Create families of related objects without naming concrete classes | [`creational/abstractFactory`](design-patterns/creational/abstractFactory) |
| Builder | Construct a complex object step by step | [`creational/builder`](design-patterns/creational/builder) |
| Factory Method | Defer instantiation to a factory returning a common interface | [`creational/factoryMethod`](design-patterns/creational/factoryMethod) |
| Prototype | Create new objects by cloning an existing instance | [`creational/prototype`](design-patterns/creational/prototype) |
| Singleton | Ensure a class has a single, globally accessible instance | [`creational/singleton`](design-patterns/creational/singleton) |

### Structural

| Pattern | Note | Path |
|---|---|---|
| Adapter | Make an incompatible interface usable through a wrapper | [`structural/adapter`](design-patterns/structural/adapter) |
| Bridge | Decouple an abstraction from its implementation | [`structural/bridge`](design-patterns/structural/bridge) |
| Composite | Treat individual objects and compositions uniformly | [`structural/composite`](design-patterns/structural/composite) |
| Decorator | Add responsibilities to an object dynamically | [`structural/decorator`](design-patterns/structural/decorator) |
| Facade | Expose a simplified interface over a subsystem | [`structural/facade`](design-patterns/structural/facade) |
| Flyweight | Share fine-grained objects to reduce memory use | [`structural/flyweight`](design-patterns/structural/flyweight) |
| Proxy | Provide a surrogate that controls access to an object | [`structural/proxy`](design-patterns/structural/proxy) |

### Behavioral

| Pattern | Note | Path |
|---|---|---|
| Chain of Responsibility | Pass a request along a chain of handlers | [`behavioral/chainOfResponsibility`](design-patterns/behavioral/chainOfResponsibility) |
| Command | Encapsulate a request as an object | [`behavioral/command`](design-patterns/behavioral/command) |
| Interpreter | Evaluate sentences of a small language | [`behavioral/interpreter`](design-patterns/behavioral/interpreter) |
| Iterator | Traverse a collection without exposing its structure | [`behavioral/iterator`](design-patterns/behavioral/iterator) |
| Mediator | Centralize communication between objects | [`behavioral/mediator`](design-patterns/behavioral/mediator) |
| Memento | Capture and restore an object's state | [`behavioral/memento`](design-patterns/behavioral/memento) |
| Observer | Notify dependents when a subject changes | [`behavioral/observer`](design-patterns/behavioral/observer) |
| State | Alter behavior when internal state changes | [`behavioral/state`](design-patterns/behavioral/state) |
| Strategy | Make a family of algorithms interchangeable | [`behavioral/strategy`](design-patterns/behavioral/strategy) |
| Template Method | Define an algorithm skeleton, defer steps to subclasses | [`behavioral/templateMethod`](design-patterns/behavioral/templateMethod) |
| Visitor | Add operations to a type hierarchy without changing it | [`behavioral/visitor`](design-patterns/behavioral/visitor) |

## Build & run

Requires JDK 17+ (CI builds against 17 and 21) and Apache Maven 3.6+. All commands run from the
repository root.

Build and test the whole project:

```powershell
mvn -B verify
```

Run only the tests:

```powershell
mvn -B test
```

Build a single pattern (and its dependencies), e.g. Singleton:

```powershell
mvn -B -pl design-patterns/creational/singleton -am verify
```

Run the quality profile (Spotless, Checkstyle, SpotBugs):

```powershell
mvn -B verify -Pquality
```

## Project structure

```text
design-patterns-with-java/
├── pom.xml                       # Parent aggregator POM (23 modules)
├── config/                       # Checkstyle, SpotBugs config
├── design-patterns/
│   ├── creational/               # abstractFactory, builder, factoryMethod, prototype, singleton
│   ├── structural/               # adapter, bridge, composite, decorator, facade, flyweight, proxy
│   └── behavioral/               # chainOfResponsibility, command, interpreter, iterator, mediator,
│                                 # memento, observer, state, strategy, templateMethod, visitor
└── .github/workflows/ci.yml      # Build, test, and quality CI
```

Each module follows the standard Maven layout, with the implementation under
`src/main/java/org/example/` and JUnit 5 tests under `src/test/java/`.

## License

Released under the [MIT License](LICENSE).
