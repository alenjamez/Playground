#include<iostream>
using namespace std;
int find(int a[20],int n)
{
  int e=0,o=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0){
      e=e+1;
    }
    else{
      o=o+1;
    }
  }
  if(e==n)
  {
    return 2;
  }
  else if(o==n){
    return 1;
  }
  else{
    return 0;
  }
}
int main()
{
  int n,f=0;
  cout<<"Enter the number of elements in the array";
  cin>>n;
  int a[n];
  cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++){
    cin>>a[i];
  }
  f=find(a,n);
  if(f==1){
    cout<<"\nThe array is Odd";
  }
  else if(f==2){
    cout<<"\nThe array is Even";
  }
  else{
    cout<<"\nThe array is Mixed";
  }
}
