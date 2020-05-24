#include<iostream>
using namespace std;
int main()
{
  int i,j,r,c;
  cin>>r>>c;
  int arr[r][c];
  int ar[r][c];
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      cin>>arr[i][j];
    }
  }
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      cin>>ar[i][j];
    }
  }
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      arr[i][j]=arr[i][j]+ar[i][j];
      cout<<arr[i][j]<<" ";
    }
    cout<<"\n";
  }
}