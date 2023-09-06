package org.prac;

interface A{
    default void foo(){
        System.out.println("A FOO");
    }
}
interface B extends A{
    default void foo(){
        A.super.foo();
        System.out.println("B FOO");
    }
}
interface C extends A{
    default void foo(){
        System.out.println("C FOO");
    }
}

class D implements B,C{
    public void foo(){
        B.super.foo();
        C.super.foo();
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        D d = new D();
        d.foo();
    }
}

