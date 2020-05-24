#include<iostream>
using namespace std;
int main()
{
  int n,even=0,odd=0;
  cin>>n;
  int num[n];
  for(int i=0;i<n;i++){
    cin>>num[i];
    if(num[i]%2==0)
    {
      even=even+num[i];
    }
    else{
      odd=odd+num[i];
    }
  }
  cout<<"The sum of the even numbers in the array is "<<even;
  cout<<"\nThe sum of the odd numbers in the array is "<<odd;
}