#include<iostream>
using namespace std;
int main()
{
  int n,c,t;
  cin>>n;
  cout<<n;
  while(n!=1)
  {
    if(n%2==0)
    {
      n=n/2;
    }
    else{
      n=3*n+1;
    }
    t++;
    cout<<"\n"<<n;
  }
  cout<<"\n"<<t;
}