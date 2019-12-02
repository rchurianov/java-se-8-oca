
# Defining an Interface

Access:
    - all method declarations are implicitly public
    - either public or default
    - public
        accessible by any class in any package
    - *default*
        accessible only to classes defined in the same package as the interface

- an interface can extend other interfaces
    - can extend any number of interfaces

can contain:
- abstract methods
    declared without implementation:
    ```Java
    abstract void moveTo(double deltaX, double deltaY);
    ```
- default methods
    a default method would have a default implementation right
    in the interface
- static methods

Rule:
- A class that implements an interface must implement *all* of the interface's methods.

Ex.:

```Java
public interface SomeInterface extends Interface1,
                                        Interface2,
                                        Interface3 {
    // constant declarations
    double e = 2.718282;

    //method signatures
    void doSomething (int i, double x);
    int doSomethingElse(Strings);
}

```

## Top level interface

A top level interface can be declared:
    - public
    - default

If a top level interface is declared *public* than it can be implemented by any class in any package.

If a top level interface is declared *default* than it can be implemented only by classes in the same package.

## When an Abstract Class Implements an Interface

An __abstract__ class may not implement all methods in an interface.

```Java
abstract class X implements Y {
    // implements all but one method of Y
}

class XX extends X {
    // implements the remaining method in Y
}
```












---
