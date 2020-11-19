package ru.job4j.oop.story;

public class Story {

    public static void main(String[] args) {
        Ball kolobock = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        kolobock.roll();
        hare.pickUp(kolobock);
        kolobock.sing(hare);
        kolobock.roll();
        wolf.pickUp(kolobock);
        kolobock.sing(wolf);
        kolobock.roll();
        fox.pickUp(kolobock);
        kolobock.sing(fox);
        fox.eat(kolobock);
    }
}
