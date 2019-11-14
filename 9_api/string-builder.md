cd
# StringBuilder class

## Length and Capacity

*StringBuilder Constructors*

| Constructor                     | Description                               |
| ------------------------------- | ----------------------------------------- |
| StringBuilder()                 | Creates an empty string builder.          |
|                                 | Initial capacity: 16.                     |
| StringBuilder(CharSequence cs)  | Creates StringBuilder from CharSequence   |
|                                 | with extra 16 trailing empty elements     |
| StringBuilder(int initCapacity) | Creates an empty StringBuilder            |
|                                 | with specified capacity                   |
| StringBuilder(String s)         | Creates StringBuilder from specified      |
|                                 | String with extra 16                      |
|                                 | trailing empty elements                   |

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
