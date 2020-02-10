void main(){

  int sumOfTwoValues = addTwoValues(10, 20);
  print("The sum of two values: $sumOfTwoValues");
  multiplyingTwoNumbers(10, 20);
  print(dividingTwoNumbers(20, 10));
}
// short hand syntax
void multiplyingTwoNumbers(int first, int second) => print("The multiplication: ${first * second}");
// in fat arrow method declaration we cannot use return statement
// use just an expression like above or below
double dividingTwoNumbers(int first, int second) => first / second;

int addTwoValues(int first, int second){
  int addition = first + second;
  return addition;
}
/*
we can make any parameter optional with help of []
for named parameters we use {} and here sequence does not matter
optional default parameters: {int first = 10, int second = 20}
 */
