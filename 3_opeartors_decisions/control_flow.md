
# Control Flow Statements

- decision-making statement
    - if
    - if-else
    - switch
- looping statements
    - for
    - while
    - do-while
- branching statements
    - break
    - continue
    - return

## if

public void applyBrakes() {
    if (isMoving) {
        currentSpeed--;
    }
}

## if-else if-else

if (a >= 90) {
    // ...
} else if (a >= 80) {
    // ...
} else if (a >= 70) {
    // ...
} else if (a >= 60) {
    // ...
} else {
    // ...
}

When a condition is satisfied the remaining conditions are not evaluated.

## The switch Statement

- can have a number of possible execution paths
- works with primitive types:
    - byte
    - short
    - char
    - int
- works with *enumerated types*
- works with the *String* class
- works with a few special classes to wrap primitive types:
    - Character
    - Byte
    - Short
    - Integer

```Java
public class SwithcDemo {
    public static void main(String[] args) {
        int month = 8;
        String monthName;
        switch (month) {
            case 8: monthName = "August";
                    break;
            case 9: monthName - "September";
                    break;
            case 10: monthName = "October";
                     break;
            case 1: case 2: case 3: case 4: monthName = "First third of the year";
                                            break;
            default: "No matching name for the specified integer. Value out of range."
        } // end of switch block
    }
}
```

Make sure that expression in *switch* statement is not *null* to prevent NullPointerException being thrown.

Notes:

Working with strings:
- convert to upper or lower case if case is not important

## The while and do-while statements

```Java
while (<expression equals true>) {

}

do {

} while (<expression equals true>)
```

- expression must evaluate to boolean value
- statements in *do* block are always executed at least once

## The for statement

```Java
for (initialization; termination; increment) {
    statement(s)
}
```

- initialization expression is executed once
- loop terminates when the termination expression is evaluated to false
- it is perfectly acceptable for increment expression to increment or decrement a value

- infinite loop
```Java
for ( ; ; ) {

}
```

- second form of the for statement - *enhanced for* statement
    - designed for iteration through collections and arrays

```Java
int[] numbers = { 1, 2, 3, 4, 5};

for (int item : numbers) {
    System.out.println("number " + item);
}
```


## Branching Statements

### break

- two forms:
    - labeled
    - unlabeled
- unlabeled form is used in switch statement
- unlabeled break can be used to terminate:
    - for loop
    - while loop
    - do-while loop
- labeled break:
    - terminates the outer statement

```Java
search:
    for (...) {
        for (...) {
            //...
            break search;
        }
    }
```

### continue

- skips the current iteration of a for, while, do-while loop

Can be of two forms:
- labeled
- unlabeled

### return

- exits from the current method

## Questions

1. The most basic control flow statement supported by the Java programming language is the *if* statement.
2. The *switch* statement allows for any number of possible excution paths.
3. The *do-while* statement is similar to the *while* statement, but evaluates its expression at the bottom of the loop.
4. Infinite loop using the *for* statement:
```
for ( ; ; ) {

}
```
5. Infinite loop using *while* statement:
while (true) {

}

## Exercises

Code snippet:
```Java
if (aNumber >= 0)
    if (aNumber == 0)
        System.out.println("first string");
else System.out.println("second string");
System.out.println("third string");
```

a. aNumber = 3
Output:
third string

b. 














...
