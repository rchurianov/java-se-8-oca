
class A {
    public int field1 = 0;
    protected int field2 = 1;
}

public class OnePackage extends A {

    /*
    implicitly included:
    public int field = 0;
    protected int field2 = 1;
    */

    public void print() {
        System.out.println(this.field2); // works as well
    }

    public static void main(String[] args) {
        A a = new A();
        int tmp = a.field2; // this should work
        System.out.println(a.field2);

        new OnePackage().print();
    }
}
