import java.util.*;

public class IntToChar {

    public static void main(String[] args) {
        char c1 = 127;
        System.out.println("char being assigned 127 int value " + c1);

        char c2 = '7';
        System.out.println("char being assigned \'7\' value " + c2);

        // 2^15 = 32768
        char c3 = 32767;
        System.out.println("char being assigned 32767 (2^15 - 1) integer value: " + c3);

        char c4 = 32768;
        System.out.println("char assigned 32768 (2^15) int value: " + c4);

        char c5 = 65535;
        System.out.println("char assigned 65535 (2^16 - 1) int value: " + c5);

        // compile time error
        // char c6 = 65536; // incompatible types: possible lossy conversion from int to char
        // System.out.println("char assigned 65536 (2^16) int value: " + c6);
    }
}
