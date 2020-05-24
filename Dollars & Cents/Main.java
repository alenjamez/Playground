#include<iostream>
using namespace std;
int main()
{
  int fd,fc,sd,sc,td,tc;
  cin>>fd>>fc>>sd>>sc;
  tc=fc+sc;
  td=fd+sd;
  if(tc>=100)
  {
    td=td+1;
    tc=tc-100;
  }
  cout<<td<<"\n"<<tc;
}