# Java SE 8 Programmer Exam 1

# Overview

1. Java Basics
    1.1 Variables
        20 min on variable types
        10-15 min on naming conventions
    1.2 Classes
        10 min intro to classes
    1.3 Compiling simple programs
        5 min
    1.4 Creating and Using Packages
        10 min
    1.5 Using Package Members
        10 min - common info
        5 min - static importing
    1.6 Object-Oriented Programming Concepts
        5 min - quick intro to OOP
    ________
        1.5 hrs

2. Working with Data Types
    2.1 Variable
        10 min - rehearse
    2.2 Initializing fields
        10-15 min - static and instance members
    2.3 Primitive Data types
        20 min - data types
    2.4 The Number Classes
        10 min - review
    2.5 Inheritance
        20-25 min - review + what you can do in a subclass
    2.6 Declaring Member Variables
        10 min - access modifiers
    2.7 Creating Objects
        10 min - review
    2.8 Using Objects
        15-20 min - fields, methods, garbage collector
    ________
        2 hrs

3. Using operators and decision constructs
    3.1 Operators
        10 min - review
    3.2 Assignment, Arithmetic, Unary operators
        20 min
    3.3. Equality, Relational, Conditional Operators
        20 min
    3.4 Bitwise and Bit Shift Operators
        10 - 60 min
    3.5 Expressions, Statements, Blocks
        5-10 min - review
    3.6 Object as a Superclass
        15-20 min
    3.7 The if-then and if-then-else Statement
        10 min - review
    3.8 Ternary Constructs
        10 min - review
    3.9 The switch statement
        10-15 min - review
    ________
        2 hrs

4. Creating and using Arrays
    4.1 Declare, instantiate, initialize - one-dimensional
    4.2 Multidimensional
    ________
        30 min

5. Using Loop constructs
    5.1 The while and do-while Statements
        10 min - review
    5.2 The for Statement
        15 min - review
    5.3 The while and do-while Statements
        5 min - review
    5.4 Summary of Control Flow Statements
        5 min - review
    5.5 Branching Statements
        10 min - review
    ________
        45 min

6. Working with methods and encapsulation
    6.1 Returning a Value from a Method
        5 min - review
    6.2 Defining Methods
        10 min
    6.3 Variables
        10 min
    6.4 Understanding Class Members
        15 min
    6.5 Default Methods
        30 min - reading?
    6.6 Defining Methods
        10 min
    6.7 Providing Constructors for Your Classes
        5 min
    6.8 Controlling access to members of a class
        10 min
    6.9 Inheritance
        10-15 min - review
    6.10 Inner Class Example
        15 min
    6.11 Nested Classes
        20 min
    6.12 Passing Information to a Method or a Constructor
        15-20 min
    ________
        2 hrs 25 min

7. Working with inheritance
    7.1 Inheritance
        20-25 min - review
    7.2 Overriding and Hiding Methods
        20-25 min - review
    7.3 Polymorphism
        15 min
    7.4 Creating Objects
        20 min
    7.5 Using Objects
        15 min - review
    7.6 Inheritance
        15 min - review
    7.7 Using the Keyword super
        15 min
    7.8 Using the this Keyword
        5-10 min
    7.9 Abstract Methods and Classes
        20 min
    7.10 Defining an Interface
        10 min
    7.11 Implementing an interface
        10 min
    ________
        3 hrs

8. Handling Exceptions
    8.1 The Catch or Specify Requirement
        5-10 min
    8.2 Catching and Handling Exceptions
        10 min
    8.3 The *try* Block
        5 min
    8.4 The catch Blocks
        10 min
    8.5 What Is an Exception?
        5 min
    8.6 Advantages of Exceptions
        20 min
    8.7 Catching Exceptions
        30-45 min - new material?
    ________
        1 hrs 45 min

9. Working with selected classes from the Java API
    9.1 The StringBuilder Class
        20 min
    9.2 Summary of Characters and Strings
        5 min
    9.3 Strings
        10 min
    9.4 Converting Between Numbers and Strings
        10-15 min
    9.5 Comparing Strings and portions of Strings
        10 min
    9.6 Manipulating Characters in a String
        20 min
    9.7 Date and Time classes
        5 min - review
    9.8 Date Classes
        10 min - review
    9.9 Parsing and Formatting
        15 min
    9.10 Period and Duration
        15 min
    9.11 The List Interface
        45 min
    9.12 List Implementations
        10 min - review
    9.13 Lambda Expressions
        1 hr - 1.5 hrs
    9.14 Aggregate Operations
        1 hr
    ________
        5.5 hrs

9 Sections.
Each section corresponds to a topic in Java Tutorials.

## Section 1. Java Basics.

### Item 1. Variables

Object has a state.
State of an object is stored in object's fields.

- Conventions for naming a field:
Camel-Case with first letter in the name being lower case.

- What primitive data types exist in Java?
	- byte
	- short
	- int
	- long
	- double

- Do fields have to be initialized when they are declared?
No ?

- Are fields assigned a default value when they are declared without initialization?
No?
Well, may be for samo types, but we can not rely on that.

Is Java "pass by value" or "pass by reference"?

#### 1.1 Variables

**Instance Variables (Non-Static Fields)**
store the state of an object

**Class Variables (Static Fields)**
any field with *static* keyword

**Local Variables**
Method  can store temporary state in *local* variables

**Parameters**
method parameters

##### Naming conventions and rules

- variable names are case-sensitive
- can start with:
	- letter
	- dollar sign "$"
	- underscore character "\_"
- convetion: start with a letter
- convetion: "$" is never used
	- reserved for auto-generate names
- convetion: "\_" is never used
- subsequent characters (next after first):
	- letters
	- digits
	- "$" - dollar signs
	- "\_" - underscore characters
- naming constants:
	static final int NUM_GEARS = 6;

#### 1.2 Primitive Data Types

Java is statically-typed:
- variable must be declared before it can be used.
- declaration should state variable's type
```
int boogie = 0;
```

##### eight primitive datatypes

- **byte**
	- 8-bit
	- signed
	- two's complement
	- [-128, 127]
	- *Usage*
		- save memory in large arrays
		- instead of int, where limits clarify code
		- limited range can serve as a form of documentation
- **short**
	- 16-bit
	- signed
	- two's complement
	- [-32768, 32767]
	- *Usage*
		- save memory
- **int**
	- 32-bit
	- signed
	- two's complement
	- [-2^31, 2^31-1]
	- *Usage*
		- Java SE 8
			- can be used as [0, 2^32 - 1]
		- Use **Integer** class instead of **int** to represent _unsigned_ integers.
- **long**
	- 64-bit
	- two's  complement
	- [-2^63, 2^63-1]
	- *Usage*
		- Java SE 8
			- can be used as [0, 2^64 - 1]
- **float**
	- single-recision
	- 32-bit
	- floating point
	- *Usage*
		- use instead of double to save memory
		- never use for precise values
- **double**
	- double-precision
	- 64-bit
	- *Usage*
		- default choice for decimal values
- **boolean**
	- true || false
	- 1 bit of information
- **char**
	- 16-bit
	- Unicode character
	- ['\u0000', '\uffff']

##### String

java.lang.String class provides support for character strings.
```
String s = "Quick brown fox";
```
automatically create a String object

- immutable
	- once created, their values can not be changed

Data Type | Length    | Singed/Unsigned | Precision | Range                |
--------- | --------- | --------------- | --------- | -------------------- |
byte      | 8-bit     | signed          | -         | [-128, 127]          |
short     | 16-bit    | signed          | -         | [-32768, 32767]      |
int       | 32-bit    | signed          | -         | [-2^31, 2^31-1]      |
long      | 64-bit    | signed          | -         | [-2^63, 2^63-1]      |
float     | 32-bit    | -               | -         | -                    |
double    | 64-bit    | -               | -         | -                    |
boolean   | 1 bit (?) | -               | -         | true / false         |
char      | 16-bit    | -               | -         | ['\u0000', '\uffff'] |


Good programming style:

- do not rely on default values

**Local Variables**

Compiler never assigns default values to local variables.

##### Literals

###### Integer Literals
- integer literal
	- _long_ if it ends with ```L``` or ```l```
	- _int_ otherwise
	- _Usage_
		- ```L``` recommended

integer literal can be expressed by three number systems:
- decimal
	- base 10
- hexadecimal
	- prefix ```0x```
- binary (since Java SE 7)
	- prefix ```0b```

Examples:
```
int cripple = 1919;
int hexCripple = 0x1A1F;
int biCripple = 0b11011;
```

I should probably do more of Stepik.
Well, I should do more in general.
At least I might become a monkey programmer.

###### Floating-Point Literals

- of type ```float```
- ends with ```F``` or ```f```
- of type ```double```
- ends with ```D``` or ```d```

- can be expressed with ```E``` or ```e``` (for scientific notation)

```
double d` = 123.4;
// same value as d1, but in scientific notation
double d2 = 1.234e2;

float f1 = 123.4f;
```

###### Character and String Literals

- ```char``` and ```String``` an contain any UTF-16 characters.

```
'\u0108'

"S\u00ED Se\u00F1or"
```

- 'single quotes' for ```char```
- "double quotes" for ```String```

- \b = backspace
- \t = tab
- \n = line feed
- \f = form feed
- \r = carriage return
- \" = double quote
- \' = single quote
- \\ = backslash

- ```null```
    - can not be assigned to primitive types

###### Class Literal

```
String.class
```

It is an object of class ```Class```


##### Using Underscore Characters in Numeric Literals

A user can separate groups of digits in a literals by "\_".

Wrong to place an underscore:

- at the beginning or end of a number
- adjacent to a decimal point in a floating point literal
- prior to an ```F``` or ```L``` suffix
- in positions where a string of digits is expected

#### Arrays

##### Array

- container
- holds **fixed** number of values
- single type
- length established at creation
- can be indexed
- indexing start at 0

Declaration:

```
int[] Array;
```

Creation:

``` Java
1. new
int[] secondArray = new int[19];

2. explicitly specify values
int[] thirdArray = new int {100, 200, 300};
```

##### Multidimensional array

- is an array of arrays
- each row might have a different length

##### Copying arrays

- ```System.arraycopy```

```Java
public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int Length)
```

##### Manipulating arrays

```
java.util.Arrays
```

```Java
char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
```

- first index is inclusively
- second index is exclusively

| operation | java.util.Arrays method     |
| :------------- | :------------- |
| search by value, get index       | binarySearch       |
| compare | equal |
|fill with one value | fill |
| sort in ascending order | sort |
| sort in ascending order | parallel sort |

#### Variables. Questions and Exercises

##### Questions

1. The term "instance variable" is another name for non-static field of a class.
2. The term "class variable" is another name for static field of a class.
3. A local variable stores temporary state; it is declared inside a method/function.
4. A variable declared within the opening and closing parenthesis of a method signature is called a parameter.
5. Eight primitive data types: byte, short, int, long, double, float, char, boolean.
6. Character strings are represented by class java.lang.String.
7. An Array is a container object, that holds a fixed number of values of a single type.

##### Exercises

1. Try creating illegal names. Check compiler errors.

Error:
Error:(6, 9) java: not a statement

2. Print uninitialized values. Print uninitialized local variable - check error.

2.b
Error:(14, 50) java: variable i might not have been initialized

### Item 2. Define the structure of a Java class

 - comments
 - class definition
 - the ```main``` method

Comment types

- line
```
/* text */

// text
```

- documentation
```
/**
 * documentation
 * documentation
 * documentation
 */
```
used by ```javadoc``` tool to automatically generate documentation

Class definition

```
class Name {
    ...
}
```

The ```main``` Method
```
public static void main(String[] args) {

}
```

- every application must contain ```main``` method;

### Powers of two

| Power of 2 | Value     |
| ---------- | --------- |
| 2^0        | 1         |
| 2^1        | 2         |
| 2^2        | 4         |
| 2^3        | 8         |
| 2^4        | 16        |
| 2^5        | 32        |
| 2^6        | 64        |
| 2^7        | 128       |
| 2^8        | 256       |
| 2^9        | 512       |
| 2^10       | 1024      |
| 2^11       | 2048      |
| 2^12       | 4096      |
| 2^13       | 8192      |
| 2^14       | 16384     |
| 2^15       | 32768     |
| 2^16       | 65536     |
| 2^17       | 131072    |
| 2^32       | 4294967296 |



















....
