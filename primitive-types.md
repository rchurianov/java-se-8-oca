
# Primitive Types

## Byte 8

Range [-128, 127] = [-2^8, 2^8 - 1].

## Short 16

Range [-2^16, 2^16 - 1].

## Integer 32

Range [-2^32, 2^32 - 1].

We can assign a char value to an int variable.

## Characters

Examples:

```Java
char ch = 'a';
// Unicode for uppercase Greek omega character
char uniChar = '\u03A9';
// an array of chars
char[] charArray = { 'a', 'b', 'c', 'd', 'e' };
```

## int to char assignment

https://stackoverflow.com/questions/21317631/java-char-int-conversions?noredirect=1&lq=1

In short, you can assign an int to a char if the assigned int fits into [0, 2^16 - 1].

char c = 7; // will assign ascii symbol with code 7
Character var = 7; // will create on object of type Character with the value of ascii character with code 7
char var = '7'; // will assign character 7
Character var = '7'; // will create an object with value = character '7'


## Escape sequences

| Escape Sequence | Description     |
| --------------- | --------------- |
| \t              | tab             |
| \b              | backspace       |
| \n              | newline         |
| \r              | carriage return |
| \f              | formfeed        |
| \'              | single quote    |
| \"              | double quote    |
| \\              | back slash      |


## Literals

A *literal* is a source code representation of a fixed value;

char capitalC = 'C';

'C' is a literal;


## Formatting Numeric Print Output

```Java
System.out.format("Some text before a float %f "
                  + "Some text before in integer %d "
                  + "Some text before a string %s", floatVar, intVar, stringVar);
```

%f
% - *percent*
f - *converter*

## StringBuilder

StringBuilder objects are like String objects, but they can be modified.
Remember that Strings are immutable.

Internally StringBuilder:
- variable-length array of character
- contains a sequence of characters

Strings should always be used unless StringBuilder offers an advantage in terms of simpler code or better perfomance.
For example, if we need to concatenate a large number of strings.

```Java
StringBuilder.length()
```

```Java
StringBuilder.capacity()
```

capacity() returns the number of character spaces allocated.
















---
