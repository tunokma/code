package org.code.easy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest {
    TwoSum solution;

    @Before
    public void setUp() {
        solution = new TwoSum();
    }

    @Test
    public void example1() {
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] expect = {0, 1};
        assertArrayEquals(result, expect);
    }

    @Test
    public void example2() {
        int[] result = solution.twoSum(new int[]{3, 2, 4}, 6);
        int[] expect = {1, 2};
        assertArrayEquals(result, expect);
    }

    @Test
    public void example3() {
        int[] expect = {0, 1};
        int[] result = solution.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(result, expect);
    }

}