package ListInterface;

import java.util.*;
import java.util.ArrayList;


public class Employee {
	public int id, salary;
	public String name;
	
	public Employee(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee(1,"Amey",20000));
		emp.add(new Employee(2,"Rahul",15000));
		emp.add(new Employee(3,"Ghanshyam",30000));
		emp.add(new Employee(4,"Abhishek",45000));
		emp.add(new Employee(5,"Hitesh",35000));
		
		for(Employee e: emp) {
			System.out.println("ID:" + e.getId() + "\tName:" + e.getName() + "\tSalary:" + e.getSalary());
		}
		System.out.println("Enter ID of the Employee which you want to remove=");
		Scanner sc = new Scanner(System.in);
		
		int empId = sc.nextInt();
		emp.remove(empId-1);
		
		System.out.println("Updated Array List");
		
		for(Employee e: emp) {
			System.out.println("ID:" + e.getId() + "\tName:" + e.getName() + "\tSalary:" + e.getSalary());
		}
	}
}

