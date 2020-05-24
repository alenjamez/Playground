#include<iostream>
using namespace std;
int mul(int,int,int);
int main()
{
  int a,b,c,d;
  cin>>a>>b>>c;
  d=mul(a,b,c);
  if(d<=50)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else{
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}
int mul(int x,int y,int z)
{
  int m=x*y*z;
  return m;
}