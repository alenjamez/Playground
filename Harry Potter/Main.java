#include<iostream>
using namespace std;
int main()
{
 int x,a,b;
  std::cin>>x;
  a=x%10;
  b=x/1000;
  x=a+b;
  std::cout<<x;
}