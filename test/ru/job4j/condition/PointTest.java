package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point start = new Point(0, 0);
        Point end = new Point(2, 0);
        int expected = 2;
        double out = start.distance(end);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to45then5() {
        Point start = new Point(1, 1);
        Point end = new Point(4, 5);
        int expected = 5;
        double out = start.distance(end);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10toNeg10then2() {
        Point start = new Point(1, 0);
        Point end = new Point(-1, 0);
        int expected = 2;
        double out = start.distance(end);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0Neg33toNeg313then5() {
        Point start = new Point(0, -3, 3);
        Point end = new Point(3, 1, 3);
        int expected = 5;
        double out = start.distance3d(end);
        Assert.assertEquals(expected, out, 0.01);
    }

}