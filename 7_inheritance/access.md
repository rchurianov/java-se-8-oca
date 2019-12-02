
# Controlling Access to Members of a Class

- public
- package-private
- protected
- private

## Protected

Visible to:
    - class
    - package
    - subclass

*Protected* means that the field can be accessed either:    
    - From the same package.
      This means that if we make an instance of an imported class that has protected fields, those protected fields will not be accessible.
    - From the direct sub-object using inheritance syntax.
      The other object can be in a different package.
      The inheritance syntax is the key here.
      We can only access directly inherited fields.

```Java
// A.java
package one;

public class A {
    protected int f1 = 0;
}

// B.java
package two;

import one.A;

public class B extends A {

    /*
    Implicitly included:
    protected int f1 = 0;
    */

    public void print() {
        System.out.print(this.f1);
        // this keyword can be used only in instance methods
    }

    public static void main(String[] args) {
        A a = new A(); // we are just creating an instance of A here
        /*
        The next line will cause an error.
        Because A class is from a different package
        we can access its fields only in the same package.
        Or from a descendant from a different package.
        */
        int tmp = a.f1; // But here we created an A object.
        // And are trying to access a protected field from
        // a different package basically.
    }
}
```
