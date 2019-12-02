
# Methods

## Passing Information to a Method

### Passing Primitive Data Type Arguments

 Primitive data types such as *int* and *double* are passed by value.
 This means that any changes to the values of the parameters exist only within the scope of the method.

### Passing Reference Data Types Arguments

- passed by *value*
- when the method returns, the passed-in reference still references the same object as before
- the values of object's fields *can* be changed if they have appropriate access level

Reference parameters, such as objects, are also passed by *value*.
When the method returns, the passed-in reference still references the same object as before.
The values of the object's fields *can* be changed in the method, if they have proper access level.

## Method's Local Variables

Local variables must be initialized.

```Java
public void someMethod() {
    double d = 1.0;
    String mark;

    if (d > 4.0) {
        mark = "Excelent";
    } else if (d < 4.0) {
        mark = "Good";
    }
    // this method will generate Compile-time error
    // because _mark_ is a local variable and
    // compiler does not if it is initialized or not
}

```



















---
