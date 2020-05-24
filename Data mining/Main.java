#include<iostream>
using namespace std;
int main()
{
  int num,e=0,o=0,n;
  cin>>num;
  while(num!=0)
  {
    n=num%10;
    if(n%2==0)
    {
      e=e+n;
    }
    else{
      o=o+n;
    }
    num=num/10;
  }
  if(e==o)
  {
    cout<<"Yes";
  }
  else{
    cout<<"No";
  }
}