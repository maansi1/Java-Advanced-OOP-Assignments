<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:111827,100:2563EB&height=220&section=header&text=Java%20Advanced%20OOP%20Assignments&fontSize=36&fontColor=ffffff&animation=fadeIn&fontAlignY=38&desc=Interactive%20CLI%20Application%20%7C%20Clean%20OOP%20Architecture&descAlignY=60" />
</p>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?size=22&center=true&vCenter=true&width=850&lines=Abstract+Classes;Inheritance+%26+Overriding;Interfaces+%26+Polymorphism;Interactive+Menu+Driven+Program" />
</p>

---

# 📌 Overview

This project demonstrates **core Object-Oriented Programming principles in Java**  
through a structured and interactive CLI-based application.

✔ Modular package structure  
✔ Clean class hierarchy  
✔ Interactive user-driven execution  
✔ Interview-ready implementation  

---

# 🗂 Project Structure

assignment4_shapes
assignment5_vehicles
assignment6_employees
mainAssignment.java


---

# 🎮 Interactive CLI Experience

When you run the program:

===== MAIN MENU =====

Shapes

Vehicles

Employees

Exit


Users can:

- Create shapes and calculate area/perimeter
- Start different types of vehicles
- Calculate employee compensation
- Navigate through sub-menus dynamically

The application validates inputs and handles incorrect selections gracefully.

---

# 🔷 Assignment 4 – Shape Hierarchy

### Concept: Abstract Classes + Polymorphism

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
✔ Demonstrates runtime polymorphism

🚗 Assignment 5 – Vehicle Behavior
Concept: Inheritance & Dynamic Binding
Vehicle
   ├── Car
   └── Bike
Each subclass overrides:

void start();
✔ Demonstrates inheritance
✔ Demonstrates dynamic method dispatch
✔ Demonstrates clean class extension

💼 Assignment 6 – Employee Compensation
Concept: Interface & Contract-Based Design
Payable (interface)
   ├── SalariedEmployee
   └── ContractEmployee
Each class implements:

double calculatePay();
✔ Demonstrates interface usage
✔ Demonstrates polymorphism
✔ Encourages loose coupling

🧠 OOP Concepts Applied
Concept	Where Implemented
Abstraction	Shape abstract class
Inheritance	Car, Bike extend Vehicle
Interface	Payable
Polymorphism	Base references to subclass objects
Encapsulation	Private fields + getters
Overriding	start() and calculatePay()
▶️ How to Run
🖥 Using IDE
Run mainAssignment.java

💻 Using Terminal (Java 17+)
javac -d out $(find . -name "*.java")
java -cp out main.mainAssignment
💎 Why This Project Is Strong
✔ Clean separation of packages
✔ Demonstrates core OOP pillars clearly
✔ Interactive and user-driven
✔ Structured for scalability
✔ Easy to extend with new features

👩‍💻 Author
Maansi

🔗 GitHub: https://github.com/maansi1
🔗 LinkedIn: https://www.linkedin.com/in/maansi-01a46a25a/

<p align="center"> ⭐ Star this repository if you found it useful! </p>
