#include<iostream>
using namespace std;
int main()
{
  int m,n,i,j,sum;
  cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++){
    for(j=0;j<n;j++){
     cin>>a[i][j];
    }
  }
   for(i=0;i<m;i++){
     sum=0;
    for(j=0;j<n;j++){
       sum=sum+a[i][j];
    }
      cout<<sum<<"\n";
  }
}