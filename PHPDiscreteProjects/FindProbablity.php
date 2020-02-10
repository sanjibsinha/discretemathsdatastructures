<?php

class Dice{
    
    public $sidesOfDice = [1, 2, 3, 4, 5, 6];
    
    // Probability = total number of the element present / size or length of the array.    
    public function throwDice($sidesOfDice, $totalSides) {
        $this->sidesOfDice = $sidesOfDice;
        $lengthOfDice = sizeof($sidesOfDice);
        $theProbability = $totalSides / $lengthOfDice;
        return $theProbability;        
    }
}

class TotalSides{
    
    public function getSide($sidesOfDice, $theSide) {
        $count = 0;
        foreach ($sidesOfDice as $value) {
            if($value == $theSide){
                $count++;
            }
        }
        return $count;
    }
}

$numberOfSides = new TotalSides();
$theProbability = new Dice();
echo "The probability of getting 2 when you throw the dice is: " . $theProbability->throwDice($theProbability->sidesOfDice, 
        $numberOfSides->getSide($theProbability->sidesOfDice, 2));


