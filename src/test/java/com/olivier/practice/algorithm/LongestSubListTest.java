package com.olivier.practice.algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LongestSubListTest {

    @Test
    public void testEmptyList() {
        List<Integer> input = Collections.emptyList();
        Integer actual = LongestSubList.getLargestSubListCount(input);
        assertEquals(Integer.valueOf(0), actual);
     }

    @Test
    public void testOddNumberLargestSubList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 6, 2, 6, 7, 8, 9, 1);
        Integer expected = 5;
        Integer actual = LongestSubList.getLargestSubListCount(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testEvenNumberLargestSubListCount() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 6, 2, 6, 7, 8, 9);
        Integer expected = 5;
        Integer actual = LongestSubList.getLargestSubListCount(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSecondArrayLonger() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 2, 4, 5 ,6, 7, 8, 9, 0);
        Integer expected = 7;
        Integer actual = LongestSubList.getLargestSubListCount(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleElement() {
        List<Integer> input = Collections.singletonList(1);
        Integer expected = 1;
        Integer actual = LongestSubList.getLargestSubListCount(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleElementList() {
        List<Integer> input = Collections.singletonList(1);
        List<Integer> actual = LongestSubList.getLargestSubList(input);
        assertEquals(input, actual);
    }

    @Test
    public void testSecondArrayLongerList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 2, 4, 5 ,6, 7, 8, 9, 0);
        List<Integer> expected = Arrays.asList(2, 4, 5, 6, 7, 8, 9);
        List<Integer> actual = LongestSubList.getLargestSubList(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testEvenNumberLargestSubList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 6, 2, 6, 7, 8, 9);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 6);
        List<Integer> actual = LongestSubList.getLargestSubList(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testDuplicateList() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 6, 6, 2, 6, 6, 7, 8, 9);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 6, 6);
        List<Integer> actual = LongestSubList.getLargestSubList(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testDuplicateListCount() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 6, 6, 2, 6, 7, 8, 9);
        Integer expected = 6;
        Integer actual = LongestSubList.getLargestSubListCount(input);
        assertEquals(expected, actual);
    }
}
