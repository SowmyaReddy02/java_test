package org.prac;

abstract public class Compartment {
    abstract void notice();
}

class FirstClass extends Compartment{
    @Override
    void notice() {
        System.out.println("First Class");
    }
}

class Ladies extends Compartment{
    @Override
    void notice() {
        System.out.println("ladies");
    }
}

class General extends Compartment{
    @Override
    void notice() {
        System.out.println("General");
    }
}

class Luggage extends Compartment{
    @Override
    void notice() {
        System.out.println("Luggage");
    }
}

class TestCompartment{
    public static void main(String[] args) {
        Compartment[] compartment = new Compartment[10];
        compartment[0]= new FirstClass();
        compartment[0].notice();
        compartment[1]= new Ladies();
        compartment[1].notice();
        compartment[2] = new General();
        compartment[2].notice();
        compartment[3] = new Luggage();
        compartment[3].notice();
    }
}
