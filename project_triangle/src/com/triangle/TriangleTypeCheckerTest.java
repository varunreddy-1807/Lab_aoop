package com.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTypeCheckerTest {

 @Test
 public void testEquilateralTriangle() {
     assertEquals(TriangleTypeChecker.TriangleType.EQUILATERAL, 
                  TriangleTypeChecker.getTriangleType(5, 5, 5), 
                  "Triangle with sides 5, 5, 5 should be EQUILATERAL");
 }

 @Test
 public void testIsoscelesTriangle() {
     assertEquals(TriangleTypeChecker.TriangleType.ISOSCELES, 
                  TriangleTypeChecker.getTriangleType(5, 5, 8), 
                  "Triangle with sides 5, 5, 8 should be ISOSCELES");
 }

 @Test
 public void testScaleneTriangle() {
     assertEquals(TriangleTypeChecker.TriangleType.SCALENE, 
                  TriangleTypeChecker.getTriangleType(4, 5, 6), 
                  "Triangle with sides 4, 5, 6 should be SCALENE");
 }

 @Test
 public void testInvalidTriangle() {
     assertEquals(TriangleTypeChecker.TriangleType.INVALID, 
                  TriangleTypeChecker.getTriangleType(1, 1, 3), 
                  "Triangle with sides 1, 1, 3 should be INVALID");
 }

 @Test
 public void testZeroLengthSides() {
     assertEquals(TriangleTypeChecker.TriangleType.INVALID, 
                  TriangleTypeChecker.getTriangleType(0, 0, 0), 
                  "Triangle with sides 0, 0, 0 should be INVALID");
 }

 @Test
 public void testNegativeLengthSides() {
     assertEquals(TriangleTypeChecker.TriangleType.INVALID, 
                  TriangleTypeChecker.getTriangleType(-1, 2, 2), 
                  "Triangle with sides -1, 2, 2 should be INVALID");
 }
 
}