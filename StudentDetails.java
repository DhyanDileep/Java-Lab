import java.io.*;
class Student{
	String usn;
	String name;
	String branch;
	String phone;
	float percentage;
	
	Student(String usn, String name, String branch, String phone, float percentage){
		this.usn=usn;
		this.name=name;
		this.branch=branch;
		this.phone=phone;
		this.percentage=percentage;
	}
	
	void display(){
		System.out.println("USN: "+usn);
		System.out.println("NAME: "+name);
		System.out.println("BRANCH: "+branch);
		System.out.println("BRANCH: "+branch);
		System.out.println("PERCENTAGE: "+percentage);
	}
}

class StudentDetails{
	public static void main(String args[])throws IOException{
		DataInputStream obj=new DataInputStream(System.in);
		System.out.println("Enter number of students");
		int n=Integer.parseInt(obj.readLine());
		Student[] student=new Student[n];
		System.out.println("Enter the details of students");
		for(int i=0;i<n;i++){
			System.out.println("USN: ");
			String usn=obj.readLine();
			
			System.out.println("NAME: ");
			String name=obj.readLine();
			
			System.out.println("BRANCH: ");
			String branch=obj.readLine();
			
			System.out.println("PHONE: ");
			String phone=obj.readLine();
			
			System.out.println("PERCENTAGE: ");
			float percentage=Float.parseFloat(obj.readLine());
			
			student[i]=new Student(usn, name, branch, phone, percentage);
		} 
		
		System.out.println("Student details: ");
		for(int i=0;i<n;i++){
			System.out.println("Student: ");
			student[i].display();
		}
	}
}
