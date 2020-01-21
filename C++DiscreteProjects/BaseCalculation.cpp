/*
 * Creating a base calculator with the help of switch-case logic
 */

#include <iostream>
#include <string>
#include <cmath>
#include <cstdlib>
#include <sstream>
#include <numeric>
#include <string>
#include <vector>
#include <cstddef>
#include <limits>

int main(){
    
    std::cout << "Enter a number: " << "\n";
    int left = 0;
    std::cin >> left;
    std::cout << "Enter another number: " << "\n";
    int right = 0;
    std::cin >> right;
    std::cout << "Enter any arithmetic operator like +, -, * and / for " 
            << "addition, subtraction, multiplication and division respectively:: " << "\n";
    char arithmeticOperator;
    std::cin >> arithmeticOperator;    
    
    int result = 0;
    
    switch(arithmeticOperator){
        case '+':
            result = left + right;
            break;
        case '-':
            result = left - right;
            break;
        case '*':
            result = left * right;
            break;
        case '/':
            if(right != 0){
                result = left / right;
            } else {
                std::cout << "The denominator is zero. The value is undefined." << "\n";
                return 1;
            }
            break;
        default:
            std::cout << arithmeticOperator << " is not recognized." << "\n";
            return 1;
            
    }
    std::cout << left << " " << arithmeticOperator << " " << right << " = " 
                    << result << "\n" ;
    
    return 0;
}




