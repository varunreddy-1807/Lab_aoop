package com.array;

public class Main {
    public static void main(String[] args) {
       
        Integer[] intArray = {10, 20, 4, 45, 99};
        ValueFinder<Integer> intFinder = new IntegerValueFinder();
        System.out.println("Integer - Max: " + intFinder.findMax(intArray));
        System.out.println("Integer - Min: " + intFinder.findMin(intArray));

        
        Float[] floatArray = {3.5f, 2.1f, 5.7f, 1.2f};
        ValueFinder<Float> floatFinder = new FloatValueFinder();
        System.out.println("Float - Max: " + floatFinder.findMax(floatArray));
        System.out.println("Float - Min: " + floatFinder.findMin(floatArray));

        
        Character[] charArray = {'a', 'b', 'z', 'm'};
        ValueFinder<Character> charFinder = new CharacterValueFinder();
        System.out.println("Character - Max: " + charFinder.findMax(charArray));
        System.out.println("Character - Min: " + charFinder.findMin(charArray));

        
        String[] strArray = {"apple", "orange", "banana", "grape"};
        ValueFinder<String> strFinder = new StringValueFinder();
        System.out.println("String - Max: " + strFinder.findMax(strArray));
        System.out.println("String - Min: " + strFinder.findMin(strArray));
    }
}
