<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:0F172A,100:1E3A8A&height=230&section=header&text=Java%20Advanced%20OOP%20Assignments&fontSize=38&fontColor=ffffff&animation=fadeIn&fontAlignY=38&desc=Abstract%20Classes%20%7C%20Inheritance%20%7C%20Interfaces&descAlignY=60" />
</p>

<p align="center">
  <a href="https://github.com/maansi1/Java-Advanced-OOP-Assignments/actions">
    <img src="https://img.shields.io/github/actions/workflow/status/maansi1/Java-Advanced-OOP-Assignments/ci.yml?style=for-the-badge&label=CI&color=2563EB" />
  </a>
  <img src="https://img.shields.io/github/languages/top/maansi1/Java-Advanced-OOP-Assignments?style=for-the-badge&color=1E3A8A" />
  <img src="https://img.shields.io/github/last-commit/maansi1/Java-Advanced-OOP-Assignments?style=for-the-badge&color=0F172A" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?size=22&center=true&vCenter=true&width=850&lines=Clean+OOP+Architecture;Interactive+CLI+Application;Java+%7C+Polymorphism+%7C+Abstraction;Designed+for+Clarity+and+Scalability" />
</p>

---

# 📌 Project Overview

This repository demonstrates the **core pillars of Object-Oriented Programming in Java** through a structured, interactive CLI application.

✔ Abstract Classes  
✔ Inheritance & Overriding  
✔ Interfaces  
✔ Polymorphism  
✔ Encapsulation  

The project is modular, cleanly structured, and interview-ready.

---

# 🏗 Architecture Diagram

            ┌──────────────────┐
            │   mainAssignment │
            └────────┬─────────┘
                     │
┌───────────────────────┼────────────────────────┐
│ │ │
▼ ▼ ▼

assignment4_shapes assignment5_vehicles assignment6_employees
(Abstraction) (Inheritance) (Interface)

Shape Vehicle Payable
├─ Circle ├─ Car ├─ SalariedEmployee
├─ Rectangle └─ Bike └─ ContractEmployee
└─ Triangle


---

# 🔷 Assignment 4 — Shape Hierarchy

### Concept: Abstract Class + Runtime Polymorphism

Shape (abstract)
├── Circle
├── Rectangle
└── Triangle


Each subclass implements:

```java
double area();
double perimeter();
✔ Demonstrates abstraction
✔ Demonstrates method overriding
✔ Demonstrates polymorphism

🚗 Assignment 5 — Vehicle Behavior
Concept: Inheritance & Dynamic Binding
Vehicle
   ├── Car
   └── Bike
Each subclass overrides:

void start();
✔ Code reuse
✔ Runtime method dispatch
✔ Clean class hierarchy

💼 Assignment 6 — Employee Compensation
Concept: Interface & Contract-based Design
Payable (interface)
   ├── SalariedEmployee
   └── ContractEmployee
Each class implements:

double calculatePay();
✔ Interface-based abstraction
✔ Loose coupling
✔ Polymorphic behavior

🎮 Interactive CLI Demo
<p align="center"> <img src="assets/demo.gif" width="750"/> </p>
Replace assets/demo.gif with your actual recorded demo GIF.

▶️ How to Run
🖥 Using IDE
Open project in IntelliJ / Eclipse / VS Code

Run mainAssignment.java

Use interactive menu

💻 Using Terminal (Java 17)
javac -d out $(find . -name "*.java")
java -cp out main.mainAssignment
🧠 OOP Concepts Summary
Concept	Implementation
Abstraction	Shape abstract class
Inheritance	Car, Bike extend Vehicle
Interface	Payable
Polymorphism	Base references calling subclass methods
Encapsulation	Private fields + getters
Overriding	start() & calculatePay()
📚 Key Learning Outcomes
Designing scalable class hierarchies

Applying interface-driven design

Understanding dynamic method dispatch

Structuring modular Java applications

Building interactive CLI programs

💎 Why This Project Stands Out
This project demonstrates:

✔ Clean architectural separation
✔ Strong grasp of core OOP principles
✔ Professional code organization
✔ Interactive user-driven execution
✔ Production-style modular structure

👩‍💻 Author
Maansi

🔗 GitHub: https://github.com/maansi1
🔗 LinkedIn: https://www.linkedin.com/in/maansi-01a46a25a/

<p align="center"> ⭐ If you found this project useful, consider giving it a star! </p> ```
