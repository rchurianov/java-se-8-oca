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
