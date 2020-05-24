#include<iostream>
using namespace std;
int main()
{
  int n,i,s=11,t;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    t=s*s;
    cout<<t<<" ";
    s=s+4;
  }
}