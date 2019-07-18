
# Strings

- Strings are sequences of characters (arrays)

## Creation of Strings

- Strings are immutable (can not be changed after creation)
- if we need to modify a string explicitly, we can use one the methods from String class. Behind the scenes a modification method will create a new string and return it.

## String Length

- String has non-static object method *length()*

## Converting from String to Numbers

Each of wrapper classes (Byte, Short, Integer, Long, Float, Double) have a class method (a static method) that converts a Strings to a number of that type.
Method signature:
```Java
public static Integer Integer.valueOf(String s);
```

Each of wrapper classes (Byte, Short, Integer, Long, Float, Double) also provide a *static* method of type *parseXXXX(String s)* that converts Strings to primitive type numbers.
For example:
```Java
public static int Integer.parseInt(String s);
```

## Converting from Number to String

### implicit way

- concatenate number with an empty string:
```Java
int a = 0;
String s = "" + a;
```
The conversion is handled in the background.

### String.valueOf()

String class provides a static *valueOf()* method to convert numbers to String.

### toString()

Each number class (Byte, Short, Integer, Long)

























--
