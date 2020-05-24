#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
int main()
{
char str[50];
  int count=0;
gets(str);
for(int i=0;i<50;i++)
{
  if(str[i]=='\0')
  {
    break;
  }
  count=count+1;
}
cout <<"The number of letters in the name is "<<count;
}