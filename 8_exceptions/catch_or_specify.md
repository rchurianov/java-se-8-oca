
# The Catch or Specify Requirement

The code that might throw exceptions should either:
    - provide a *try-catch* statement around the code
    - specify that it can throw an exception if it is a method

## The Three Kinds of Exceptions

**Checked exception**

- applications should recover from checked exceptions
- applications should anticipate this kind of exceptions

- checked exceptions are subject to the Catch or Specify requirement

- all exceptions are checked except:
    - Errors
    - RuntimeException
    - their subclasses

**Errors**

Malfunctions that happened due to some external factors.

**Runtime Exceptions**

Internal malfunctions of an application that are not anticipated and are caused by bugs, wrong logic, etc.


























---
