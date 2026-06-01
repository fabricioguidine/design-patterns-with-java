<div align="center">

<img src=".github/assets/banner.svg" alt="design-patterns-with-java" width="100%" />

[![CI](https://github.com/fabricioguidine/design-patterns-with-java/actions/workflows/ci.yml/badge.svg)](https://github.com/fabricioguidine/design-patterns-with-java/actions/workflows/ci.yml) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE) [![Java](https://img.shields.io/badge/Java-17+-orange.svg?logo=openjdk&logoColor=white)](https://openjdk.org) [![Maven](https://img.shields.io/badge/build-Maven-C71A36.svg?logo=apachemaven&logoColor=white)](https://maven.apache.org)

</div>

> Hands-on implementations of the 23 Gang of Four design patterns in Java, for study.

A multi-module Maven project where every classic GoF design pattern lives in its own module under one of the three canonical categories: Creational, Structural, and Behavioral. Each module ships a small, self-contained example and JUnit 5 tests.

## Table of Contents

- [Patterns implemented](#patterns-implemented)
  - [Creational](#creational)
  - [Structural](#structural)
  - [Behavioral](#behavioral)
- [Architecture](#architecture)
- [Requirements](#requirements)
- [Build and run](#build-and-run)
- [Testing](#testing)
- [Cross-platform note](#cross-platform-note)
- [Project structure](#project-structure)
- [License](#license)

See [ARCHITECTURE.md](ARCHITECTURE.md) for the full pattern catalog and build/test layout.

## Patterns implemented

All 23 GoF patterns are present, grouped by category. Each module uses the base package `org.example`.

### Creational

| Pattern | Module | Intent |
|---|---|---|
| Abstract Factory | `creational/abstractFactory` | Create families of related objects without naming concrete classes |
| Builder | `creational/builder` | Construct a complex object step by step |
| Factory Method | `creational/factoryMethod` | Defer instantiation to a factory that returns a common interface |
| Prototype | `creational/prototype` | Create new objects by cloning an existing instance |
| Singleton | `creational/singleton` | Ensure a class has a single, globally accessible instance |

### Structural

| Pattern | Module | Intent |
|---|---|---|
| Adapter | `structural/adapter` | Make an incompatible interface usable through a wrapper |
| Bridge | `structural/bridge` | Decouple an abstraction from its implementation |
| Composite | `structural/composite` | Treat individual objects and compositions uniformly |
| Decorator | `structural/decorator` | Add responsibilities to an object dynamically |
| Facade | `structural/facade` | Expose a simplified interface over a subsystem |
| Flyweight | `structural/flyweight` | Share fine-grained objects to reduce memory use |
| Proxy | `structural/proxy` | Provide a surrogate that controls access to an object |

### Behavioral

| Pattern | Module | Intent |
|---|---|---|
| Chain of Responsibility | `behavioral/chainOfResponsibility` | Pass a request along a chain of handlers |
| Command | `behavioral/command` | Encapsulate a request as an object |
| Interpreter | `behavioral/interpreter` | Evaluate sentences of a small language |
| Iterator | `behavioral/iterator` | Traverse a collection without exposing its structure |
| Mediator | `behavioral/mediator` | Centralize communication between objects |
| Memento | `behavioral/memento` | Capture and restore an object's state |
| Observer | `behavioral/observer` | Notify dependents when a subject changes |
| State | `behavioral/state` | Alter behavior when internal state changes |
| Strategy | `behavioral/strategy` | Make a family of algorithms interchangeable |
| Template Method | `behavioral/templateMethod` | Define an algorithm skeleton, defer steps to subclasses |
| Visitor | `behavioral/visitor` | Add operations to a type hierarchy without changing it |

## Architecture

```mermaid
graph TD
    Root["design-patterns-collection (parent POM)"]

    Root --> C[Creational]
    Root --> S[Structural]
    Root --> B[Behavioral]

    C --> C1[Abstract Factory]
    C --> C2[Builder]
    C --> C3[Factory Method]
    C --> C4[Prototype]
    C --> C5[Singleton]

    S --> S1[Adapter]
    S --> S2[Bridge]
    S --> S3[Composite]
    S --> S4[Decorator]
    S --> S5[Facade]
    S --> S6[Flyweight]
    S --> S7[Proxy]

    B --> B1[Chain of Responsibility]
    B --> B2[Command]
    B --> B3[Interpreter]
    B --> B4[Iterator]
    B --> B5[Mediator]
    B --> B6[Memento]
    B --> B7[Observer]
    B --> B8[State]
    B --> B9[Strategy]
    B --> B10[Template Method]
    B --> B11[Visitor]
```

The root `pom.xml` is a `pom`-packaged aggregator that declares all 23 modules and centralizes dependency and plugin management (JUnit 5, AssertJ, JaCoCo, Spotless, Checkstyle, SpotBugs).

## Requirements

- JDK 17 or higher (CI builds against 17 and 21)
- No local Maven install required — the project ships the [Maven Wrapper](https://maven.apache.org/wrapper/) (`mvnw` / `mvnw.cmd`), which downloads a pinned Maven for you on first use.

Verify your toolchain:

```bash
java -version
```

## Build and run

All commands run from the repository root and apply across every module. The
wrapper builds identically on Linux, macOS, and Windows.

**Linux / macOS** (or Git Bash / WSL on Windows):

```bash
./mvnw -B verify          # build + test + coverage
./mvnw -B test            # run the full test suite
./mvnw -B clean install -DskipTests   # compile + install, skip tests
```

**Windows** (PowerShell / cmd):

```powershell
.\mvnw.cmd -B verify
.\mvnw.cmd -B test
.\mvnw.cmd -B clean install -DskipTests
```

Build a single pattern (example: Singleton):

```bash
./mvnw -B -pl design-patterns/creational/singleton -am verify
```

Run the quality profile (Spotless, Checkstyle, SpotBugs):

```bash
./mvnw -B verify -Pquality
```

## Testing

Every pattern module ships JUnit 5 end-to-end tests under `src/test/java` that
exercise each pattern's public behavior (for example: the Factory Method
returns the correct concrete service, Observer notifications propagate to
applicants, Strategy swapping changes the output, the Singleton returns one
identity, and Decorator composition accumulates price and customization). Run
them all with:

```bash
./mvnw -B test        # ./mvnw.cmd -B test on Windows
```

Test reports are written to each module's `target/surefire-reports/`. Coverage
(JaCoCo) is produced by `./mvnw -B verify` under `target/site/jacoco/`.

## Cross-platform note

The build is verified on Linux, macOS, and Windows against JDK 17 and 21 via
the CI matrix. Sources read no OS-specific file paths and rely only on the JDK
and the Maven Wrapper, so a clean checkout builds the same way on every
platform — only the wrapper launcher differs (`./mvnw` vs `.\mvnw.cmd`).

## Project structure

```text
design-patterns-with-java/
├── pom.xml                       # Parent aggregator POM (23 modules)
├── mvnw, mvnw.cmd, .mvn/         # Maven Wrapper (no local Maven needed)
├── config/                       # Checkstyle, SpotBugs config
├── design-patterns/
│   ├── creational/               # abstractFactory, builder, factoryMethod, prototype, singleton
│   ├── structural/               # adapter, bridge, composite, decorator, facade, flyweight, proxy
│   └── behavioral/               # chainOfResponsibility, command, interpreter, iterator,
│                                 # mediator, memento, observer, state, strategy,
│                                 # templateMethod, visitor
├── .github/workflows/ci.yml      # Build, test, and quality CI
└── LICENSE
```

Each module follows the standard Maven layout:

```text
<pattern>/
├── pom.xml
└── src/
    ├── main/java/org/example/    # Pattern implementation
    └── test/java/                # JUnit 5 tests
```

## License

Released under the [MIT License](LICENSE).
