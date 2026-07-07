# 📘 Lecture 06 - If-Else

## 📅 Date

(To be updated)

---

# 🎯 Topics Covered

- What is Decision Making?
- if Statement
- if-else Statement
- else-if Ladder
- Nested if
- Comparison Operators
- Logical Operators with if-else
- Common Mistakes

---

# 🧠 Key Concepts

## 1. What is Decision Making?

Decision making allows a program to execute different blocks of code based on whether a condition is true or false.

Example:

```
If it is raining
    Take an umbrella
Else
    Go without an umbrella
```

In Java, decision making is done using **if**, **else if**, and **else**.

---

## 2. if Statement

The `if` statement executes a block of code only when the condition is **true**.

Syntax

```java
if (condition) {
    // code
}
```

Example

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

Output

```
Eligible to vote
```

---

## 3. if-else Statement

If the condition is true, the `if` block executes.

Otherwise, the `else` block executes.

Syntax

```java
if (condition) {
    // code
} else {
    // code
}
```

Example

```java
int age = 16;

if (age >= 18) {
    System.out.println("Eligible");
} else {
    System.out.println("Not Eligible");
}
```

Output

```
Not Eligible
```

---

## 4. else-if Ladder

Used when multiple conditions need to be checked.

Syntax

```java
if (condition1) {

}
else if (condition2) {

}
else {

}
```

Example

```java
int marks = 75;

if (marks >= 90) {
    System.out.println("Grade A");
}
else if (marks >= 75) {
    System.out.println("Grade B");
}
else if (marks >= 50) {
    System.out.println("Grade C");
}
else {
    System.out.println("Fail");
}
```

Output

```
Grade B
```

---

## 5. Nested if

An `if` statement inside another `if` statement.

Example

```java
int age = 22;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("Entry Allowed");
    }
}
```

---

## 6. Comparison Operators

Used inside conditions.

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
if (a == b)
```

---

## 7. Logical Operators with if

### AND (&&)

Both conditions must be true.

```java
if (age >= 18 && hasLicense)
```

---

### OR (||)

At least one condition must be true.

```java
if (day == 6 || day == 7)
```

---

### NOT (!)

Reverses the condition.

```java
if (!isLoggedIn)
```

---

## 8. Curly Braces

Recommended even for a single statement.

Correct

```java
if (age >= 18) {
    System.out.println("Adult");
}
```

---

## 9. Boolean Expression

The condition inside an if statement must always return **true** or **false**.

Correct

```java
if (age > 18)
```

Incorrect

```java
if (age)
```

---

# 💻 Examples

### Example 1

```java
int number = 10;

if (number > 0) {
    System.out.println("Positive");
}
```

Output

```
Positive
```

---

### Example 2

```java
int number = -5;

if (number >= 0) {
    System.out.println("Positive");
}
else {
    System.out.println("Negative");
}
```

Output

```
Negative
```

---

### Example 3

```java
int a = 20;
int b = 15;

if (a > b) {
    System.out.println(a);
}
else {
    System.out.println(b);
}
```

Output

```
20
```

---

### Example 4

```java
int marks = 45;

if (marks >= 90)
    System.out.println("A");
else if (marks >= 75)
    System.out.println("B");
else if (marks >= 50)
    System.out.println("C");
else
    System.out.println("Fail");
```

Output

```
Fail
```

---

# ❓ Revision Questions

### Q1. What is the purpose of an if statement?

It executes a block of code only when a condition is true.

---

### Q2. Difference between if and if-else?

- `if` executes code only when the condition is true.
- `if-else` provides an alternative block when the condition is false.

---

### Q3. When do we use else-if?

When multiple conditions need to be checked.

---

### Q4. What is a nested if?

An if statement inside another if statement.

---

### Q5. What type of value must an if condition return?

A boolean value (`true` or `false`).

---

### Q6. Can we use logical operators inside if?

Yes.

Example

```java
if (age >= 18 && citizen)
```

---

### Q7. Which comparison operator checks equality?

```
==
```

---

### Q8. What is the output?

```java
int x = 5;

if (x > 10)
    System.out.println("A");
else
    System.out.println("B");
```

Answer

```
B
```

---

# 💻 Assignment Problems

- ⬜ Update after solving

---

# 💻 Additional Assignment

- ⬜ Update after solving

---

# 📚 Important Observations

- Every if condition must evaluate to `true` or `false`.
- Only one block of an if-else chain executes.
- The first matching condition in an else-if ladder is executed.
- Curly braces improve readability and reduce bugs.

---

# 💡 Beginner Tips

- Read the condition carefully before predicting the output.
- Trace the program line by line.
- Practice writing your own conditions.
- Use meaningful variable names like `age`, `marks`, or `salary`.

---

# ⚠️ Common Beginner Mistakes

- Using `=` instead of `==` in conditions.
- Forgetting curly braces.
- Writing overlapping else-if conditions in the wrong order.
- Assuming all else-if blocks execute (only the first matching one does).

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

- `if-else` is one of the most frequently used control structures in programming.
- Every DSA topic—arrays, strings, recursion, trees, graphs, and dynamic programming—uses conditional logic.
- Coding interviews often include problems based on conditions, comparisons, and branching.

---

# ⭐ My Learning

In this lecture, I learned how Java makes decisions using `if`, `if-else`, `else-if`, and nested `if` statements. I also understood how comparison and logical operators work inside conditions. These concepts are fundamental because almost every algorithm requires making decisions based on different conditions.