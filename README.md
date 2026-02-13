# 🚀 Java Advanced OOP Assignments

> A modular, interactive CLI application demonstrating clean Object-Oriented Programming architecture in Java.

---

<p align="center">
  <img src="https://img.shields.io/github/actions/workflow/status/maansi1/Java-Advanced-OOP-Assignments/ci.yml?style=for-the-badge&label=CI%20Build&color=2563EB" />
  <img src="https://img.shields.io/badge/version-1.0.0-1E3A8A?style=for-the-badge" />
  <img src="https://img.shields.io/github/license/maansi1/Java-Advanced-OOP-Assignments?style=for-the-badge&color=0F172A" />
  <img src="https://img.shields.io/badge/Made%20with-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
</p>

---

## 📌 Overview

This project demonstrates core Object-Oriented Programming principles through structured packages and an interactive CLI-based application.

It covers:

- Abstract Classes  
- Inheritance  
- Method Overriding  
- Interfaces  
- Runtime Polymorphism  
- Encapsulation  

---

## 🗂 Project Structure

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

---

## 🎮 Interactive CLI Experience

When executed:

```
===== MAIN MENU =====
1. Shapes
2. Vehicles
3. Employees
0. Exit
```

Users can:

- Create shapes and compute area/perimeter  
- Start different vehicle types  
- Calculate salary using interface-driven design  
- Navigate structured submenus  
- Handle invalid inputs safely  

---

## 🔷 Assignment 4 — Shape Hierarchy

Concept: Abstraction & Polymorphism

```
Shape (abstract)
   ├── Circle
   ├── Rectangle
   └── Triangle
```

Each subclass implements:

- double area()
- double perimeter()

---

## 🚗 Assignment 5 — Vehicle Behavior

Concept: Inheritance & Dynamic Binding

```
Vehicle
   ├── Car
   └── Bike
```

Each subclass overrides:

- void start()

---

## 💼 Assignment 6 — Employee Compensation

Concept: Interface & Contract-Based Design

```
Payable (interface)
   ├── SalariedEmployee
   └── ContractEmployee
```

Each implementation defines:

- double calculatePay()

---

## 🧠 OOP Concepts Applied

| Concept        | Implementation |
|---------------|---------------|
| Abstraction   | Shape abstract class |
| Inheritance   | Car, Bike extend Vehicle |
| Interface     | Payable |
| Polymorphism  | Base references calling subclass methods |
| Encapsulation | Private fields with getters |
| Overriding    | start() and calculatePay() |

---

## ▶️ How to Run

Using IDE:
Run `mainAssignment.java`

Using terminal:

javac -d out $(find . -name "*.java")
java -cp out main.mainAssignment

---

## 📈 Version

Current version: **1.0.0**

---

## 📜 License

This project is licensed under the MIT License.

---

## 👩‍💻 Author

Maansi  
GitHub: https://github.com/maansi1  
LinkedIn: https://www.linkedin.com/in/maansi-01a46a25a/

---

Built with structured thinking and clean OOP principles.
