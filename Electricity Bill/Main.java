#include<iostream>
using namespace std;
int main()
{
  int u,t;
  cin>>u;
  if(u<=200)
  {
    t=u*0.5;
  }
  else if(u<=400)
  {
    t=u*0.65+100;
  }
  else if(u<=600)
  {
    t=u*0.80+200;
  }
  else{
    t=u*1.25+425;
  }
  cout<<"Rs."<<t;
}