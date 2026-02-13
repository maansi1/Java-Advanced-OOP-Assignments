# Java Advanced OOP Assignments

> Enterprise-style modular Java application demonstrating clean Object-Oriented Programming architecture and scalable design principles.

---

<p align="center">
  <img src="https://img.shields.io/github/actions/workflow/status/maansi1/Java-Advanced-OOP-Assignments/ci.yml?style=for-the-badge&label=CI%20Build&color=2563EB" />
  <img src="https://img.shields.io/badge/version-1.0.0-1E3A8A?style=for-the-badge" />
  <img src="https://img.shields.io/github/license/maansi1/Java-Advanced-OOP-Assignments?style=for-the-badge&color=0F172A" />
  <img src="https://img.shields.io/badge/platform-Java%2017+-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
</p>

---

## 1. Executive Summary

This repository demonstrates core Object-Oriented Programming principles through a modular CLI-based Java application.

The system is structured to reflect production-style package separation and scalable class design.

The project focuses on:

- Abstraction
- Inheritance
- Interface-driven development
- Runtime polymorphism
- Encapsulation
- Clean separation of concerns

---

## 2. System Architecture

```
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

Each package isolates a specific domain concern, ensuring maintainability and extensibility.

---

## 3. Module Breakdown

### 3.1 Shape Module (Abstraction Layer)

Implements an abstract base class:

```
Shape
 ├── Circle
 ├── Rectangle
 └── Triangle
```

Responsibilities:

- Enforces common contract via abstract methods
- Enables runtime polymorphism
- Encapsulates geometric attributes

---

### 3.2 Vehicle Module (Inheritance Layer)

Hierarchy:

```
Vehicle
 ├── Car
 └── Bike
```

Responsibilities:

- Demonstrates method overriding
- Enables dynamic dispatch
- Encourages code reuse

---

### 3.3 Employee Module (Interface Layer)

Interface-driven contract:

```
Payable
 ├── SalariedEmployee
 └── ContractEmployee
```

Responsibilities:

- Ensures loose coupling
- Supports polymorphic salary calculation
- Follows contract-based programming

---

## 4. Runtime Interaction Flow

The application is interactive and menu-driven:

```
===== MAIN MENU =====
1. Shapes
2. Vehicles
3. Employees
0. Exit
```

The execution layer handles:

- Input validation
- Dynamic navigation
- Controlled program flow
- Safe termination

---

## 5. Core Design Principles Applied

| Principle          | Implementation |
|-------------------|---------------|
| Abstraction        | Shape abstract class |
| Inheritance        | Car, Bike extend Vehicle |
| Interface Segregation | Payable interface |
| Polymorphism       | Base reference calling subclass implementations |
| Encapsulation      | Private fields with controlled access |
| Single Responsibility | Each package handles one domain |

---

## 6. Build & Execution

### Using IDE

Run:

```
mainAssignment.java
```

### Using Terminal (Java 17+)

```
javac -d out $(find . -name "*.java")
java -cp out main.mainAssignment
```

---

## 7. Release Management

Current Version: **1.0.0**

Recommended improvements for production:

- Maven build lifecycle
- Automated JAR generation
- Tagged releases
- Semantic versioning

---

## 8. Testing Strategy (Planned)

Future enhancement:

- JUnit test suite
- Automated coverage reports
- CI validation on pull requests

---

## 9. Scalability Roadmap

Planned enterprise enhancements:

- Convert CLI to REST API (Spring Boot)
- Introduce logging framework
- Add persistence layer (MySQL/PostgreSQL)
- Containerization using Docker
- CI/CD pipeline integration
- API documentation (Swagger/OpenAPI)

---

## 10. Contribution Guidelines

1. Fork the repository
2. Create a feature branch
3. Commit with descriptive messages
4. Open a pull request

All contributions should maintain:

- Clean code principles
- Consistent naming conventions
- Proper encapsulation
- Structured package design

---

## 11. License

Licensed under the MIT License.

---

## 12. Author

Maansi  
GitHub: https://github.com/maansi1  
LinkedIn: https://www.linkedin.com/in/maansi-01a46a25a/

---

This project reflects structured thinking, scalable architecture, and strong foundational Java principles.
