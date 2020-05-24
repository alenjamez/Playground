#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int m,s=0,t=0,c=n,d=n;
   while(d!=0)
    {
      t++;
      d=d/10;
    } 
  
    while(n!=0)
    {
      m=n%10;
      s=s+power(m,t);
      n=n/10;
    }
    if(c==s)
    {
        return 1;
    }
    else{
        return 0;
    }
      
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
} 