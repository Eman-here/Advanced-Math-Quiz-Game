# Advanced Math Quiz

A Java-based desktop application that presents users with randomized addition and subtraction questions through a graphical user interface (GUI). The quiz tracks the user's score in real time and saves the final result to a text file upon completion. The project demonstrates core Object-Oriented Programming (OOP) concepts including abstraction, inheritance, polymorphism, event handling, collections, and file I/O — all built using Java Swing.

---

## 👥 Group Members

| Full Name | CMS ID | Section | Department |
|---|---|---|---|
| Eman ul Mumtaz | 023-25-0029 | E | Computer Science |
| Nihaal | 023-25-0088 | E | Computer Science |

---

## 📌 Purpose

The purpose of this project is to build an interactive Math Quiz application that reinforces foundational Java programming concepts. It is designed to help students practice arithmetic while demonstrating how OOP principles can be applied in a real-world GUI application.

---

## 🧩 Main Modules

| Module | Description |
|---|---|
| `Question` (Abstract Class) | Base class defining the structure for all question types |
| `AdditionQuestion` | Subclass that generates and evaluates addition questions |
| `SubtractionQuestion` | Subclass that generates and evaluates subtraction questions |
| `AdvancedMathQuiz` | Main class — handles the GUI, event handling, score tracking, and file saving |

**Key Concepts Used:**
- **Abstraction** — `Question` abstract class
- **Inheritance & Polymorphism** — `AdditionQuestion` and `SubtractionQuestion` extend `Question`
- **Collections** — `ArrayList` used to store and shuffle questions
- **Event Handling** — `ActionListener` for button interactions
- **File Handling** — Score saved to `score.txt` using `FileWriter`

---

## ▶️ How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed
- A terminal / command prompt or any Java IDE (IntelliJ IDEA, Eclipse, NetBeans)

### Steps

**Using Command Line:**

```bash
# Step 1: Clone the repository
git clone https://github.com/YOUR_USERNAME/YOUR_REPO_NAME.git

# Step 2: Navigate into the project folder
cd YOUR_REPO_NAME

# Step 3: Compile the Java file
javac AdvancedMathQuiz.java

# Step 4: Run the application
java AdvancedMathQuiz
```

**Using an IDE:**
1. Open the project folder in your IDE.
2. Open `AdvancedMathQuiz.java`.
3. Click **Run**.

> ⚠️ No database is required for this project. The score is saved locally to a `score.txt` file in the same directory.

---

## 🎥 Demo Video

🔗 https://drive.google.com/file/d/19iLLSrK4-NuR9U8W8C7vJyxRGQt5SBQi/view?usp=drivesdk

---

## 📁 Project Structure

```
📦 AdvancedMathQuiz
 ┣ 📄 AdvancedMathQuiz.java   ← Main source file (all classes included)
 ┣ 📄 README.md               ← Project documentation
 ┗ 📄 score.txt               ← Auto-generated after quiz completion
```
