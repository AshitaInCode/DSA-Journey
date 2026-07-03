# 📘 Lecture 05 - Operators

## 📅 Date

(To be updated)

---

# 🎯 Topics Covered

- What are Operators?
- Arithmetic Operators
- Relational Operators
- Logical Operators
- Assignment Operators
- Unary Operators
- Increment and Decrement Operators
- Operator Precedence
- Associativity

---

# 🧠 Key Concepts

## 1. What are Operators?

Operators are special symbols that perform operations on variables or values.

Example

```java
int sum = 10 + 20;
```

Here,

- `+` is an operator.
- `10` and `20` are operands.

---

## 2. Arithmetic Operators

Used for mathematical calculations.

| Operator | Meaning | Example |
|----------|---------|---------|
| + | Addition | 10 + 5 = 15 |
| - | Subtraction | 10 - 5 = 5 |
| * | Multiplication | 10 * 5 = 50 |
| / | Division | 10 / 5 = 2 |
| % | Modulus (Remainder) | 10 % 3 = 1 |

Example

```java
int a = 10;
int b = 3;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

---

## 3. Relational Operators

Used to compare two values.

The result is always **true** or **false**.

| Operator | Meaning |
|----------|---------|
| == | Equal to |
| != | Not Equal to |
| > | Greater than |
| < | Less than |
| >= | Greater than or Equal to |
| <= | Less than or Equal to |

Example

```java
int a = 10;
int b = 20;

System.out.println(a > b);
System.out.println(a < b);
System.out.println(a == b);
System.out.println(a != b);
```

Output

```
false
true
false
true
```

---

## 4. Logical Operators

Used to combine multiple conditions.

| Operator | Meaning |
|----------|---------|
| && | Logical AND |
| || | Logical OR |
| ! | Logical NOT |

### AND (&&)

Returns true only if both conditions are true.

```java
System.out.println(10 > 5 && 20 > 10);
```

Output

```
true
```

---

### OR (||)

Returns true if at least one condition is true.

```java
System.out.println(10 > 20 || 5 < 10);
```

Output

```
true
```

---

### NOT (!)

Reverses the result.

```java
System.out.println(!(10 > 5));
```

Output

```
false
```

---

## 5. Assignment Operator

Used to assign values.

Example

```java
int a = 10;
```

Compound Assignment Operators

```java
a += 5;
a -= 3;
a *= 2;
a /= 4;
a %= 3;
```

---

## 6. Unary Operators

Unary operators work on only one operand.

Example

```java
int x = 10;

System.out.println(+x);
System.out.println(-x);
```

---

## 7. Increment Operator (++)

Increases value by 1.

### Pre Increment

```java
int a = 5;

System.out.println(++a);
```

Output

```
6
```

---

### Post Increment

```java
int a = 5;

System.out.println(a++);
```

Output

```
5
```

After execution,

```
a = 6
```

---

## 8. Decrement Operator (--)

Decreases value by 1.

### Pre Decrement

```java
--a
```

### Post Decrement

```java
a--
```

---

## 9. Operator Precedence

Java follows precedence rules.

Highest

```
()
```

↓

Unary

```
++, --
```

↓

```
*, /, %
```

↓

```
+, -
```

↓

Relational Operators

↓

Logical Operators

↓

Assignment

---

## 10. Associativity

When operators have the same precedence, Java evaluates according to associativity.

Most operators are evaluated from **left to right**.

Example

```java
20 / 5 * 2
```

Output

```
8
```

---

# 💻 Examples

Example 1

```java
System.out.println(10 + 20 * 3);
```

Output

```
70
```

---

Example 2

```java
System.out.println((10 + 20) * 3);
```

Output

```
90
```

---

Example 3

```java
int a = 5;

System.out.println(a++);
System.out.println(a);
```

Output

```
5
6
```

---

Example 4

```java
int a = 5;

System.out.println(++a);
```

Output

```
6
```

---

# ❓ Revision Questions

### Q1. What are operators?

Operators are symbols used to perform operations on operands.

---

### Q2. Which operator gives the remainder?

```
%
```

---

### Q3. Difference between == and = ?

- `=` assigns a value.
- `==` compares two values.

---

### Q4. What is the output?

```java
System.out.println(10 > 5 && 5 > 8);
```

Answer

```
false
```

---

### Q5. Difference between pre-increment and post-increment?

- Pre-increment increases first, then uses the value.
- Post-increment uses the current value first, then increases it.

---

### Q6. What is operator precedence?

It decides the order in which operators are evaluated.

---

### Q7. Output?

```java
int a = 5;

System.out.println(a++);
System.out.println(a);
```

Answer

```
5
6
```

---

### Q8. Output?

```java
int a = 5;

System.out.println(++a);
```

Answer

```
6
```

---

# 💻 Assignment Problems

- ⬜ Update after solving

---

# 💻 Additional Assignment

- ⬜ Update after solving

---

# 📚 Important Observations

- `%` returns the remainder.
- `=` assigns values.
- `==` compares values.
- `&&` requires both conditions to be true.
- `||` requires at least one condition to be true.
- `!` reverses the result.
- Pre and post increment behave differently.
- Always remember operator precedence while evaluating expressions.

---

# 💡 Beginner Tips

- Predict the output before running the code.
- Practice pre-increment and post-increment separately.
- Don't confuse `=` with `==`.
- Use parentheses to improve code readability.

---

# ⚠️ Common Beginner Mistakes

- Using `=` instead of `==` in conditions.
- Forgetting the difference between `a++` and `++a`.
- Ignoring operator precedence.
- Confusing `%` with division.

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

- Operators are used in every Java program.
- Logical and relational operators are the foundation of `if`, `while`, `for`, and many DSA algorithms.
- Understanding increment/decrement operators is common in coding interviews.
- Operator precedence helps prevent logical bugs in complex expressions.

---

# ⭐ My Learning

In this lecture, I learned how different types of operators work in Java, including arithmetic, relational, logical, assignment, and unary operators. I also understood the difference between pre-increment and post-increment, how operator precedence affects expression evaluation, and why choosing the correct operator is essential for writing accurate and efficient programs.