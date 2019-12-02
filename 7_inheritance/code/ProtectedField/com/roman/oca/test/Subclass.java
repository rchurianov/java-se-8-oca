
package com.roman.oca.test;

import com.roman.oca.ProtectedField;

public class Subclass extends ProtectedField {

    public void print() {
        ProtectedField pf = new ProtectedField();
        System.out.println(pf.f1);
        System.out.println(pf.f2);
        System.out.println(this.f2);
        System.out.println(super.f2);
    }

    public static void main(String[] args) {
        new Subclass().print();
    }

}
