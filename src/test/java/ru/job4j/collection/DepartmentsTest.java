package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.Departments;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = List.of("k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expect = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortAsc() {
        List<String> input = new ArrayList<>(List.of("k1/sk2", "k1", "k1/sk1", "k2"));
        List<String> expect = List.of("k1", "k1/sk1", "k1/sk2", "k2");
        Departments.sortAsc(input);
        assertThat(input, is(expect));
    }

    @Test
    public void whenSortDesc() {
        List<String> input = new ArrayList<>(List.of("k1/sk2", "k1", "k1/sk1", "k2"));
        List<String> expect = List.of("k2", "k1", "k1/sk1", "k1/sk2");
        Departments.sortDesc(input);
        assertThat(input, is(expect));
    }

}