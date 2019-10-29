
# Casting of Primitive Data Types

Primitive type casting is when you assign a value of one primitive data type to another type.

In Java there two types of casting:

    - Widening Casting (auto) - converting a smaller type to a larger type
    byte -> short -> char -> int -> long -> float -> double

    - Narrowing Casting (manual) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte

When coding widening conversions, always check for information loss:

```Java
class Test {
    public static void main(String[] args) {
        int big = 1234567890;
        float approx = big;
        System.out.println(big - (int)approx);
    }
}
```

This program outputs: -46.
thus indication that information was lost during the conversion from type int to type float because values of type float are not precise to nine significant digits.


## Narrowing casting

```Java
public class MyClass {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble;

        System.out.println(myDouble);
        System.out.println(myInt);
    }
}
```




















----
