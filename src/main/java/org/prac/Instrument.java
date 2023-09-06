package org.prac;

abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument{
    @Override
    void play() {
        System.out.println("Piano is playing tan tan tan");
    }
}
class Flute extends Instrument{
    @Override
    void play() {
        System.out.println("Flute is playing toot toot toot");

    }
}
class Guitar extends Instrument{
    @Override
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

class Main1{
    public static void main(String[] args) {
        Instrument[] instrument = new Instrument[10];
        instrument[0]= new Piano();
        instrument[0].play();
        instrument[1] = new Guitar();
        instrument[1].play();
        instrument[2] = new Flute();
        instrument[2].play();
        instrument[3]= new Piano();
        instrument[3].play();
        instrument[4] = new Guitar();
        instrument[4].play();
        instrument[5] = new Flute();
        instrument[5].play();
        instrument[6]= new Piano();
        instrument[7] = new Guitar();
        instrument[8] = new Flute();
        System.out.println(instrument[1] instanceof Guitar);
}}

