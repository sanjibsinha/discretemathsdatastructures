<?php

/* 
 * how much probablity is there to find an element in a given array
 */

class ProbabilityClass {
    
    public function countNumberOfValuesInArray($theArray, $matchTheElement){
        $countNumbers = 0; 
        foreach ($theArray as $key => $value){ 
            if ($value == $matchTheElement){ 
                $countNumbers++;             
            }            
        }
        return $countNumbers;        
    }
    
}

$theProbable = new ProbabilityClass();

$theDice = [1, 2, 3, 4, 5, 6];
$theElement = 2;
$theLength = sizeof($theDice);
$totalNumbersOfValues = $theProbable->countNumberOfValuesInArray($theDice, $theElement);
$theProbability = (floatval($totalNumbersOfValues / $theLength));
echo "The probability is: " . $theProbability;