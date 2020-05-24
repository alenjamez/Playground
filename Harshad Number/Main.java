#include<iostream>
using namespace std;
int main()
{
  int num,n,temp,s=0;
  cin>>num;
  temp=num;
  while(num!=0)
  {
    n=num%10;
    s=s+n;
    num=num/10;
  }
  if(temp%s==0)
  {
    cout<<"Harshad Number";
  }
  else{
    cout<<"Not Harshad Number";
  }
}