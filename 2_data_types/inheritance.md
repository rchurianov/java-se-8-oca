
# Inheritance

In the Java language classes can be derived, thus inheriting fields and methods from the classes they derive from.

There is no multiple inheritance in Java.

Although a class can implement several interfaces.

**Definitions**

1. A class that is derived from another class is called a *subclass* (also a *derived, extended, child* class).

2. The class from which the subclass is derived is called a *superclass*.

3. Every class has one and only one superclass.
    3.1 Excepting **Object** which does not have a super class.
    3.2 In the absence of any explicit superclass, every class is derived from *Object*.

## What you can do in a subclass

- The inherited fields can be used directly, just like any other fields.

- You can declare a field in the subclass with the same name as in the super class thus *hiding* it (not recommended).

- You can declare new fields in the subclass that are not in the superclass.

- The inherited methods can be used directly as they are.

- You can write a new instance method in the sublclass with the same signature as in the superclass thus *overriding* it.

- You can write a new static method in the subclass with the same signature as in the superclass thus *hiding*.

- You can declare new methods in the subclass that are not in the superclass.

- You can write a subclass constructor that invokes the superclass constructor either implicitly or by using the keyword **super**.

**Right away** I have questions:
    1. what is *hiding*?
    2. what is *overriding*? and how does it

## Private Members in a Subclass/Superclass

1. A subclass does not inherit *private* members of its parent class.

2. If a superclass has private or protected getters and setters a subclass can be used

3. A nested class has access to all the private members of enclosing class.
Therefore, a public or protected nested class inherited by a subclass has indirect access to all of he private members of the superclass.

## Casting Objects

### Implicit Casting

```Java
Object obj = new MountainBike();
```

### Explicit Casting

```Java
MountainBike anotherBike = (MountainBike) obj;
```

This cast inserts a runtime check that *obj* is assigned MountainBike before being used as an assignment for *anotherBike*.
If *obj* is not a MountainBike a runtime exception will be thrown.

**Note**

We can make a logical test as to the type of a particular object with *instanceof* operator.
This might save us from a runtime exception owing to an improper cast.

```Java
if (obj instanceof MountainBike) {
    MountainBike anotherBike = (MountainBike)obj;
}
```













---
