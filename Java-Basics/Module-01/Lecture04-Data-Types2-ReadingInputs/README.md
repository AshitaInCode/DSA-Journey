# 📘 Lecture 04 - Data Types 2 + Reading Inputs

## 📅 Date

(To be updated)

---

# 🎯 Topics Covered

- Type Casting
- Implicit Type Conversion
- Explicit Type Conversion
- Overflow
- Reading User Input
- Scanner Class
- Reading Different Data Types
- Import Statement

---

# 🧠 Key Concepts

## 1. Type Casting

Type casting means converting one data type into another.

There are two types:

- Implicit Type Casting (Automatic)
- Explicit Type Casting (Manual)

---

## 2. Implicit Type Casting (Widening)

Java automatically converts a smaller data type into a larger one.

Example

```java
int number = 25;
double value = number;

System.out.println(value);
```

Output

```
25.0
```

No data is lost.

---

## 3. Explicit Type Casting (Narrowing)

When converting a larger data type into a smaller one, Java requires manual casting.

Example

```java
double price = 99.99;

int amount = (int) price;

System.out.println(amount);
```

Output

```
99
```

The decimal part is removed.

---

## 4. Data Loss During Type Casting

Example

```java
double number = 10.75;

int x = (int) number;

System.out.println(x);
```

Output

```
10
```

Only the integer part remains.

---

## 5. Overflow

Overflow occurs when a value exceeds the storage capacity of a data type.

Example

```java
byte number = 127;

number++;

System.out.println(number);
```

Output

```
-128
```

---

## 6. Reading Input

Java uses the **Scanner** class to read input from the keyboard.

---

## 7. Import Scanner

```java
import java.util.Scanner;
```

This imports the Scanner class.

---

## 8. Creating Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

Now Java can read user input.

---

## 9. Reading Integer Input

```java
Scanner sc = new Scanner(System.in);

int age = sc.nextInt();

System.out.println(age);
```

Input

```
22
```

Output

```
22
```

---

## 10. Reading Double Input

```java
double salary = sc.nextDouble();
```

---

## 11. Reading Float Input

```java
float price = sc.nextFloat();
```

---

## 12. Reading Long Input

```java
long population = sc.nextLong();
```

---

## 13. Reading Character Input

Scanner doesn't have `nextChar()`.

We use:

```java
char grade = sc.next().charAt(0);
```

Explanation

- next() reads a word.
- charAt(0) returns the first character.

---

## 14. Reading String Input

### Single Word

```java
String name = sc.next();
```

Input

```
Ashita
```

Output

```
Ashita
```

---

### Full Sentence

```java
String address = sc.nextLine();
```

Input

```
Hyderabad India
```

Output

```
Hyderabad India
```

---

## 15. Closing Scanner

```java
sc.close();
```

This is considered good practice after input is complete.

---

# 💻 Examples

Example 1

```java
import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        System.out.println(age);

        sc.close();
    }
}
```

---

Example 2

```java
Scanner sc = new Scanner(System.in);

double marks = sc.nextDouble();

System.out.println(marks);

sc.close();
```

---

# ❓ Revision Questions

### Q1. What is type casting?

Type casting is converting one data type into another.

---

### Q2. What are the two types of type casting?

- Implicit
- Explicit

---

### Q3. What is implicit type casting?

Automatic conversion from a smaller data type to a larger one.

---

### Q4. What is explicit type casting?

Manual conversion from a larger data type to a smaller one.

---

### Q5. Which package contains Scanner?

```java
java.util
```

---

### Q6. How do we create a Scanner object?

```java
Scanner sc = new Scanner(System.in);
```

---

### Q7. Which method reads an integer?

```java
nextInt()
```

---

### Q8. Which method reads a decimal number?

```java
nextDouble()
```

---

### Q9. Difference between next() and nextLine()?

- next() reads one word.
- nextLine() reads the entire line.

---

### Q10. How do we read a character?

```java
char ch = sc.next().charAt(0);
```

---

# 💻 Assignment Problems

- ⬜ Update after solving

---

# 💻 Additional Assignment

- ⬜ Update after solving

---

# 📚 Important Observations

- Always import Scanner before using it.
- Create only one Scanner object for System.in.
- Explicit type casting may cause data loss.
- Overflow happens when a value exceeds the data type's limit.
- Remember to close the Scanner after use.

---

# 💡 Beginner Tips

- Practice taking different types of input (int, double, char, String).
- Be careful when mixing nextInt() and nextLine().
- Understand why explicit casting can lose information.
- Don't memorize Scanner methods; use them regularly until they become familiar.

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

- Almost every coding problem starts by reading input.
- Scanner is one of the first Java classes asked in beginner interviews.
- Type casting is used frequently in Java programs.
- Understanding input handling is essential before learning conditions, loops, arrays, and functions.

---

# ⭐ My Learning

In this lecture, I learned how Java converts data between different data types using implicit and explicit type casting. I also learned how to take user input using the Scanner class for different data types such as int, double, float, long, char, and String. These concepts are essential because almost every Java program and DSA problem requires reading input and storing it using appropriate data types.