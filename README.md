<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:0F172A,100:2563EB&height=240&section=header&text=Java%20Advanced%20OOP%20Assignments&fontSize=38&fontColor=ffffff&animation=fadeIn&fontAlignY=38&desc=Enterprise-Style%20Modular%20OOP%20Architecture%20%7C%20Interactive%20CLI&descAlignY=62" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?size=22&center=true&vCenter=true&width=950&lines=Abstract+Classes+%7C+Inheritance+%7C+Interfaces;Runtime+Polymorphism+%7C+Encapsulation+%7C+Clean+Architecture;Interactive+Menu-Driven+CLI+Application;Designed+to+look+and+feel+like+a+real+engineering+project" />
</p>

<p align="center">
  <img src="https://img.shields.io/github/actions/workflow/status/maansi1/Java-Advanced-OOP-Assignments/ci.yml?style=for-the-badge&label=CI%20Build&color=2563EB" />
  <img src="https://img.shields.io/badge/version-1.0.0-1E3A8A?style=for-the-badge" />
  <img src="https://img.shields.io/github/license/maansi1/Java-Advanced-OOP-Assignments?style=for-the-badge&color=0F172A" />
  <img src="https://img.shields.io/badge/Made%20with-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
</p>

---

## 1) Executive Summary

This repository demonstrates core **Object-Oriented Programming (OOP)** principles through a modular, interactive **CLI-based Java application**.

The codebase is structured in a production-friendly way:
- isolated domain packages
- clear responsibilities
- scalable class design
- runtime polymorphism and contract-based programming

---

## 2) System Architecture

```text
Java-Advanced-OOP-Assignments/
│
├── assignment4_shapes/
│   ├── Shape.java
│   ├── Circle.java
│   ├── Rectangle.java
│   └── Triangle.java
│
├── assignment5_vehicles/
│   ├── Vehicle.java
│   ├── Car.java
│   └── Bike.java
│
├── assignment6_employees/
│   ├── Payable.java
│   ├── SalariedEmployee.java
│   └── ContractEmployee.java
│
├── mainAssignment.java
└── README.md
```

---

## 3) Modules

### 3.1 Shape Module — Abstraction Layer (Assignment 4)

Hierarchy:

```text
Shape (abstract)
 ├── Circle
 ├── Rectangle
 └── Triangle
```

Contract enforced by:

- `double area()`
- `double perimeter()`

Key outcomes:
- abstraction via abstract class
- overriding in subclasses
- runtime polymorphism

---

### 3.2 Vehicle Module — Inheritance Layer (Assignment 5)

Hierarchy:

```text
Vehicle
 ├── Car
 └── Bike
```

Overridden behavior:

- `void start()`

Key outcomes:
- code reuse via inheritance
- dynamic method dispatch

---

### 3.3 Employee Module — Interface Layer (Assignment 6)

Hierarchy:

```text
Payable (interface)
 ├── SalariedEmployee
 └── ContractEmployee
```

Contract:

- `double calculatePay()`

Key outcomes:
- interface-driven design
- loose coupling
- polymorphism through a common contract

---

## 4) Interactive Runtime Flow

On execution, the CLI displays:

```text
===== MAIN MENU =====
1. Shapes
2. Vehicles
3. Employees
0. Exit
```

The runtime layer supports:
- structured navigation
- input validation
- safe program termination

---

## 5) Design Principles Applied

| Principle | Where it appears |
|----------|-------------------|
| Abstraction | `Shape` abstract class |
| Inheritance | `Car`, `Bike` extend `Vehicle` |
| Interface-based design | `Payable` |
| Polymorphism | base references calling subclass implementations |
| Encapsulation | private fields + getters |
| Separation of concerns | package-level isolation by domain |

---

## 6) Build & Run

### Run via IDE
Run:
- `mainAssignment.java`

### Run via Terminal (Java 17+)

```bash
javac -d out $(find . -name "*.java")
java -cp out mainAssignment
```

> If your `mainAssignment` class is in a package, run using its fully qualified name (example: `java -cp out main.mainAssignment`).

---

## 7) Release Management

**Current Version:** `1.0.0`

Recommended enterprise upgrades:
- Maven build lifecycle
- automatic JAR generation
- tagged GitHub releases
- semantic versioning

---

## 8) Testing Strategy (Roadmap)

Planned improvements:
- JUnit test suite
- coverage reporting (JaCoCo)
- CI gate on pull requests

---

## 9) Enterprise Roadmap

- Convert CLI → REST API (Spring Boot)
- Add logging (SLF4J + Logback)
- Add persistence layer (MySQL/PostgreSQL)
- Dockerize application
- CI/CD pipeline + release automation
- Swagger/OpenAPI documentation

---

## 10) License

MIT License

---

## 11) Author

**Maansi**  
GitHub: https://github.com/maansi1  
LinkedIn: https://www.linkedin.com/in/maansi-01a46a25a/

---

<p align="center">
  Built with clean OOP fundamentals and production-style structure.
</p>
