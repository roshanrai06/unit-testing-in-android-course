package com.techyourchance.unittestingfundamentals.exercise3;

import com.techyourchance.unittestingfundamentals.example3.Interval;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class IntervalsAdjacencyDetectorTest {
    IntervalsAdjacencyDetector SUT;

    @Before
    public void setup() {
        SUT = new IntervalsAdjacencyDetector();
    }

    @Test
    public void adjacentNumbers_isAdjacent_returnAdjacentNumber() {
        Interval interval1 = new Interval(4, 5);
        Interval interval2 = new Interval(5, 6);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(true));
    }
    @Test
    public void isAdjacent_Overlaps_returnAdjacentNumber() {
        Interval interval1 = new Interval(4, 5);
        Interval interval2 = new Interval(3, 8);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(false));
    }
    @Test
    public void adjacentNumbers_isNotAdjacent_returnNotAdjacentNumber() {
        Interval interval1 = new Interval(3, 6);
        Interval interval2 = new Interval(2, 3);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(true));
    }
    @Test
    public void adjacentNumbers_isNotAdjacent_returnNotAdjacentNumber1() {
        Interval interval1 = new Interval(3, 6);
        Interval interval2 = new Interval(3, 6);
        boolean result = SUT.isAdjacent(interval1, interval2);
        assertThat(result, is(true));
    }

}