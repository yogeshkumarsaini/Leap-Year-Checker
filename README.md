# 📅 Leap Year Checker

A **console-based Leap Year Checker** built using **Java** and **Object-Oriented Programming (OOP)** principles.  
This beginner-friendly project allows users to check multiple years in a loop, handles invalid inputs gracefully using exception handling, and follows clean code practices.

---

## 🚀 Features

- ✅ Check whether a year is a leap year
- 🔁 Loop to check multiple years in one run
- 🧱 OOP-based design (separate logic and UI)
- 🚫 Exception handling for invalid inputs
- ⌨️ User input using `Scanner`
- 🧼 Clean, readable, and beginner-friendly code

---

## 🧠 Leap Year Rules

A year is a **Leap Year** if:
- It is divisible by **400**, OR
- It is divisible by **4** but **not divisible by 100**

---

## 🛠️ Technologies Used

- Java
- OOP Concepts
- Exception Handling
- Scanner (User Input)

---

## 📂 Project Structure

```
LeapYearChecker/
│
├── LeapYearService.java // Business logic
├── LeapYearCheckerApp.java // Main application
└── README.md
```

---

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yogeshkumarsaini/LeapYearChecker.git
2. Navigate to the project folder:
   ```bash
   cd LeapYearChecker
3. Compile the program:
   ```bash
   javac LeapYearCheckerApp.java
4. Run the application:
   ```bash
   java LeapYearCheckerApp
---

## 🧪 Sample Output

```sql
📅 Leap Year Checker

Enter a year: 2024
2024 is a Leap Year ✅

Do you want to check another year? (y/n): y

Enter a year: 1900
1900 is NOT a Leap Year ❌
```
---
## 🧩 Concepts Covered

- if–else conditions
- Modulus operator %
- Methods
- Classes & Objects (OOP)
- Loops
- Exception handling
- User input with Scanner

  ---
  ## 📌 Future Enhancements

- 📜 Store checked years in a list
- 📊 Display leap year history
- 🧪 Add JUnit test cases
- 🖥️ GUI version using Swing/JavaFX
