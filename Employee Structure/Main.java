#include<iostream>
using namespace std;
struct emp{
  char name[30];
  int id;
  int age;
  char dest[20];
  int salary;
};
int main()
{
  struct emp e;
  cout<<"Enter name:";
  cin>>e.name;
  cout<<"\nEnter ID:";
  cin>>e.id;
  cout<<"\nEnter age:";
   cin>>e.age;
  cout<<"\nEnter designation:";
  cin>>e.dest;
  cout<<"\nEnter Salary:";
  cin>>e.salary;
  cout<<"\nEmployee Details \n";
   cout<<"Name of the Employee : "<<e.name;
  cout<<"\nID of the Employee : "<<e.id;
  cout<<"\nAge of the Employee : "<<e.age;
  cout<<"\nDesignation of the Employee : "<<e.dest;
  cout<<"\nSalary of the Employee : "<<e.salary;
}