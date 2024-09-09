package com.array;

public class FloatValueFinder implements ValueFinder<Float> {

    @Override
    public Float findMax(Float[] array) {
        Float max = array[0];
        for (Float value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    @Override
    public Float findMin(Float[] array) {
        Float min = array[0];
        for (Float value : array) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }
}
