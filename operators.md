
# Java Operators

null is not an instance of anything

| Operator             | Precedence                    |
| -------------------- | ----------------------------- |
| postfix              | *expression*++ *expression*-- |
| unary                | ++expr --expr +expr -expr ~ ! |
| multiplicative       | * / %                         |
| additive             | + -                           |
| shift                | << >> >>>                     |
| relational           | < > <= >= instaceof           |
| equality             | == !=                         |
| bitwise AND          | &                             |
| bitwise exclusive OR | ^                             |
| bitwise inclusive OR | &#124;                        |
| logical AND          | &&                            |
| logical OR           | &#124;&#124;                  |
| ternary              | ? :                           |
| assignment           | = += -= *= /= %= &= ^= &#124;= <<= >>= >>>= |

# Postfix operators

Prefix version *++result* evaluates to incremented version.

Postfix version *result++* evaluates to the original value when used in a larger expression.


# Questions and Exercises

## Questions

1.
arrayOfInts[j] > arrayOfInts[j + 1]

Operators:
- relational comparison >
- additive + (two operand)

2. Values of n, i after the code is executed?

a.
int i = 10;
int n = i++%5;

i = 11
n = 0

b.
int i = 10;
int n = ++i%5;

i = 11
n = 1

3. To invert the value of *boolean*, which operator would you use?
!

4. Which operator is used to compare two values, = or == ?
==

5. Explain:
resut = someCondition ? value1 : value2;

*someCondition* should evaluate to *true* or *false*.
Base on the evaluation of *someCondition* *result* will be assigned either *value1* or *value2*. If *someCondition* evaluates to *true* then *result* will be assigned *value1*. If *someCondition* evaluates to *false* then *result* will be assigned *value2*.

# Exercises

1.
result = result - 1;
result -= 1;

result = result * 2;
result \*= 2;

result = result / 2;
result /= 2;

result = result + 8;
result += 8;

result = result % 7;
result %= 7;

2.
```Java
class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;                     
        System.out.println(i);    // "5"
        System.out.println(++i);  // evaluate ++i first then print "6"
        System.out.println(i++);  // print i, evaluate i++ after ; print "6"
        System.out.println(i);    // print i evaluated between statements: "7"
    }
}
```

Prefix evaluates to incremented value.
Postfix evaluates to current value.
