#include<iostream>
using namespace std;
int printresult(int*,int,int);
int main()
{
int n,c,i;
std::cin>>n;
std::cin>>c;
int arr[n];
for(i=0;i<n;i++)
{
std::cin>>arr[i];
}
  printresult(arr,n,c);
}
int printresult(int*p,int n,int c){
  int i,sum=0;
for(i=0;i<n;i++)
{
sum=sum+p[i];
}
if(sum<=c)
{
std::cout<<"YES";
}
else
{
std::cout<<"NO";
}
}