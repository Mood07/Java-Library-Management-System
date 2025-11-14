# 📚 Library Management System (Java + JSON)

A console-based **Java Library Management System** built with clean OOP
architecture and **JSON file storage** using Gson.\
Books are stored permanently in `library.json`, allowing the application
to read and write data across sessions.

This project demonstrates **file persistence**, **Gson-based JSON
serialization**, **CRUD operations**, and **modular Java application
design** --- making it extremely valuable for GitHub portfolios and CVs.

------------------------------------------------------------------------

## 📦 Features

  Feature                 Description
  ----------------------- ------------------------------------------------
  ➕ Add Book             Adds a new book with auto-incrementing ID
  📋 List Books           Displays all books stored in the JSON file
  🔎 Find Book            Search by book ID
  🗑 Remove Book           Delete a book and update storage
  💾 Persistent Storage   All books saved/loaded via `library.json`
  🧱 OOP Structure        Clean separation of models, storage, and logic

------------------------------------------------------------------------

## 🧱 Project Structure

    Library-Management-System/
    │
    ├── src/
    │   ├── Main.java               # User interface & menu
    │   ├── Library.java            # CRUD logic + JSON triggers
    │   ├── Book.java               # Book model
    │   └── JsonStorage.java        # Save/load JSON using Gson
    │
    ├── lib/
    │   └── gson-2.10.1.jar         # JSON library
    │
    ├── out/                        # Compiled .class files
    │
    └── library.json                # Auto-created storage file

------------------------------------------------------------------------

## 🧩 OOP Concepts Used

  Concept                      Application
  ---------------------------- ----------------------------------------
  **Encapsulation**            Book model with private fields
  **Composition**              Library manages a list of Book objects
  **Separation of Concerns**   UI, logic, and storage are isolated
  **Persistence Layer**        JsonStorage handles file operations
  **Dynamic Collections**      Uses ArrayList to store books

------------------------------------------------------------------------

## ▶ How to Run

### 1️⃣ Compile:

``` bash
javac -cp ".;lib\\gson-2.10.1.jar" -d out src\\*.java
```

### 2️⃣ Run:

``` bash
java -cp "out;lib\\gson-2.10.1.jar" Main
```

------------------------------------------------------------------------

## 🖥 Demo Output

    ======================================
           Library Management System       
    ======================================

    ----------- MENU -----------
    1 - Add Book
    2 - List Books
    3 - Find Book by ID
    4 - Remove Book
    0 - Exit
    -----------------------------
    Choose an option:

------------------------------------------------------------------------

## 🧰 Technologies Used

  Category              Tools
  --------------------- --------------------
  **Language**          Java 23
  **JSON Library**      Gson 2.10.1
  **Persistence**       File I/O + JSON
  **Architecture**      Modular OOP
  **IDE**               VS Code / IntelliJ
  **Version Control**   Git & GitHub

------------------------------------------------------------------------

## 🧨 Future Enhancements

-   Search by title/author\
-   Update book information\
-   Category/genre system\
-   Export to CSV\
-   GUI (JavaFX)\
-   REST API version with Spring Boot

------------------------------------------------------------------------

## 👨‍💻 Author

**Berke Arda Türk**\
Data Science & AI Enthusiast \| Computer Science (B.ASc)\
[🌐 Portfolio Website](https://berke-turk.web.app/) • [💼
LinkedIn](https://www.linkedin.com/in/berke-arda-turk/) • [🐙
GitHub](https://github.com/Mood07)
