# 🛠️ JavaCC-Based Compiler Parser for a Custom Mini Language

This project is a **parser and compiler frontend** for a simplified custom programming language. It is written in **Java** using the **JavaCC parser generator** and was built as part of the **Compiler Construction** course at Bahria University.

---

## 📌 Overview

The compiler reads a custom language containing:

- Variable declarations (integers and strings)
- Arithmetic expressions (+, -, *, /, %)
- Assignment statements
- Basic syntax rules (startProgram, variables:, code:)
- Visual parse tree generation for the input source

---

## 💡 Key Features

- ✅ **Custom grammar** and token definitions using JavaCC
- ✅ **Parse tree** generation with proper indentation for structure visualization
- ✅ **Symbol table** for tracking variable declarations and values
- ✅ **Arithmetic expression evaluation** at parse time
- ✅ **Error handling** for undeclared variables

---

## 🧠 Core Concepts Implemented

- Lexical Analysis
- Syntax Analysis
- Parse Tree Construction
- Expression Evaluation
- Symbol Table Management
- Error Reporting

---

## 🧾 Grammar Tokens (Examples)

```text
START_PROGRAM → "startProgram"
END_PROGRAM → "endProgram"
VARIABLES → "variables:"
CODE → "code:"
IDENTIFIER → variable names (e.g., x, total)
INTEGER → integer literals (e.g., 5, 100)
STRING → string literals (e.g., "hello")
Operators → +, -, *, /, %, ==, <=, >=, <>
