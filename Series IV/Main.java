#include<iostream>
using namespace std;
int main()
{
  int n,s;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2==0)
    {
      s=(i*i)-2;
      cout<<s<<" ";
    }
    else
    {
      s=(i*i)-1;
      cout<<s<<" ";
    }
  } 
}