#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  for(i=1;i<=4;i++)
  {
    for(j=1;j<=i;j++)
    {
      cout<<n;
    }
    cout<<"\n";
    n=n+1;
  }
  n=n-1;
  for(i=4;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      cout<<n;
    }
    cout<<"\n";
    n=n-1;
  }
}