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

1. Sections 1. Java Basics.

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

	1.1 Variables

		1.1.1 **Instance Variables (Non-Static Fields)**
		store the state of an object

		1.1.2 **Class Variables (Static Fields)**
		any field with *static* keyword

		1.1.3 **Local Variables**
		Method  can store temporary state in *local* variables

		1.1.4 **Parameters**
		method parameters

	1.2 Naming conventions and rules

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