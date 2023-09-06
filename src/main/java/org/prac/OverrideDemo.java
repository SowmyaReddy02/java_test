package org.prac;

class Parent{
    public void buildingConst(){
        System.out.println("build");
    }
}

class Child extends Parent{
    public void buildingConst(){
        System.out.println("construct");
    }
}
public class OverrideDemo {
    public static void main(String[] args) {
        Parent p = new Child();
        p.buildingConst();
    }
}
