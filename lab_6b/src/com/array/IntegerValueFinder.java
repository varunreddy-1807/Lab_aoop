package com.array;

public class IntegerValueFinder implements ValueFinder<Integer> {

    @Override
    public Integer findMax(Integer[] array) {
        Integer max = array[0];
        for (Integer value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    @Override
    public Integer findMin(Integer[] array) {
        Integer min = array[0];
        for (Integer value : array) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }
}
