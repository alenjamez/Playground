#include<iostream>
using namespace std;
int main()
{
  int a,b;
  float c;
  cin>>a>>b>>c;
  float d=a*b;
  if(d>c)
  {
    cout<<"Can reach";
  }
  else
  {
    cout<<"Cannot reach";
  }
}