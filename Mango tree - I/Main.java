#include<iostream>
using namespace std;
int main()
{
 int r,c,n;
 cin>>r>>c>>n;
 if(n<=c)
 {
   cout<<"Yes";
 }
  else if(n%r==1 || n%c==0)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}