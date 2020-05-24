#include<iostream>
using namespace std;
int main()
{
  int n,n1=0,n2=1,nxt;
  cin>>n;
  for(int i=1;i<n;i++)
  {
    if(i==1){
      nxt=n1;
    }
    if(i==2){
      nxt=n2;
    }
    nxt=n1+n2;
    n2=n1;
    n1=nxt;
  }
  cout<<nxt;
}