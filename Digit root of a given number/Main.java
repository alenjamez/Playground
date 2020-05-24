#include <iostream>
using namespace std;
int num(int);
int main()
{
    int base;
    cin >> base;
    cout<<num(base);
    return 0;
}

int num(int n)
{
  int sum=0;
  while(n>0){
  sum += n % 10;
  n /= 10;
  }
  if(sum>9){
   sum=num(sum);
  }
  return sum;
}