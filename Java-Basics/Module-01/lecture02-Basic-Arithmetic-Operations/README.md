# 📘 Lecture 02 - Basic Arithmetic Operations

## 📅 Date

(To be updated)

---

# 🎯 Topics Covered

- Arithmetic Operators
- Integer Division
- Division by Zero
- Operator Precedence
- Variables
- Declaration vs Initialization
- String Concatenation
- Expressions

---

# 🧠 Key Concepts

## 1. Arithmetic Operators

Java provides arithmetic operators to perform mathematical calculations.

| Operator | Meaning |
|----------|---------|
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Modulus (Remainder) |

Example:

```java
System.out.println(10 + 5);   //15
System.out.println(10 - 5);   //5
System.out.println(10 * 5);   //50
System.out.println(10 / 5);   //2
System.out.println(10 % 3);   //1
```

---

## 2. Integer Division

When both operands are integers, Java returns only the integer part.

```java
System.out.println(10 / 3);
```

Output

```
3
```

The decimal part is discarded.

---

## 3. Division by Zero

```java
5 / 0
```

Output

```
ArithmeticException
```

Division by zero is not allowed for integers.

---

## 4. Operator Precedence

Java follows BODMAS rules.

Example

```java
System.out.println(10 + 20 * 3);
```

Output

```
70
```

Because multiplication happens first.

Using brackets

```java
System.out.println((10 + 20) * 3);
```

Output

```
90
```

---

## 5. Variables

Variables store data.

Declaration

```java
int age;
```

Initialization

```java
age = 25;
```

Declaration + Initialization

```java
int age = 25;
```

---

## 6. Declaration vs Initialization

Declaration

```java
int a;
```

Initialization

```java
a = 10;
```

Both together

```java
int a = 10;
```

---

## 7. String Concatenation

```java
System.out.println("Hello" + 3 + 4);
```

Output

```
Hello34
```

Java joins strings from left to right.

Example

```java
System.out.println("5" + "0");
```

Output

```
50
```

---

## 8. Variables Example

```java
int a = 15;
int b = 25;

System.out.println(a + b);
```

Output

```
40
```

---

# ❓ Revision Questions

### Q1. What is integer division?

Integer division returns only the whole-number part.

---

### Q2. What happens when we divide an integer by zero?

ArithmeticException occurs.

---

### Q3. Difference between declaration and initialization?

Declaration creates a variable.

Initialization gives a value to that variable.

---

### Q4. What is operator precedence?

It defines the order in which operations are performed.

---

### Q5. What is string concatenation?

Joining two or more strings using the `+` operator.

---

### Q6. Output?

```java
System.out.println("Hello" + 3 + 4);
```

Answer

```
Hello34
```

---

### Q7. Output?

```java
System.out.println(10 + 20 * 3);
```

Answer

```
70
```

---

### Q8. Output?

```java
System.out.println((10 + 20) * 3);
```

Answer

```
90
```

---

# 💻 Assignment Problems

- ✅ Hello World - 2
- ✅ Getting Started - 1
- ✅ Hello World - 4

---

# 💻 Additional Assignment

- ✅ Odd Numbers
- ✅ Even Numbers
- ✅ Print Table of 3

---

# 📚 Important Observations

- Integer division removes the decimal part.
- Division by zero causes an ArithmeticException.
- Java follows operator precedence.
- Strings are concatenated using '+'.
- Variables must be declared before use.

---

# 💡 Beginner Tips

- Practice writing arithmetic expressions without looking at notes.
- Predict the output before running the program.
- Remember the difference between numbers and strings.
- Write every example by yourself instead of only reading it.

---

# 🔁 Revision History

- ✅ Revision 1
- ⬜ Revision 2
- ⬜ Revision 3
- ⬜ Revision 4

---

# 📌 Lecture Status

- ✅ Notes Revised
- ✅ Concepts Understood
- ✅ Code Examples Practiced
- ✅ Assignment Completed
- ✅ Additional Assignment Completed
- ⬜ GitHub Updated
- ⬜ Second Revision Pending

---

# ⭐ My Learning

In this lecture, I learned how arithmetic operations work in Java, the difference between integer division and normal division, how variables are declared and initialized, how Java evaluates expressions using operator precedence, and how string concatenation works.

This lecture strengthened my understanding of Java fundamentals, which are essential before moving to Data Structures and Algorithms.