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

int main(int argc, char** argv) {
    
    IsPrime firstObject;
    
    firstObject.findingPrime ();

    return 0;
} 

