<?php

/* 
 * They have similarities and differences
 * Set theory of Discrete mathematics and PHP has many similarities
 * Both represent data sets
   Both hold a list of similar elements
   We can operate on both by performing union, intersection etc
 */
 
// consider two separate arrays
 
$arrayOne = [11, 12, 13];
$arrayTwo = [11, 12, 13, 14, 15];

// consider one universal array that contain elements of both arrays 

$universalArray = [11, 12, 13, 14, 15, 16, 17, 18, 19, 20];

/*
 * According to the set theory, the union occurs as
 * $arrayOne + $arrayTwo
 * the output omits the common value
 * we can do the same using PHP
 */

$unionOfTwoArrays = $arrayOne + $arrayTwo;

echo "Union of two arrays : [" . implode(", ", $unionOfTwoArrays) . "]<br>";

/*
 * We can do the difference operation using the same technique
 * we can use the PHP default methods
 */

$differenceOfTwoArrays = array_diff($arrayTwo, $arrayOne);

echo "Difference of two arrays : [" . implode(", ", $differenceOfTwoArrays) . "]<br>";


/*
 * We can do the intersection operation using the same technique
 * it keeps the same elements
 * we can use the PHP default methods
 */

$intersectionOfTwoArrays = array_intersect($arrayOne, $arrayTwo);

echo "Intersection of two arrays : [" . implode(", ", $intersectionOfTwoArrays) . "]<br>";

/*
 * We can do the complement operation on two arrays
 * we can use the PHP default methods
 */

$arrayOneComplement = array_diff($universalArray, $arrayOne);

echo "Complement of arrayOne : [" . implode(", ", $arrayOneComplement) . "]<br>";

$arrayTwoComplement = array_diff($universalArray, $arrayTwo);

echo "Complement of arrayTwo : [" . implode(", ", $arrayTwoComplement) . "]<br>";