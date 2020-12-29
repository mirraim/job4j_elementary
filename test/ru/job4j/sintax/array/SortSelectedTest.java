package ru.job4j.sintax.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3() {
        int[] input = new int[] {15, 8, 16};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {8, 15, 16};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5() {
        int[] input = new int[] {6, 5, 0, 5, -6};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-6, 0, 5, 5, 6};
        assertThat(result, is(expect));
    }
}