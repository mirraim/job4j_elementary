package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.stream.CollectorClass;

import java.util.List;
import static org.junit.Assert.assertEquals;

public class CollectorClassTest {
    @Test
    public void test() {
        Assert.assertEquals(
                List.of(1, 2, 3),
                CollectorClass.collect(List.of(1, 2, 3))
        );
    }

    @Test
    public void testReduce() {
        assertEquals(Integer.valueOf(5), CollectorClass.reduce(List.of()));
        assertEquals(Integer.valueOf(5), CollectorClass.reduce(List.of(1)));
        assertEquals(Integer.valueOf(10), CollectorClass.reduce(List.of(1, 2)));
        assertEquals(Integer.valueOf(30), CollectorClass.reduce(List.of(1, 2, 3)));
    }
}