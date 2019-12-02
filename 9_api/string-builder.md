
# StringBuilder class

## Length and Capacity

Length - the number of characters in the sequence.

Unlike Strings, StringBuilder has capacity.
Capacity - the number of characters that has been allocated.

StringBuilder.length()

*StringBuilder Constructors*

    - StringBuilder()
    - StringBuilder(CharSequence cs)
    - StringBuilder(int initCapacity)
    - StringBuilder(String s)

## Printing StringBuilder to system out

When printing StringBuilder objet with System.out.println toString() method is called implicitly on the StringBuilder object.
Actually the toString() method is called implicitly an any object that is printed to the standard output using System.out.println().
I.e.
```
System.out.println(sb);
```
will yeld:
```
doT saw I was toD
```

## StringBuilder.length() method















---
