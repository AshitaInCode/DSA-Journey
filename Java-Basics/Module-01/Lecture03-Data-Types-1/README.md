# 📘 Lecture 03 - Data Types - 1

## 📅 Date

(To be updated)

---

# 🎯 Topics Covered

- Variables
- Primitive Data Types
- Integer Data Types
- Floating Point Data Types
- Character Data Type
- Boolean Data Type
- Memory Size of Data Types
- Naming Conventions

---

# 🧠 Key Concepts

## 1. What is a Data Type?

A data type tells the compiler:

- What kind of value a variable can store.
- How much memory should be allocated.
- What operations can be performed on the variable.

Example:

```java
int age = 25;
double salary = 45000.75;
char grade = 'A';
boolean isPlaced = true;
```

---

## 2. Primitive Data Types in Java

Java has **8 primitive data types**.

| Data Type | Size | Stores |
|-----------|------|--------|
| byte | 1 byte | Small integers |
| short | 2 bytes | Medium integers |
| int | 4 bytes | Whole numbers |
| long | 8 bytes | Large whole numbers |
| float | 4 bytes | Decimal numbers |
| double | 8 bytes | Large decimal numbers |
| char | 2 bytes | Single character |
| boolean | JVM dependent | true / false |

---

## 3. Integer Data Types

### byte

```java
byte age = 25;
```

Range:

```
-128 to 127
```

---

### short

```java
short marks = 32000;
```

---

### int

Most commonly used integer type.

```java
int salary = 50000;
```

---

### long

Used for very large integers.

```java
long population = 1456789123L;
```

Notice the **L** at the end.

---

## 4. Floating Point Data Types

### float

Stores decimal values.

```java
float price = 99.5f;
```

Notice the **f** suffix.

---

### double

More precise than float.

```java
double pi = 3.14159265;
```

---

## 5. Character Data Type

Stores a **single character**.

```java
char grade = 'A';
```

Use **single quotes (' ')**.

Incorrect

```java
char grade = "A";
```

---

## 6. Boolean Data Type

Stores only two values.

```java
boolean isJavaFun = true;
```

Possible values

```
true
false
```

---

## 7. Variable Naming Rules

✅ Valid

```java
studentName
rollNumber
_age
salary123
```

❌ Invalid

```java
1name
class
student-name
```

---

## 8. Java is Statically Typed

Once a variable is declared with a type, it cannot store another type.

Correct

```java
int age = 25;
```

Incorrect

```java
int age = "Twenty Five";
```

---

# 💻 Examples

Example 1

```java
int age = 22;
System.out.println(age);
```

Output

```
22
```

---

Example 2

```java
double price = 125.50;
System.out.println(price);
```

Output

```
125.5
```

---

Example 3

```java
char grade = 'A';
System.out.println(grade);
```

Output

```
A
```

---

Example 4

```java
boolean isPassed = true;
System.out.println(isPassed);
```

Output

```
true
```

---

# ❓ Revision Questions

### Q1. What is a data type?

A data type specifies the type of value a variable can store.

---

### Q2. How many primitive data types are there in Java?

8

---

### Q3. Which data type is used for whole numbers?

int

---

### Q4. Which data type stores decimal numbers?

float and double

---

### Q5. Which data type stores a single character?

char

---

### Q6. Which data type stores true or false?

boolean

---

### Q7. Why do we write 'L' after long values?

To tell Java that the number is of type long.

---

### Q8. Why do we write 'f' after float values?

Because decimal literals are treated as double by default.

---

# 💻 Assignment Problems

- ⬜ (Update after solving)

---

# 💻 Additional Assignment

- ⬜ (Update after solving)

---

# 📚 Important Observations

- Every variable must have a data type.
- Choose the smallest suitable data type when possible.
- int is the most commonly used integer type.
- double is more precise than float.
- char uses single quotes.
- String uses double quotes.
- boolean stores only true or false.

---

# 💡 Beginner Tips

- Don't memorize all data type sizes immediately.
- Focus on understanding when to use each data type.
- Practice declaring variables of every type.
- Predict the output before running your code.

---

# 🔁 Revision History

- ✅ Revision 1
- ⬜ Revision 2
- ⬜ Revision 3
- ⬜ Revision 4

---

# 📌 Lecture Status

- ✅ Notes Revised
- ⬜ Code Examples Practiced
- ⬜ Assignment Completed
- ⬜ Additional Assignment Completed
- ⬜ GitHub Updated
- ⬜ Second Revision Pending

---

# 🚀 Interview Connection

Why is this lecture important?

- Every Java program starts with variables and data types.
- Interviewers often ask about primitive data types.
- Choosing the correct data type improves memory efficiency.
- Understanding data types is essential before learning arrays, loops, methods, and DSA.

---

# ⭐ My Learning

In this lecture, I learned that every variable must have a data type. I understood the difference between integer, decimal, character, and boolean data types, their memory usage, and when each should be used. These concepts are fundamental because every Java program and every DSA problem uses variables and data types.