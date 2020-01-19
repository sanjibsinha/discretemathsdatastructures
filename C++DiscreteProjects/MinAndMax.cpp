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

int main(int argc, char** argv) {
    
    std::cout << "Minimum bool value " << std::numeric_limits<bool>::min() << "\n";
    std::cout << "Maximum bool value " << std::numeric_limits<bool>::max() << "\n";
    
    std::cout << "Minimum unsigned short int value " << 
            std::numeric_limits<unsigned short int>::min() << "\n";
    std::cout << "Maximum unsigned short int value " << 
            std::numeric_limits<unsigned short int
            >::max() << "\n";    
        
    std::cout << "Minimum short int value " << 
            std::numeric_limits<short int>::min() << "\n";
    std::cout << "Maximum short int value " << 
            std::numeric_limits<short int
            >::max() << "\n";
    
    std::cout << "Minimum unsigned int value " << 
            std::numeric_limits<unsigned int>::min() << "\n";
    std::cout << "Maximum unsigned int value " << 
            std::numeric_limits<unsigned int
            >::max() << "\n";   
 
    std::cout << "Minimum int value " << std::numeric_limits<int>::min() << "\n";
    std::cout << "Maximum int value " << std::numeric_limits<int>::max() << "\n";
 
    std::cout << "Minimum long value " << std::numeric_limits<long int>::min() << "\n";
    std::cout << "Maximum long value " << std::numeric_limits<long int>::max() << "\n";
 
    std::cout << "Minimum float value " << 
            std::numeric_limits<float>::min() << "\n";
    std::cout << "Maximum float value " << 
            std::numeric_limits<float>::max() << "\n";
    
    std::cout << "Minimum long double value " << 
            std::numeric_limits<long double>::min() << "\n";
    std::cout << "Maximum long double value " << 
            std::numeric_limits<long double>::max() << "\n";
     

    return 0;
}
