# Lab 5.0.5

**Learning Objectives**

- Understand the concept and importance of `StringBuilder` and `StringBuffer` in Java development.
- Learn how to implement and use `StringBuilder` and `StringBuffer` for efficient string manipulation.
- Explore practical applications of `StringBuilder` and `StringBuffer` in real-world Java projects.
- Identify common pitfalls and best practices when working with `StringBuilder` and `StringBuffer`.
- Gain hands-on experience with a complete Java example that demonstrates `StringBuilder` and `StringBuffer` usage.

**Prerequisites**

- Basic understanding of Java programming.
- Familiarity with String manipulation in Java.
- Knowledge of basic Java control structures (loops, conditionals).

**What You'll Achieve**

- Develop a solid understanding of `StringBuilder` and `StringBuffer` in Java.
- Implement practical examples that can be applied in real-world scenarios.
- Enhance your skills in efficient string manipulation and concatenation.

**Assignment Details**

1. Create a `StringBuilder` object with an initial value of "Hello".
2. Append ", World!" to the `StringBuilder`.
3. Insert "Java " at the beginning of the `StringBuilder`.
4. Replace "World" with "Programmer" in the `StringBuilder`.
5. Reverse the entire `StringBuilder` content.
6. Create a `StringBuffer` with the content of the reversed `StringBuilder`.
7. Delete the first 5 characters from the `StringBuffer`.
8. Insert the current date (as a string) at index 3 of the `StringBuffer`.
9. Print the final contents of both StringBuilder and `StringBuffer`.
10. Compare the performance of `String` concatenation vs `StringBuilder` for appending a string 10000 times.

**Example Output**

```
StringBuilder content: !remmargorP avaJ ,olleH
StringBuffer content: Pro2023-09-05grammer, Java Hello!
Time taken for String concatenation: 278 ms
Time taken for StringBuilder: 1 ms
StringBuilder is approximately 278 times faster for this operation.
```

**Starter Code**

```java
package academy.javapro.lab;

import java.util.Date;

public class StringBuilderBufferLab {
    public static void main(String[] args) {
        // TODO: Implement the assignment tasks here

        // Performance comparison
        String str = "";
        StringBuilder sb = new StringBuilder();
        long start, end;

        // String concatenation
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        end = System.currentTimeMillis();
        long stringTime = end - start;

        // StringBuilder
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append("a");
        }
        end = System.currentTimeMillis();
        long sbTime = end - start;

        // TODO: Print performance comparison results
    }
}

```

**Hints**

- Remember that `StringBuilder` is not thread-safe, while `StringBuffer` is. For this assignment, you can use either.
- Use methods like `append()`, `insert()`, `replace()`, `reverse()`, and `delete()` for string manipulation.
- To insert the current date, you can use new `Date().toString()`.
- When comparing performance, remember that the first operation might be slower due to JVM warm-up. You might want to
  run the test multiple times for more accurate results.
- Use `System.currentTimeMillis()` to measure time precisely.

**Submission Instructions**

1. Fork the repository
2. Clone your fork
3. Navigate into the repository
4. Implement the required loops in the main method
5. Test your implementation with various inputs
6. Git add, commit, and push to your fork
7. Submit a pull request
    - Set the title of the pull request to your first name and last name
    - In the comment, briefly explain your implementation approach and any challenges you faced

Remember, the goal is to learn and have fun! Don't hesitate to ask for help if you get stuck.
