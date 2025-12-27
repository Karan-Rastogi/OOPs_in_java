# Object-Oriented Programming (OOP) in Java

This folder contains foundational concepts of Java programming, specifically focusing on how Classes, Objects, and the Static keyword function within the language.

# 📂 Contents
classes.txt: Documentation and code examples regarding class definitions, constructors, and object instantiation.

static.txt: Explanations of the static keyword, including static variables, methods, and blocks.

# 🚀 Key Concepts Covered

1. Classes and Objects
In Java, a Class is a blueprint for creating objects. An Object is an instance of a class that contains real values instead of variables.

Encapsulation: Grouping data (variables) and methods together.

Constructors: Special methods used to initialize objects.

2. The static Keyword
The static keyword in Java is used for memory management. It signifies that a member (variable or method) belongs to the class itself rather than to a specific instance (object) of the class.

Static Variables: Shared among all instances of a class.

Static Methods: Can be called without creating an object of the class.

🛠️ How to Use
Since these are .txt files, you can read them directly in your browser or download them to use as a reference while coding.

Navigate to the oops/ directory.

Open classes.txt to understand the structure of a Java class.

Open static.txt to see how shared memory works in Java.

📝 Example Snippet
Java

public class Student {
    String name;          // Instance variable
    static String school; // Static variable (shared)

    // Constructor
    public Student(String name) {
        this.name = name;
    }
}
Happy Coding! ☕
