package com.array;

public class StringValueFinder implements ValueFinder<String> {

    @Override
    public String findMax(String[] array) {
        String max = array[0];
        for (String value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    @Override
    public String findMin(String[] array) {
        String min = array[0];
        for (String value : array) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }
}
