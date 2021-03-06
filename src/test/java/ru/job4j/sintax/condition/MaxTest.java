package ru.job4j.sintax.condition;

import org.junit.Test;
import ru.job4j.sintax.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax321Then3() {
        int result = Max.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax2To2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5623Then6() {
        int result = Max.max(5, 6, 2, 3);
        assertThat(result, is(6));
    }
}