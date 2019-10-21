
# Decision Constructs

## *if* Statement

```Java
if () {

}
```

Allowed expressions in if statement:
1. a comparison expression which result is either true or false
2. a boolean variable
3. a boolean literal
4. a boolean assignment, e.g.:

boolean flag;
if (flag = true) {

}

An assignment expression evaluates to the type and value of variable that is being assigned.


## *switch* Statement

switch (<expression>) {
    case <value>:
        ...;
        break;
    case <value>:
        ...;
        break;
    default:
        ...;
}

*case* value must evaluate to the same type as *switch* expression.

*switch* expression can be:
- byte
- short
- int
- char
- Byte
- Short
- Int
- Character
- enums (Java SE 6)
- String (Java SE 7)

Type matching is evaluated during compilation, thus type-safety.

Example:

```Java
public class SwitchCase {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            default:
                System.out.println("Any fuit will do");
            case "Apple":
                System.out.println("Apple");
            case "Mango":
                System.out.println("Mango");
            case "Banana":
                System.out.println("Banana");
                break;
        }
    }
}
```

*default* expression can precede *case* expressions.
In this case execution falls through until the first break statement.




















---
