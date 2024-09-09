package com.array;

public interface ValueFinder<T extends Comparable<T>> {
    T findMax(T[] array);
    T findMin(T[] array);
}
