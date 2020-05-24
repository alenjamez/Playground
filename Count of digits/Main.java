#include<iostream>
int main()
{
  int n,c;
  std::cin>>n;
  do{
    n=n/10;
    c=c+1;
  }
  while(n!=0);
  std::cout<<c;
}