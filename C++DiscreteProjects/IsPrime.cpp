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

using namespace std;

class IsPrime {
    
public:
    bool isPrime = true;
    
    void findingPrime(){
        for(int i = 2; i <= 20; i++){
            isPrime = true;
            if(i % i == 0){
                i += i;
                std::cout << i << "\n";
                isPrime = false;
            }
            if(isPrime){
                std::cout << i << "\n";
            }
        }
    }

};
/*
 IsPrime firstObject;
    
    firstObject.findingPrime ();
 
*/

int main(int argc, char** argv) {
    
    int arr[] = {10, 7, 8, 9, 1, 5}; 
    std::cout << sizeof(arr) << "\n";
    std::cout << sizeof(arr[0]) << "\n";
    int n = sizeof(arr) / sizeof(arr[0]); 
    std::cout << n << "\n";

    return 0;
} 

