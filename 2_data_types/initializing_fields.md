
# Initializing Fields

```Java
public class BedAndBreakfast {

    // initialize to 10
    public static int capacity = 10;

    // initialize to false
    private boolean full = false;
}
```
- instance variables can be initialized in constructors
    - error handling
    - other logic

## Static Initialization Blocks

A *static initialization block* :

```
static {
    whatever initialization code goes there
}
```

Static initialization blocks:

- can be anywhere in the class body
- can be any number of them
- it is guaranteed by the runtime that static intialization blocks will be called in the order they appear int the source code

### Alternative

... or we can write a private static method:

```
class Whatever {
    public static varType myVar = initializeClassVariable();

    private static vatType initializeClassVariable() {
        // initialization goes here
    }
}
```

- advantage of private static methods for initialization:
    - can be reused later
- disadvantage
    - non-interactive (!)

## Initializing Instance Members

- Constructor

- two alternatives to constructor:
    - initializer blocks
    - final methods

## Initializer blocks

```
{
    // whatever code for initialization
}
```

Compiler copies initializer blocks into every constructor.

This approach can be used to share a block of similar code between constructors.

## Final Methods for Initialization

```
class Whatever {
    private varType myVar = initializeInstanceVariable();

    protected final varType initializeInstanceVariable() {
        // initialization code goes here
    }
}
```

(!) :
    - final methods can not be overridden in a subclass
    - calling non-final methods during initialization can cause problems












---
