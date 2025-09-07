🧮 Java Console Calculator

A simple yet feature-rich console-based calculator in Java supporting:

✅ Basic operations (+, -, *, /, %)
✅ Advanced operations (sqrt, fact, power)
✅ History tracking (session-based)
✅ Save history to file
✅ Command-line interface (CLI)

🚀 Features

Basic Arithmetic

Example:

5 + 3
9 * 4


Square Root

Example:

sqrt 25


Factorial

Example:

fact 5


Power

Example:

power 2 10


History

Show history of calculations:

history


Save History to File

Example:

save


(then enter file path, e.g. C:\Users\yourname\Desktop\history.txt)

Quit Application

Exit anytime with:

quit

🖥️ Example Usage
Welcome to a Simple Calculator which has following functions

1.Basic calculations + - / % * 
2.Square root
3.Factorial
4.Power

* Save the history
* Save the history to a file. "save"
* Print the history from a file. "history"

* Enter "quit" to exit from the calculator.


Enter the expression or command
Example 1 : 5 * 2
Example 2 : sqrt 5

> 5 * 2
Result = 10.0

> sqrt 25
Square root of 25 = 5.0

> fact 4
Factorial of 4 = 24

> power 2 8
2.0000 raised to the power 8.0000 = 256.0000

> history
=== Calculation History ===
5.0 * 2.0 = 10.0
Square root of 25 = 5.0
Factorial of 4 = 24
2.0 raised to the power 8.0 = 256.0
============================

> save
Enter the file path to save the history:
Ex: C:\Users\yourname\Desktop\history.txt
History saved to file: C:\Users\yourname\Desktop\history.txt

⚙️ How to Run

Compile the program
javac CalculatorApp.java

Run the program
java CalculatorApp

📂 Project Structure
Java-Calculator/
├── CalculatorApp.java   # Main entry point
├── history.txt          # Example file for saving history
└── README.md            # Documentation

📜 License

This project is licensed under the MIT License – free to use, modify, and share.