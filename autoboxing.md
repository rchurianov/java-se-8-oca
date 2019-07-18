
# Autoboxing and Unboxing

*Autoboxing* is an automatic conversion that _Java compiler_ makes between the primitive types and their wrapper classes. For example converting from *double* to *Double*, from *int* to *Integer*.

If the conversion goes the other way, it is called *unboxing*.

Simplest example:
```Java
Character ch = 'a';
```

Another example:
```Java
List<Integer> li = new ArrayList<>();
for (int i = 1; i < 50; i += 2) {
    li.add(i);
}
```
This code compiles even though the added vlaues are not *Integer* objects but rather *int* primitive values.
Java compiler implicitly converts int to Integer.

The Java compiler applies autoboxing when a primitive value is:
- Passed as a parameter to a method that expects an objects of a corresponding wrapper class.
- Assigned to a variable of a corresponding wrapper class.

*Autoboxing* is done with *valueOf()* method.

Remainder (%) and unary plus (+=) aperators do not apply to *Integer* object. So, when these operators are nevertheless applied to *Integer* objects, Java compiler performs unboxing.

*Unboxing* is done by calling *this.intValue()* method.

Unboxing is carried out when an object of a wrapper class is:
- Passed as a parameter to a method that expects a primitive type
- Assigned to a variable of the corresponding primitive type.

























--
