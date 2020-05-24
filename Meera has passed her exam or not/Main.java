#include<iostream>
using namespace std;
int main()
{
  int i,n,key,f=0;
  cin>>n;
  int arr[n];
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cin>>key;
  for(i=0;i<n;i++)
  {
    if(key==arr[i])
    {
      f=1;
     break;
    }
  }  
  if(f==1)
  {
    cout<<"She passed her exam";
  }
  else{
    cout<<"She failed";
  }
}