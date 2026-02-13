<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:0F172A,100:2563EB&height=240&section=header&text=Java%20Advanced%20OOP%20Assignments&fontSize=38&fontColor=ffffff&animation=fadeIn&fontAlignY=38&desc=Interactive%20CLI%20Application%20%7C%20Clean%20OOP%20Architecture&descAlignY=62" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?size=22&center=true&vCenter=true&width=900&lines=Abstract+Classes;Inheritance+%26+Overriding;Interfaces+%26+Polymorphism;Interactive+Menu+Driven+Program;Structured+Package+Architecture" />
</p>

---

# 🎯 Project Vision

This project demonstrates real-world Object-Oriented Programming design  
through a modular and interactive CLI-based Java application.

It focuses on:

- Clean architecture  
- Clear separation of concerns  
- Proper use of abstraction  
- Interface-driven design  
- Runtime polymorphism  
- Interactive execution flow  

---

# 🧱 Project Structure

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
└── mainAssignment.java
```

Each package isolates a specific OOP principle.

---

# 🎮 Interactive CLI Experience

When executed, the program displays:

```
===== MAIN MENU =====
1. Shapes
2. Vehicles
3. Employees
0. Exit
```

Users can:

- Navigate through structured submenus  
- Create shapes dynamically  
- Calculate area and perimeter  
- Trigger overridden vehicle behavior  
- Compute salary using interface polymorphism  
- Handle invalid inputs gracefully  

The application is fully menu-driven and interactive.

---

# 🔷 Assignment 4 — Shape Hierarchy

Concept: Abstract Class + Polymorphism

```
Shape (abstract)
   ├── Circle
   ├── Rectangle
   └── Triangle
```

Each shape implements:

- double area()
- double perimeter()

Demonstrates:
- Abstraction  
- Method overriding  
- Runtime polymorphism  
- Encapsulation  

---

# 🚗 Assignment 5 — Vehicle Start Behavior

Concept: Inheritance & Dynamic Binding

```
Vehicle
   ├── Car
   └── Bike
```

Each subclass overrides:

- void start()

Demonstrates:
- Code reuse  
- Dynamic method dispatch  
- Extensible hierarchy  

---

# 💼 Assignment 6 — Employee Compensation

Concept: Interface & Contract-Based Design

```
Payable (interface)
   ├── SalariedEmployee
   └── ContractEmployee
```

Each implementation defines:

- double calculatePay()

Demonstrates:
- Interface as behavioral contract  
- Loose coupling  
- Polymorphism  
- Clean separation of responsibilities  

---

# 🧠 OOP Concepts Applied

| Concept        | Implementation |
|---------------|---------------|
| Abstraction   | Shape abstract class |
| Inheritance   | Car, Bike extend Vehicle |
| Interface     | Payable |
| Polymorphism  | Base references calling subclass implementations |
| Encapsulation | Private fields with getters |
| Overriding    | start() and calculatePay() |

---

# ▶️ Running the Application

Using IDE:
Run mainAssignment.java

Using terminal (Java 17+):

javac -d out $(find . -name "*.java")
java -cp out main.mainAssignment

---

# 🚀 Future Enhancements

- Add JUnit testing layer  
- Convert CLI to REST API using Spring Boot  
- Add logging system  
- Add database persistence  
- Containerize using Docker  
- Implement CI/CD pipeline  

---

# 👩‍💻 Author

Maansi  
GitHub: https://github.com/maansi1  
LinkedIn: https://www.linkedin.com/in/maansi-01a46a25a/

---

Built with structured thinking and clean OOP principles.
