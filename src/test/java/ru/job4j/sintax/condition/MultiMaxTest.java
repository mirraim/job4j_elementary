package ru.job4j.sintax.condition;

import org.junit.Test;
import ru.job4j.sintax.condition.MultiMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(5, 4, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 6);
        assertThat(result, is(6));
    }

}