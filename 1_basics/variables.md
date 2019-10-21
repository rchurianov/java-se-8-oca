
# Fields and Variables

## Relation to objects

- An object stores its state in *fields*.

Fields belong to classes.

- What are the rules and conventions for naming a fields?
- Besides *int*, what other data types are there?
- Do fields have to be initialized when they are declared?
- Are fields assigned a default value when they are not explicitly initialized?

But first lets put some technical terms out of the way.

## Kinds of variables

- instance variables (non-static fields)
- class variables (static fields)
- local variables
- parameters

### Instance Variables

Objects store their state in non-static fields (fields declared without the static keyword).

### Class Variables

- declared with *static* keyword

*Static* modifier tell the compiler that exactly one copy of this variable exists regardless of the number of objects of this class.

#### *final* keyword

The *final* keyword can be added to the static field declaration to indicate that the value of the field will not change during the course of the program execution.

Thus the declaration:
```
final static int numberOfLegs = 4;
```
will give an integer constant.

### Local Variables

Local variables of a method.

### Parameters

eg.:
```
public static void main(String[] args)
```


Variables are usually local and belong to methods.

Fields may not be initialized.
Compiler will initialize them with default values for primitive types.

## Names
