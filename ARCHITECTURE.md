# Architecture

This repository is a multi-module Maven build that catalogs the 23 Gang of Four
design patterns. Each pattern is an independent Maven module so it can be
studied, built, and tested in isolation, while the root `pom.xml` aggregates
them and centralizes dependency and plugin management.

## Build topology

```text
design-patterns-collection (root, packaging=pom)
└── design-patterns/
    ├── creational/   abstractFactory, builder, factoryMethod, prototype, singleton
    ├── structural/   adapter, bridge, composite, decorator, facade, flyweight, proxy
    └── behavioral/   chainOfResponsibility, command, interpreter, iterator, mediator,
                      memento, observer, state, strategy, templateMethod, visitor
```

- **Java release:** 17 (`maven.compiler.release`), source encoding UTF-8.
- **Tests:** JUnit 5 (`junit-jupiter`) + AssertJ, run by `maven-surefire-plugin`.
- **Coverage:** JaCoCo (`./mvnw verify` → `target/site/jacoco/`).
- **Quality (profile `quality` / CI `quality` job):** Spotless (palantir-java-format),
  Checkstyle, SpotBugs.
- **Build entry point:** the Maven Wrapper (`mvnw` / `mvnw.cmd`, `only-script`
  distribution). No local Maven install is required; the wrapper downloads a
  pinned Maven on first use. This is what makes the build identical on Linux,
  macOS, and Windows.

## Module layout

Every module follows the standard Maven layout:

```text
<pattern>/
├── pom.xml                       # inherits from the root POM
└── src/
    ├── main/java/org/example/    # pattern implementation
    └── test/java/                # JUnit 5 end-to-end tests
```

## Pattern catalog

### Creational

| Pattern | Module | Key types | What the e2e test asserts |
|---|---|---|---|
| Abstract Factory | `creational/abstractFactory` | `AbstractFactory`, `Internal/OutsourcedEmployeeFactory`, `Employee` | each factory produces a consistent payroll+report family |
| Builder | `creational/builder` | `MotorcycleBuilder`, `Motorcycle` | fluent build succeeds; missing required fields throw |
| Factory Method | `creational/factoryMethod` | `ServiceFactory`, `IService` (`Pix/Card/Invoice/Balance`) | factory returns the concrete service that behaves correctly |
| Prototype | `creational/prototype` | `Employee`, `Declaration` (`Cloneable`) | clone is a deep copy independent of the original |
| Singleton | `creational/singleton` | `DatabaseConnection` | `getInstance()` returns one shared identity with shared state |

### Structural

| Pattern | Module | Key types | What the e2e test asserts |
|---|---|---|---|
| Adapter | `structural/adapter` | `Morse`, `NumberAdapter`, `INumber` | Morse codes round-trip through the integer adapter |
| Bridge | `structural/bridge` | `CharacterClass` (`Barbarian/Cleric/Druid`) × `Race` | swapping the race implementation changes the computed value |
| Composite | `structural/composite` | `Person` (`Manager`/`Collaborator`), `Company` | nested hierarchy renders uniformly |
| Decorator | `structural/decorator` | `Motorcycle`, `MotorcycleDecorator`, `Chest`, `Honda` | stacking decorators accumulates price and customization |
| Facade | `structural/facade` | `EmployeeFacade`, `Department` singletons | one call aggregates clearance across departments |
| Flyweight | `structural/flyweight` | `SupplierFactory`, `Supplier`, `Book`, `Library` | suppliers are shared by key; unique count stays bounded |
| Proxy | `structural/proxy` | `UserProxy`, `User`, `Administrator` | proxy lazily loads and gates access by authorization |

### Behavioral

| Pattern | Module | Key types | What the e2e test asserts |
|---|---|---|---|
| Chain of Responsibility | `behavioral/chainOfResponsibility` | `CustomerServiceDepartment` chain | a request is handled by the right department or "No Procedure" |
| Command | `behavioral/command` | `ServiceCenter`, `Task` (`Open/CloseTicketTask`) | execute changes state; cancel reverts the last command |
| Interpreter | `behavioral/interpreter` | `ArithmeticExpressionInterpreter` | arithmetic expressions evaluate left-to-right correctly |
| Iterator | `behavioral/iterator` | `Department` (`Iterable`), `Census` | counts iterate the collection without exposing structure |
| Mediator | `behavioral/mediator` | `SMS`, `User`, `Recipient` | messages reach every recipient except the sender |
| Memento | `behavioral/memento` | `Product`, `ProductState` | state snapshots can be saved and restored by index |
| Observer | `behavioral/observer` | `Scholarship`, `Student` | publishing notifies only the students who applied |
| State | `behavioral/state` | `Game`, `GameState` instances | actions transition the game between states |
| Strategy | `behavioral/strategy` | `FileManager`, `FileFormat` (`HTML/PDF/TXT/XML`) | swapping the strategy changes the save output |
| Template Method | `behavioral/templateMethod` | `Room` (`Conference`/`Meeting`) | the skeleton stays fixed while steps vary by subclass |
| Visitor | `behavioral/visitor` | `PaymentVisitor`, `Payment` types | the visitor dispatches per concrete payment type |

## Continuous integration

`.github/workflows/ci.yml` runs on push to `main` and on every pull request:

- **build** — matrix of `{ubuntu, macos, windows}` × JDK `{17, 21}`, `fail-fast: false`,
  running `./mvnw -B -ntp test` (bash is available on all runners, Windows included).
- **coverage** — ubuntu/JDK 17, `./mvnw -B -ntp verify`, uploads JaCoCo to Codecov.
- **quality** — ubuntu/JDK 17, Spotless + Checkstyle + SpotBugs.
