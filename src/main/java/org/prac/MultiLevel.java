package org.prac;


class GrandFatherAge{
    int grandFatherAge;
    public GrandFatherAge(int grandFatherAge){
        this.grandFatherAge = grandFatherAge;
    }
    public void showGrandFatherAge(){
        System.out.println("Grand Father Age : "+grandFatherAge);
    }
}

class FatherAge extends GrandFatherAge{
    int fatherAge;
    public FatherAge(int fatherAge){
        super(fatherAge+20);
        this.fatherAge=fatherAge;
    }

    public void showFatherAge(){
        showGrandFatherAge();
        System.out.println("Father Age : "+fatherAge);
    }
}

class SonAge extends FatherAge{
    int sonAge;

    public SonAge(int sonAge){
        super(sonAge+20);
        this.sonAge = sonAge;
    }

    public void showSonAge(){
        showFatherAge();
        System.out.println("Son Age : "+sonAge);

    }
}
public class MultiLevel {
    public static void main(String[] args) {
        SonAge sonAge = new SonAge(20);
        sonAge.showSonAge();
    }
}
