
# Nested Class

- general public class

```
public class OuterClass {
    ...
    class NestedClass {
        ...
    }
}
```
These are called nested classes.

- static public classes

```
public class OuterClass {
    static class StaticNestedClass {

    }
    class InnerClass {

    }
}
```

These are called *static nested classes*.

- nested class is a member of enclosing class

- static nested classes do not have access to other members

## Usage

- logically group classes that are used only in one place
- increase encapsulation
- can possibly create mare readable and maintainable code: placing classes close to where they are used simplifies things

- non-static members have access to other member of the enclosing class
- static nested classes do not have access to the enclosing class

### Static Nested Classes

- Access:

```
OuterClassName.StaticNestedClassName
```

### Inner Class

- can not define any static members
- has access to the instance's fields and methods
- instances of inner class exists only *within* an instance of the outer class

Syntax to create an inner class:

```
OuterClass.InnerClass innerObject - outerObject.new InnerClass();
```

## Shadowing

some obscure topic

## Serialization

**Usage**

*Serialization is converting an object to byte stream so that object's state can be reverted from that stream*

Serialization of inner, local and anonymous classes is discouraged.

## Nested Classes

### Inner Classes

- can not define or declare any static members

```Java

public class DataStructure {

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    private class EvenIterator implements DataStructureIterator {
        // ... custom iterator logic ...
    }

    // ...
}
```

### Local Classes

Can be defined in any block:
- in a method body
- in a for loop
- in an if clause
- ...

- local class can access the members of an enclosing class
- local class can access local variables of its block but only those that are declared final
- JAVA 8: a local class can access variables that are *effectively final*
an *effectively final* variable is a variable that is never changed in a block after initialization
- can not define or declare any static members
- local classes are non-static (because they have access to instance members of the enclosing block)
- consequently local classes can not contain static declarations

- can not declare an interface inside a block
- can not declare static initializers or member interfaces in a local class

### Anonymous Classes

- like local classes but do not have a name
- anonymous class is an expression

- *Usage:* can be used, if a local classes is needed only once

```Java
public class HelloWorldAnonymousClasses {

    interface HelloWorld {
        public void greet();
    }

    public void sayHello() {

        HelloWorld frenchGreeting = new HelloWorld() {

            String name = "tout le monde";

            public void greet() {
                System.out.println("Salut " + name);
            }
        }

        frenchGreeting.greet();
    }
}
```

#### Syntax of Anonymous Classes

```
SomeInterface someObject = new SomeInterface() {

}
```

- the **new** operator
- the name of the interface to implement or a class to extend
- constructor parentheses
- a body





















---
