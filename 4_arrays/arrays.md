
# Arrays

## Creating, Initializing an Array

```Java

int [] anArray = new int[10];

int[] anArray = {100, 200, 300};

int anArray[]; // C-style allowed

byte [] anArray [] = new byte[3][];

byte [][] anArray = new byte[4][3];

// Incorrect ways to declare an array:

int anArray[][] = int[][10];
// the first dimension of the
// multidimensional array should always be specified when
// instantiating an array.
// Putting brackets after the array name is discouraged but
// allowed.

short arr[] = {};
// empty curly braces will create an array with length 0
// and we won't be able to add elements to the array

long [] anArray = new long[]{100, 2000};
// can not use brackets and curly braces together

short [2] arr;
// can not specify dimension

```

## One-dimensional array

## Multi-dimensional array

The row are allowed to wary in length.
