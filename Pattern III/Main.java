#include <bits/stdc++.h> 
using namespace std; 
int main() 
{ 
    int j, k = 0,n;
    cin>>n;
    for (int i=1; i<=n; i++) 
    { 
        if (i%2 != 0) 
        { 
            for (j=k+1; j<k+i; j++) 
                cout << i << "*"; 
            cout << i << endl;      
            k = j;     
        }
        else
        { 
            k = k+i-1;
            for (j=k; j>k-i+1; j--) 
                cout << i << "*"; 
            cout << i << endl;     
        } 
    }
    for (int i=n; i>=1; i--) 
    { 
        if (i%2 != 0) 
        { 
            for (j=k+1; j<k+i; j++) 
                cout << i << "*"; 
            cout << i << endl;      
            k = j;     
        }
        else
        { 
            k = k+i-1;
            for (j=k; j>k-i+1; j--) 
                cout << i << "*"; 
            cout << i << endl;     
        } 
    } 
}