#include<iostream>
using namespace std;
int main()
{
  int n,i=1,s=6,t=5,c;
  cin>>n;
  do{
    cout<<s<<" ";
    s=s+t;
    t=t+5;
    i++;
  }
  while(i<=n);
}