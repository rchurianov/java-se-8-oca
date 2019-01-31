# Java SE 8 Programmer Exam 1

# Overview

1. Java Basics
2. Working with Data Types
3. Using operators and decision contructs
4. Creating and using Arrays
5. Using Loop construcs
6. Working with methods and encapsulation
7. Working with inheritance
8. Handling Exceptions
9. Working with selected classes from the Java API

9 Sections.
Each section corresponds to a topic in Java Tutorials.

## Section 1. Java Basics.

### Item 1. Variables

Object has a state.
State of an object is stored in object's fileds.

- Conventions for naming a field:
Camel-Case with fisrt letter in the name being lower case.

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
	- underscore character "_"
- convetion: start with a letter
- convetion: "$" is never used
	- reserved for auto-generate names
- convetion: "_" is never used
- subsequent characters (next after first):
	- letters
	- digits
	- "$" - dollar signs
	- "_" - underscore characters
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
	- once created, thair values can not be changed

Data Type | Length | Singed/Unsigned | Precision | Range
--------- | ------ | --------------- | --------- | -----
byte | 8-bit | signed | - | [-128, 127]
short | 16-bit | signed | - | [-32768, 32767]
int | 32-bit | signed | - | [-2^31, 2^31-1]
long | 64-bit | signed | - | [-2^63, 2^63-1]
float | 32-bit | - | - | -
double | 64-bit | - | - | -
boolean | 1 bit (?) | - | - | true / false
char | 16-bit | - | - | ['\u0000', '\uffff']
