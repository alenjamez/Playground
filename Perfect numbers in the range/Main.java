#include<iostream>
using namespace std;
int main()
{
  int n,c,j,i,s;
  std::cin>>n>>c;
  for(j=n;j<=c;j++){
    i=1;
    s = 0;
    while(i<j){
      if(j%i==0){
           s=s+i;
      }
         i++;
    }
    	if(s==j){
        std::cout<<j<<" ";
      }
  }
}