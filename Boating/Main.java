#include<iostream>
using namespace std;
int main()
{
  int a,b,c,w;
  cin>>a>>b>>c;
  w=b*75+c*30;
  if(w<a){
    cout<<"Boat is stable";
  }
  else{
    cout<<"Boat will drow";
  }
}