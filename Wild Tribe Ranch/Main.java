#include<iostream>
int main()
{
  int n,m;
  std::cin>>n>>m;
  if(n>m)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(n<m)
  {
    std::cout<<"Sorry, you can't enter";
  }
  else
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
}