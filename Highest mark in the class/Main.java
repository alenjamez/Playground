#include<iostream>
using namespace std;
int main()
{
  int i=0,n,high=0;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
    if(arr[i]>high)
    {
      high=arr[i];
    }
  }
  cout<<high;
}