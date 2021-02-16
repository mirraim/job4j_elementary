package ru.job4j.oop.ex;

import org.junit.Test;
import ru.job4j.oop.ex.Fact;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenCalc() {
        Fact fact = new Fact();
        fact.calc(-3);
    }
}