
# Packages

## What is a package

It's a namespace that organizes a set of related classes.

Conceptually we might think of packages as being similar to folders on a computer.
We might keep HTML files in one folder, images in another, scripts in another.

## Why is it used

- to help finding types
- to avoid naming conflicts
- to control access

## Definition

A *package* is a grouping of related types providing access protection and name space management.

*Types* refer to:
    - classes
    - interfaces
    - enumerations
    - annotation types

## Packages of the Java platform

Fundamental classes:
    - java.lang

Classes for input and output:
    - java.io

etc.

## Creating a package

(!) Package statement should always be the first line in the source file.

(!) There can only be one package statement in a source file.

```
package mypackage;
```

### Note

We can put multiple types in one source file.

*But* only *one* type can be public (and must have the same name as the source file).

We can put non-public type in the same file as a public type.
Only the public type will be accessible outside a package.
All the top-level, non-public types will be package private.


## Using Package Members

Package members - types that comprise the package.

We can use only public package members outside its package.

To use a public package public member outside its package:

    - refer to the member by its fully qualified name
    - import the package member (only the package member)
    - import the member's entire package

## Importing a package member

```
import graphics.Rectangle;
```
## Importing an Entire Package

```
import graphics.*;
```

### Note

Another, less common form of import allows us to import the public nested classes of an enclosing class.

For example, if the Rectangle **class** contained nested classes Rectangle.DoubleWide and Rectangle.Square, then it could have been imported with the following **two** statements:
```
import graphics.Rectangle; // imports the enclosing class
import graphics.Rectangle.*; // imports nested classes
```

## Importing Static Members

If a member is static it can be imported into another class with:

```
import static java.lang.Math.*; // for a group of members
import static java.lang.Math.PI; // for a constant
```



















---
