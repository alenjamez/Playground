#include <iostream>
using namespace std;
int calculatePower(int, int);
int main()
{
    int base, powerRaised, result;
    cin >> base;
    cin >> powerRaised;
    result = calculatePower(base, powerRaised);
    cout<<"Enter the value of a";
    cout<<"\nEnter the value of n"; 
    cout <<"\nThe value of "<<base<< " power " << powerRaised << " is " << result;
    return 0;
}

int calculatePower(int base, int powerRaised)
{
    if (powerRaised != 0)
        return (base*calculatePower(base, powerRaised-1));
    else
        return 1;
}