
# Questions to review:

## Date and Time classes

- LocalDate class
    - whether it can called as a static class?
    - does it have static methods?
    - can this class be instantiated?
    - constructors
    - basic methods

- LocalTime class
    - whether it can called as a static class?
      It is a general purpose class. It is not static by itself.
      It has static methods: now(), parse(), of(), etc.
    - does it have static methods?
      Yes. At least those: now(), parse(), of(), etc.
    - can this class be instantiated?
      Yes. It is a general purpose class for creating objects. It is not abstract.
    - constructors
      Does not have constructors, apart from default that is provided by the platform.
      An instance can be instantiated with methods: now(), parse(), of(), and maybe some other methods.
    - basic methods
        - static
            - now()
            - parse()
            - of()
        - instance
            - compareTo()
            - equals()
            - getHour()
            - getMinute()
            - getSecond()
            - getNano()
- Period class
    - whether it is a static class?
    - can it be instantiated?
    - basic methods
    - implicit toString() conversion
        - output
- DateTimeFormatter
    - ways to specify date/time format
    - methods
        - return types
- implicit toString() conversions by System.out.println
- java.time.LocalDateTime
    - initialization
    - getSecond() method
- LocalDate initialization methods
- Period initialization methods
- DateTimeFormatter date computation methods
- Invalid date when LocalDate initialization


## StringBuilder class

- StringBuilder class
    - equals method
    - System.out of StringBuilder
        return string by implicit conversion to String
    - System.out of an object
        returns string by calling toString() implicitly
- StringBuilder.toString() method
    returns String


## Primitive types

- basic types initial values
    - char
    - double
    - float
| Primitive Type | Default Value | Printed String |
| -------------- | ------------- | -------------- |
| byte           | (byte)0       | 0              |
| short          | (short)0      | 0              |
| int            | 0             | 0              |
| long           | 0L            | 0              |
| float          | 0.0f          | 0.0            |
| double         | 0.0d          | 0.0            |
| char           | '\u0000'      | <nothing>      |
| boolean        | false         | false          |

Compiler makes sure that uninitialized local variables can not be accessed.

variables - declared inside a block/method
field - declared in class
https://stackoverflow.com/questions/39076639/what-happens-to-a-declared-uninitialized-variable-in-java

- default values for char, double, float
char - the null character = '\u0000'
double = 0.0d (prints as 0.0)
float = 0.0f (prints as 0.0f)

- how are default values for primitive types printed?
with java 8 uninitialized local variables produce an error

| Primitive Type | Printed Default Value |
| -------------- | --------------------- |
| byte           | 0                     |
| short          | 0                     |
| int            | 0                     |
| long           | 0                     |
| float          | 0.0                   |
| double         | 0.0                   |
| char           | *nothing*             |
| boolean        | false                 |

- default values for primitive types wrapper classes
All wrapper classes are reference types.
Thus their default values are *null*.

- wrapper reference types for primitive types

| Primitive type | Wrapper class |
| -------------- | ------------- |
| boolean        | Boolean       |
| byte           | Byte          |
| char           | Character     |
| float          | Float         |
| int            | Integer       |
| long           | Long          |
| short          | Short         |
| double         | Double        |


- implicit primitive type conversions
- implicit primitive type conversions in arrays
An array is a container object.
An array holds a fixed number of values.
An array holds only values of a single type.
The length of an array is established when the array is created.
Size of the array is not part of its type.
A multidimensional array is an array of arrays. Thus rows may have different lengths.


declaration:
int[] anArray;

alternative form of declaration (valid but discouraged):
double aDoubleArray[];

memory allocation:
anArray = new int[10];


## Operators

- unary operator precedence
| Operator             | Precedence                    |
| -------------------- | ----------------------------- |
| postfix              | *expression*++ *expression*-- |
| unary                | ++expr --expr +expr -expr ~ ! |
| multiplicative       | * / %                         |
| additive             | + -                           |
| shift                | << >> >>>                     |
| relational           | < > <= >= instaceof           |
| equality             | == !=                         |
| bitwise AND          | &                             |
| bitwise exclusive OR | ^                             |
| bitwise inclusive OR | &#124;                        |
| logical AND          | &&                            |
| logical OR           | &#124;&#124;                  |
| ternary              | ? :                           |
| assignment           | = += -= *= /= %= &= ^= &#124;= <<= >>= >>>= |

### Ternary operator

- ternary operator errors
    checked at compile time
- ternary operator
- nested ternary operator

```Java
package com.udayan.oca;

import java.time.LocalTime;

public class Test {
     public static void main(String[] args) {
         LocalTime time = LocalTime.of(16, 40);
         String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM"; // Generates compile time error
         System.out.println(amPm);
     }
}
```



## Collections

### ArrayList

- ArrayList.iterator() method
    - return type: Iterator<E>
- Iterator<>.hasNext() method
    - return type
    - what is the right signature
- Iterator<>.next() method
    - return type
- List<>.remove() method
    - does exist?
- List<>.toString() default method
    - how it works?
- List<>.add method overloads
    - can this method accept two or more arguments?
    - can the first argument be the index number?
- what does ArrayList.clone() method do ?
- does clone() method use the same reference to the initial object or
it copies the whole object *by value* ?
- List Interface
- ArrayList class, or is it an interface?
- List remove method
- List add method

- Iterators returned by ArrayList are *fail-fast*. That means that is the list is structurally modified at any time after the iterator is created,
in any way except through the iterator's own remove and add methods, the iterator will throw a ConcurrentModificationException.
Thus, in the face of concurrent modification? the iterator fails quickly and cleanly? rather than ricking arbitrary? non-deterministic behaviour at an undetermined time in the future.

## Classes

- Can I place several classes in one file?
    Yes. These will be called *non-public top-level class*.
    Only one can be public.
    That single public class must have the same name as the source file.
    Other classes will be non-public.
    Those non-public classes will be *package-private*.
    https://stackoverflow.com/questions/2336692/java-multiple-class-declarations-in-one-file#
- Provided that one class is package private?
    *package-private* are classes that do not have any explicit modifier.
- class declaration
    *public/<no modifier> class SomeClass**
    can have *public* on no explicit modifier
    If no explicit is specified then the class is package-private
- package declaration rules
    there only can be one package statement in class file
- can a java file contain several classes with main methods?
    just one class may have a *public static main* method.
- public and static word order
    public and static can be exchanged
- return type word order
    should be immediately superseded by method name
- import
    - package names seem to hierarchical but are actually not
    - we can import public nested classes:
    import graphics.Rectangle;
    import graphics.Rectangle.\*;
    must use both statements
- why importing with wildcard might not work?
    wildcard importing only imports class files but not packages
    a package name can be prefixed with a name of "enclosing" package to make
    the relationship evident. But the prefix does not imply that that the
    packages are hierarchical
- does importing with wildcard import submodules too?
    no it does not
    to import submodules we have to import them explicitly
- what if I call main method from main method?
    the program will generate stackoverflow error
- compile
- static import statement
    - *static import* statement gives a way to import static constants and
    method so that we do not need to prefix those static members with their
    class name


- print
- package-private classes declaration
    no explicit access modifier
- default access modifier for variables
    when no access modifier is specified the variable is package private
- abstract classes usage
- inheritance and extension

### Initializer Blocks

- static block execution
    - they should be executed before the main method
https://stackoverflow.com/questions/335311/what-is-the-difference-between-a-static-and-a-non-static-initialization-code-blo
    - static blocks are executed when the class is loaded

- an initializer block can be non-static
    - in this case it is an *instance* initializer
    - executed in order defined
    - executed:
        - immediately after the super constructor call
        - immediately before the constructor code

## Control Flow Statements

- switch case construct
- for loop construct iteration options
- break continue

### if statement

- assignment instead of a comparison operator in *if* clause
Answer:
Result in an error:
incompatible types: int cannot be converted to boolean

Theory: <expression> should evaluate to boolean or Boolean.

Assignment expression return the assigned value.
Assignment expression has the same type as the variable in the expression.

Example:

int a = 5;
expression has type int




## String

- operator precedence in String concatenation situation
- can I use comparison operators in String concatenation?
    - goes by the same rules of precedence as any operator
- what if I call System.out from static initialization?
    - it will print the specified String
- what if I pass divide-by-zero arithmetic expression to System.out ?
    - the line with zero-division will cause Exception
- what if I put assignment operator into System.out.println?
    - System.out.println(i = 1); will print 1.
    - System.out.println(s.name = "Name"); will print name
    - System.out.println(int i = 1); will generate compile time error
- String.substring method bounds: inclusive / exclusive ?
- comparing String and StringBuilder with equals method in both directions
    - the only viable method to compare String an StringBuilder through equals() method:
    <String>.equals(<StringBuilder>.toString())
- compare string with comparison operator
    - Strings should be compared with equals() method

## Exceptions

- What is a checked Exception?
    - *checked exception*:
        - should be anticipated by the application
        - application should be able to recover from checked exceptions
- What are unchecked Exceptions?
    - errors
    - runtime exceptions










---
