
# Primitive Types

Java is statically typed.
Each variable should be declared before it can be used.
Declaration involves specifying variable's type and name.

## Eight Primitive Data Types

1. byte [-128; 127]
2. short [-32768; 32767]
3. int [-2^31; 2^31 - 1]
4. long int [-2^63; 2^63-1]
5. float [-2^31; 2^31-1]
6. double [-2^31; 2^31-1]
7. boolean {true; false}
8. char 2^16 i.e. 16-bit unicode character

## Literals

### Integer Literals

int decVal = 26;

int hexVal = 0x1a;

int binVal = 0b11010;

**Wrong binary assignments:**

int wBinV = b01010; // should be: 0b01010

int wBinV = 1010b; // letters that can be put at the end of the literal: l L d D f F should be: 0b1010

**Wrong hexadecimal assignments**

int wHexV = x3A; // should be 0x3A

int wHexV = 3Ax; // at the back only: l L d D f F



### Long Integer Literals

long longVal = 4000l;

long bigLongVal = 1000000L;

### Floating Point Literals

double doubleValue = 2.34d;

double bigDoubleVal = 3.999999D;

double d1 = 4.829; // default

float f1 = 123.4f;

float f2 = 345.22F;


## Byte 8

Eight (8) bits;
If unsigned would have been 2^8 values;
But Byte is a signed type, so one bit goes for indicating sign.
Thus the overall amount of values is 2*(2^7). Because we have 128 negative numbers and 128 numbers bigger or equal to zero.
2^7 = 128, and Byte can have values starting from -128 and ending at 127.

(!): signed

Range [-128, 127] = [-2^7, 2^7 - 1]

2^2 = 4
2^3 = 8
2^4 = 16
2^5 = 32
2^6 = 64
2^7 = 128
2^8 = 256

## Short 16

Short type takes the double amount of bits than Byte type.
Byte takes 8. Thus Short takes 16.
It is a signed type, just like Byte.
Just like in Byte the first bit goes for indicating sign.
Thus the number of value bit shrinks down to 15.
The amount of values is 2*(2^15) because the sign add extra dimension. The amount of values is still 2^16. The range though is
specified by 2^15 = 32768.
Thus the range is from -32768 to 32768.

(!): signed

2^15 = 32768

Range [-2^15, 2^15 - 1].


## Integer 32

Integer type takes 32 bits. Which is standard for almost any language and any operating system.

2^32 = 4_294_967_296

Integer is a signed type.
It can serve 2^32 values.
But the maximum positive value is 2^31-1.
And the minimal negative value is -2^31.

Range [-2^31, 2^31 - 1].

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

In short, you can assign an int to a char if the assigned int fits into [0, 2^16 - 1] (i.e. [0, 65535]).

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

Escape sequences:
\n \r \t \b \f \' \" \\


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
