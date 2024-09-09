package com.array;

public class CharacterValueFinder implements ValueFinder<Character> {

    @Override
    public Character findMax(Character[] array) {
        Character max = array[0];
        for (Character value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    @Override
    public Character findMin(Character[] array) {
        Character min = array[0];
        for (Character value : array) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }
}
