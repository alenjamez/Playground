#include<iostream>
using namespace std;
int gcd(int,int);
int main()
{
  int n,c;
  cin>>n>>c;
  cout<<"G.C.D of "<<n<<" and "<<c<<" = "<<  gcd(n,c);
}
int gcd(int x,int y)
{
    if (y != 0)
        return gcd(y, x % y);
    else
        return x;
}