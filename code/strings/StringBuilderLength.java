

public class StringBuilderLength {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100); // sb definitely not null
        //sb.append(null); // can't pass null to append method - compile time error
        System.out.println(sb.length() + " : " + sb.toString().length());
    }
}
