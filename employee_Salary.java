//Write a program to print the name, salary and date of joining of 10 employees in a company. Use array of objects.

import java.util.Scanner;

public class employee_Salary {
    int empid;
    String empname;
    float empsalary;
    int empdate;
     public void getInput() 
     {        Scanner in = new Scanner(System.in);
        System.out.print("Enter the employee id :: ");
        empid = in.nextInt();
        System.out.print("Enter the employee name :: ");
        empname = in.next();
        System.out.println("Enter date of joining date ::");
        empdate = in.nextInt();
        System.out.print("Enter the employee salary :: ");
        empsalary = in.nextFloat();
     }
 
     public void display() 
     {
        System.out.println("Employee id = " + empid);
        System.out.println("Employee name = " + empname);
        System.out.println("Employee salary = " + empsalary);
        System.out.println("Employee date of joining = "+empdate);
     }
 
 public static void main(String[] args) {
 
  employee_Salary e[] = new employee_Salary[5];
  for(int i=0; i<10; i++) 
  { 
   e[i] = new employee_Salary();
   e[i].getInput();
  }
  System.out.println("**** Data Entered as below ****");
  for(int i=0; i<10; i++) 
  { 
   e[i].display();
  }
 }
}
