
# Date and Time classes

## LocalTime

Time! No Date! No time zone!

Represents time only.
ISO-8601
Example: 10:15:30

Immutable. (learn what does it mean)
The adjective immutable can be used in relation to an class/object.
It means that the class design shares a specific set of features that make it impossible to change an object of that class after creation.
Not static.
Has static methods.

A value-based class.
This means that instances of value-based classes:
- are final and immutable (though may contain references to mutable objects). Immutable means that it can not be changed.
- have implementations of equals, hashCode, toString methods, that are computed solely from the instance's state
- makes no use of identity-sensitive operations such as
    - reference equality (==) between instances
    - identity hash code of instances
    - synchronization on an instances' intrinsic lock
- are considered equal solely based on equals() method, not based on reference equality (==)
- do not have accessible constructors
- are instantiated through factory methods
    - factory methods make no commitment as to the identity of returned instances
- are *freely substitutable* when equal
    - interchanging any two instances x and y that are equal according to equals() in any computation or method invocation should produce no visible change in behavior

### Some Important Methods

#### Static

- static LocalTime now()
  obtains the current time from the system clock
- static LocalTime parse(CharSequence text)
  *text* should be like "10:20:30" and not null
- static LocalTime of(int hour, int minute, int seconds, int nanoOfSecond)
  Obtains an instance of LocalTime from an hour, minute, second and nanosecond.

#### Instance

- int compareTo(LocalTime other)
- boolean equals(Object obj)
  Checks if this time is equal to another time
- int getHour()
- int getMinute()
- int getSecond()
- int getNano()

Precision: nanosecond.
Example: 13:45:30.123456789

equals() method should be used for comparison

Key methods:

static LocalTime.of(int hour, int minute)
static LocalTime.of(int hour, int minute, int second)
static LocalTime.of(int hour, int minute, int second, int nanoOfSecond)

## Constants

LocalTime.MAX = 















---
