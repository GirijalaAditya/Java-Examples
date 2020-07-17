import java.util.*;
import java.io.*;
class Employee
{
            int emp_id;
            String emp_name;
            float basic_salary;
            float hra,da,gross_sal;
            Employee(int a,String name,float sal)
            {
                      emp_id=a;
                      emp_name=name;
                      basic_salary=sal;
            }
            void calcsal()
             {
                       da=basic_salary*35/100;
	 hra=basic_salary*20/100;
	 gross_sal=basic_salary+da+hra;
              }
             void display()
             {
                       System.out.println("Employee id= "+emp_id);
	 System.out.println("Employee Name="+emp_name);
                      System.out.println("Gross Salary of Employee="+gross_sal);
              }
}
class EmployeeDemo
{
	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		Employee e[]=new Employee[5];
		System.out.println("Enter count of employee:");
		n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Employee Id: ");
			 int a=s.nextInt();
			System.out.println("Enter Employee Name: ");
			String name=s.next();
			System.out.println("Enter Basic Salary: ");
			float sal=s.nextFloat();
			e[i]=new Employee(a,name,sal);
			e[i].calcsal();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("\n\n");
			System.out.println("Employee " +(i+1)+  "\n Salary Details: ");
			e[i].display();
		}
                        }
}

  
                           
				
	