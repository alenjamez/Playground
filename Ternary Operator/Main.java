#include<iostream>
#include<string>
using namespace std;
int main()
{
  int n;
  string b;
  std::cin>>n;
  b=n%2==0?"Even":"Odd";
  std::cout<<b;
}