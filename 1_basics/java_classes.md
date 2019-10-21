
# Java Classes

## Classes

Sample declaration:

```
public class Bicycle {

}
```

Sample descendant class declaration:

```Java
public class MountainBike extends Bicycle {

}

public class MyClass extends MySuperClass implements YourInterface {

}
```

### Overloading methods

```Java
public class DataArtist {

    public void draw(String s) {

    }

    public void draw(int i) {

    }

    public void draw(double f) {

    }

    public void draw(int i, double f) {

    }

    public float draw(float fl) {
        return 1.0;
    }
}
```

The complier does not consider return type when differentiating methods.

Can not:
- declare two methods with the same parameters and different return types

### Constructors

- constructors can have parameters !

- default no-argument constructor will call default no-argument constructor of a superclass

### Parameters

- *Parameters* - declarations
- *Arguments* - actual values

If arguments and class fields share a name, and that name is referenced inside a method, then the parameters are used.

#### Arbitrary number of arguments

*varargs* is used to pass arbitrary number of parameters

- can be used only with the last parameter

#### Passing Primitive Data Type Arguments

- primitive data types are passed *by value*
when the method returns the parameters are gone and the changes to them are lost

#### Passing Reference Data Type Arguments

- reference data types are also passed *by value*

Reference data type consists of:
- reference to an object
- object fields

*reference* is pass-by-value
i.e. if we change the reference inside a method the initially passed reference will not change after method.
a new reference is created to the same object and passed to the method.

*fields* are pass-by-reference (if they have appropriate access level)

#### Constructors

Java compiler differentiate constructors based no their signatures, i.e. the number and type of arguments.

#### Garbage Collection

An object is eligible for garbage collection when there are no more references to that object.

#### Returning Interfaces

*covariant return type* - when a method is declared to return a class but also can return subclass

#### Explicit Constructor Invocation

```
public class Rectangle {
    private int x, y;

    public Rectangle() {
        this(1, 1); // explicit invocation
    }

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
```

### Access modifiers

- class can be *default* or *public*
- members can be *public*, *protected*, *default*


### *static*

- common variable for all objects of a class

- referred to as:
```
Class.staticVariable
```

- static methods
are invoked as:

```
Class.staticMethod
```

- no need to create a class instance

- Usage
    - access static fields

- *static* + *final* defines a constant

### Static initialization block

Provides flexibility in static variable initialization.
Can contain custom logic for static variable initialization.

```
static {
    // code for initialization
}
```

- Usage:
    private static methods can be used as an alternative to static initialization blocks
    the advantage of private static methods is that they can be reused later to reinitialize class variables

### Alternatives to Constructors
... in initializing instance variables

#### Initializer Blocks

- look the same as static initializer blocks
- without static keyword

```
{
    \\ initialization code
}
```
- are copied into *every* constructor
- Usage:
    - share a block of code into every constructor

#### Final Method

- *final* method can not be overridden in a subclass

```
public class Whatever {
    private varType myVar = initInstanceVar();

    protected final varType intiINstanceVar() {
        // init code
    }
}
```

- calling non-final methods during instance initialization can cause problems

### Overloaded methods

Which overloaded method will be called is decided during compilation.

### "Destruction"

Well, even though Java does not support direct object destruction, we can "mark"
an object for deletion by garbage collector.
By definition, garbage collector removes objects that are not referenced from any place in the code.
We can explicitly drop object reference by assigning *null* value to a reference.

```
objectReference = null;
```

### Questions and Exercises

#### Questions 1

1.

```
public class IdentifyMyParts {
    public static int x = 7;
    public int y = 3;
}
```

a. x
b. y
c.
5
6
2
2
2

#### Questions 2

1. myRect variable is not initialized.

2.

1 reference to the array
1 reference to the object
neither is eligible for garbage collection

3. The program does not destroy any of the objects it has created.
Instead a separate module of JVM - the Garbage Collector is invoked to destroy all the objects that have no references to them.





---
