#include<iostream>
using namespace std;
int main()
{
  int a=1;
  float b=2.0;
  char c='a';
  double d=6;
  std::cout<<sizeof(c);
  std::cout<<"\n"<<sizeof(a);
  std::cout<<"\n"<<sizeof(b);
  std::cout<<"\n"<<sizeof(d);
}