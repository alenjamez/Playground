#include<iostream>
using namespace std;
int main()
{
    int i,j,r,c;
  cin>>r>>c;
  int arr[r][c];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      cin>>arr[i][j];
    }
  }
  for(j=0;j<c;j++){
    for(i=0;i<r;i++){
      cout<<arr[i][j]<<" ";
    }
    cout<<"\n";
  }  
}