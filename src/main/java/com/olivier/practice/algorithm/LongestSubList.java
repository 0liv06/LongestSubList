package com.olivier.practice.algorithm;

import java.util.*;

public class LongestSubList {

    public static Integer getLargestSubListCount(List<Integer> list) {

        Integer length = 0;
        Integer currLength = 0;
        Integer previousElement = null;

        for (int i = 0; i < list.size(); i++) {

            if (previousElement == null) {
                previousElement = list.get(i);
            }

            if (previousElement > list.get(i)) {
                currLength = 1;
            } else {
                currLength++;
                if (currLength > length) {
                    length = currLength;
                }
            }
            previousElement = list.get(i);
        }
        return length;
    }

    public static List<Integer> getLargestSubList(List<Integer> list) {
        List<Integer> currentList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        Integer previousElement = null;

        for (int i = 0; i < list.size(); i++) {

            if (previousElement == null) {
                previousElement = list.get(i);
            }

            if (previousElement > list.get(i)) {
                currentList = new ArrayList<>();
                currentList.add(list.get(i));
            } else {
                currentList.add(list.get(i));
                if (currentList.size() > result.size()) {
                    result = currentList;
                }
            }
            previousElement = list.get(i);
        }

        return result;
    }
}
