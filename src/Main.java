import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Employee employee= new Employee("Cica",45);
		System.out.println(employee);
		
		Employee[] employeeArray= new Employee[5];
		
		Scanner scanner= new Scanner(System.in);
		for(int i=0; i<employeeArray.length;i++)
		{
			System.out.println("Name: ");
			String name=scanner.next();
			System.out.println("Age: ");
			int age=scanner.nextInt();
			employeeArray[i]= new Employee(name, age);
			System.out.println(employeeArray[i]);
		}
		
		
		for(int i=0; i<employeeArray.length; i++)
		{
			System.out.println(employeeArray[i]);
		}
		
	
		
		Employee.setPensionRemainingAge(75);
		
		
		for(int i=0; i<employeeArray.length; i++)
		{
			if(employeeArray[i].getAge()<75 && employeeArray[i].getAge()>70)
			{
				System.out.println(employeeArray[i]);
			}
		}
		

		for(int i=0; i<employeeArray.length; i++)
		{
			int max=i;
			for(int j=i+1; j<employeeArray.length; j++)
			{
				if(employeeArray[max].getRemainingyYearsUntilPansion()<employeeArray[j].getRemainingyYearsUntilPansion())
				{
					max=j;
				}
			}
			Employee tempEmployee= new Employee(employeeArray[i].getEmployeeName(), employeeArray[i].getAge());
			employeeArray[i]=new Employee(employeeArray[max].getEmployeeName(), employeeArray[max].getAge());
			employeeArray[max]=new Employee(tempEmployee.getEmployeeName(), tempEmployee.getAge());		
		}
		
		
		
		for(int i=5; 5>0; i--)
		{
			System.out.println(employeeArray[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
