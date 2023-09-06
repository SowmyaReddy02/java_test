package org.prac;

abstract public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

 class Rectangle extends Figure{
    public Rectangle(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("rectangle");
        return dim1*dim2;
    }

}
 class Triangle extends Figure{
    public Triangle(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("Triangle");
        return dim1*dim2/2;
    }

}

class Main{
    public static void main(String[] args) {
        Figure figure;
        figure = new Rectangle(2,3);
        System.out.println(figure.area());
        figure = new Triangle(2,3);
        System.out.println(figure.area());
}}