import java.io.*;
class Employee{
	String name;
	int basic;
	
	Employee(String name, int basic){
		this.name=name;
		this.basic=basic;
	}
	
	int calculateSalary(){
		return basic;
	}
}

class Manager extends Employee{
	int bonus;
	
	Manager(String name, int basic, int bonus){
	super(name,basic);
	this.bonus=bonus;
	}
	
	int calculateSalary(){
		return basic+bonus;
	}
}

class Programmer extends Employee{
	int extra;
	
	Programmer(String name, int basic, int extra){
	super(name,basic);
	this.extra=extra;
	}
	
	int calculateSalary(){
	return basic+extra;
	}
}

class Salary{
	public static void main(String args[]){
		Employee obj1 = new Manager("Abhishek",50000,1000);
		Employee obj2 = new Programmer("Adithyadev",50000,10000);
		System.out.println("Name: "+obj1.name+" Salary: "+obj1.calculateSalary());
		System.out.println("Name: "+obj2.name+" Salary: "+obj2.calculateSalary());
	}
}
