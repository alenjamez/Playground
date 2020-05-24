#include<iostream>
using namespace std;
int main()
{
  int n,c;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(n%i==0)
    {
      c=c+1;
    }
  }
  if(c==2)
  {
    cout<<"Eligible";
  }
  else
  {
    cout<<"Not eligible";
  }
}