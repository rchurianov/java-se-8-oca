
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









## Manipulating Characters in a String

String class has methods for:
- examining the contents of strings
- finding characters within a string
- finding substrings within a string
- changing case
- other tasks

### Getting Characters and Substrings by index

- to get a character at a particular index:
```Java
public char charAt(int index)
```

Indexation starts at zero.
Index of the last character is *length() - 1*.


| Method | Description |
| ----------------------- | --------------------------------- |
| String substring(int beginIndex, int endIndex) | Returns a new string. The returned substring begins at beginIndex and extends to the character at index endIndex - 1. I.e. [beginIndex, endIndex) |
| String substring(int beginIndex) | Returns a new string. The new string spans from beginIndex to the end of the string |

### Other methods for manipulating strings

```
String[] split(String regex)
String[] split(String regex, int limit)
```
Both methods search for a match? specified by regular expression string and split the initial string accordingly.
The optional integer argument specifies the maximum size of the specified array.


```
CharSequence subSequence(int beginIndex, int endIndex)
```
Return a new sequence from the interval [beginIndex, endIndex - 1)

```
String trim()
```
Returns a new string. removes leading and trailing spaces.

```
String toLowercase()
String toUpperCase()
```
Returns a new string converted to lower or upper case.
If no conversion is needed, returns the original string.

### Searching for characters and substrings within a string

```Java
int indexOf(int ch)
int lastIndexOf(int ch)

int indexOf(int ch, int fromIndex)
int lastIndexOf(int ch, int fromIndex)

int indexOf(String str)
int lastIndexOf(String str)

int indexOf(String str, int fromIndex)
int lastIndexOf(String srt, int fromIndex)

boolean contains(CharSequence s)
```

- Note about CharSequence

*CharSequence* is an interface that is implemented by the *String* class.
Therefore *String* can be used as an argument in *contains* method.

### Replacing Characters and Substrings into a String

The String has very few methods for inserting strings or characters into string. This task can be accomplished by concatenating substrings of an old string and a new string.

On the other hand, String class has several methods for replacing found characters or substrings.

```Java
String replace(char oldChar, char newchar)
```
Returns a new string. *All* occurrences of the oldChar are replaced by the newChar.

```Java
String replace(CharSequence target, CharSequence replacement)
```
Replaces each occurrence of target.

```Java
String replaceAll(String regex, String replacement)
```
Replaces each substring of this string that matches the provided regex.

```Java
String replaceFirst(String regex, String replacement)
```
Replaces only the first substring that matches the regular expression.


### Comparing Strings and portions of Strings

```
boolean endsWith(String suffix)
boolean startsWith(String prefix)

int compareTo(String anotherString)

boolean equals(Object anObject)

boolean matches(String regex)
```
The *matches* method test whether this string matches the specified regular expression.
















--
