package com.triangle;

public class TriangleTypeChecker {

 public enum TriangleType {
     EQUILATERAL, ISOSCELES, SCALENE, INVALID
 }

 public static TriangleType getTriangleType(double side1, double side2, double side3) {
    
     if (!isValidTriangle(side1, side2, side3)) {
         return TriangleType.INVALID;
     }

     if (side1 == side2 && side2 == side3) {
         return TriangleType.EQUILATERAL;
     }

     if (side1 == side2 || side2 == side3 || side1 == side3) {
         return TriangleType.ISOSCELES;
     }

     return TriangleType.SCALENE;
 }

 private static boolean isValidTriangle(double side1, double side2, double side3) {
    
     return (side1 + side2 > side3) &&
            (side1 + side3 > side2) &&
            (side2 + side3 > side1);
 }
}