<?php

/* 
 * not (a or b) is the same as (not a) and (not b)
 */

class DeMorganOne {
    
    public $numOne;
    public $numTwo;
    
    public function notAandB($paramOne, $paramTwo) {
        
        $this->numOne = $paramOne;
        $this->numTwo = $paramTwo;
        $additionOfTwoNumbers = $paramOne + $paramTwo;
        
        //not(paramOne and paramTwo)
        if(!($paramOne >= 10 || $paramTwo <= 15)){
            echo "Addition of two numbers : $additionOfTwoNumbers";
        } else {
            echo "The number is neither less than equal to 10 nor greater than equal to 15";
        }
    }
    
    public function notAORnotB($paramOne, $paramTwo) {
        
        $this->numOne = $paramOne;
        $this->numTwo = $paramTwo;
        $additionOfTwoNumbers = $paramOne + $paramTwo;
        
        //(not paramOne) or (not paramTwo)
        if(!($paramOne >= 10) && !($paramTwo <= 15)){
            echo "Addition of two numbers : $additionOfTwoNumbers";
        } else {
            echo "The number is neither less than equal to 10 nor greater than equal to 15";
        }
    }
}

$firstCase = new DeMorganOne();
$secondCase = new DeMorganOne();

$firstCase->notAandB(11, 14); 
echo '<br>';
$firstCase->notAandB(1, 140); 
echo '<br>';
$secondCase->notAORnotB(11, 14);
echo '<br>';
$secondCase->notAORnotB(1, 140); 

/*
 * The number is neither less than equal to 10 nor greater than equal to 15
Addition of two numbers : 141
The number is neither less than equal to 10 nor greater than equal to 15
Addition of two numbers : 141
 */