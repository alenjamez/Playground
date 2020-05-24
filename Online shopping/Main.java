#include<iostream>
using namespace std;
int main()
{
  int fp,fd,fdc,ap,ad,adc,sp,sd,sdc,f,s,a;
  cin>>fp>>fd>>fdc>>sp>>sd>>sdc>>ap>>ad>>adc;
  fd=(fp*fd)/100;
  sd=(sp*sd)/100;
  ad=(ap*ad)/100;
  f=fp+fdc-fd;
  s=sp+sdc-sd;
  a=ap+adc-ad;
  cout<<"In Flipkart Rs."<<f<<"\nIn Snapdeal Rs."<<s<<"\nIn Amazon Rs."<<a;
  if(f<=s &&f<=a)
  {
    cout<<"\nHe will prefer Flipkart";
  }
  else if(s<=f && s<=a)
  {
    cout<<"\nHe will prefer Snapdeal";
  }
  else{
    cout<<"\nHe will prefer Amazon";
  }
}