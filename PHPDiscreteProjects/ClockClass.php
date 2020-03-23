<?php

class ClockClass {
    
    public function clockwiseRotatebyOne(&$theDigitalClock, $numberOfHours) { 
	$temp = $theDigitalClock[0]; 
        for ($i = 0; $i < $numberOfHours - 1; $i++){
            $theDigitalClock[$i] = $theDigitalClock[$i + 1]; 
        } 
	$theDigitalClock[$i] = $temp;
    } 


    public function clockwiseRotate(&$theDigitalClock, $afterThreeHours, $numberOfHours) { 
        for ($i = 0; $i < $afterThreeHours; $i++){
            $this->clockwiseRotatebyOne($theDigitalClock, $numberOfHours); 
        }		
    } 

/* utility function to print 
an array */
    public function displayHour(&$theDigitalClock, $numberOfHours) { 
        for ($i = 0; $i < $numberOfHours; $i++){
            if($i == 0){
                echo "<strong>" . $theDigitalClock[$i] . "</strong>";                
            } else {
                echo " " . $theDigitalClock[$i] . " ";                  
            }                        
        }        
    }
}

$theDigitalClock = array( 12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 ); 
$numberOfHours = sizeof($theDigitalClock);
$afterFewHours = 4;

echo 'The number of hours shown on the clock before it starts :';
echo '<pre>';
print_r($theDigitalClock);
echo '</pre>';
echo '<br>';

$clock = new ClockClass();
echo "After {$afterFewHours} hours the clock shows the exact time at the starting point : ";
echo '<br>';
echo "It rotates clockwise shifting the first {$afterFewHours} elements at the last : ";
echo '<br>';
echo '<br>';
$clock->clockwiseRotate($theDigitalClock, $afterFewHours, $numberOfHours);
$clock->displayHour($theDigitalClock, $numberOfHours);
