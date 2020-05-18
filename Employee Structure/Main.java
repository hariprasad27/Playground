#include<iostream>
using namespace std;
struct emp
{
  char name[50],des[50];
  int id,age,sal;
};
int main()
{int n;
  emp e;
 cout<<"Enter name:";
 cin.get(e.name,50);
 cout<<"\nEnter ID:";
 cin>>e.id;
 cout<<"\nEnter age:";
 cin>>e.age;
 cout<<"\nEnter designation:";
 cin>>e.des;
 cout<<"\nEnter Salary:";
 cin>>e.sal;
 cout<<"\nEmployee Details\nName of the Employee : "<<e.name;
 cout<<"\nID of the Employee : "<<e.id;
 cout<<"\nAge of the Employee : "<<e.age;
 cout<<"\nDesignation of the Employee : "<<e.des;
 cout<<"\nSalary of the Employee : "<<e.sal;
 
  //Type your code here.
}