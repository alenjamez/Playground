#include<iostream>
using namespace std;
int main()
{
  int n,c,s=0,i=1;
  cin>>n>>c;
  n=n+c;
  c=n;
  while(i!=n)
    {
      if(n%i==0)
      {
        s=s+i;
      }i++;
  }
  if(s==c){
    cout<<"They can read the message";
  }
  else{
    cout<<"They can't read the message";
  }
}