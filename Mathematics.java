import java.io.*;
class AddSub{
	int a,b;
	AddSub(int x, int y){
		a=x;
		b=y;
	}
	int add(){
		
		return a+b;
	}
		int sub(){
		return a-b;
	}
}

class MulDiv extends AddSub{
	int a,b;
	MulDiv(int x, int y){
		super(x,y);
	}
	int mul(){
		
		return super.a*super.b;
	}
		float div(){
			if (super.b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return super.a / super.b;
	}

}
class Mathematics{
	public static void main(String args[]){
		MulDiv obj = new MulDiv(20,4);
		System.out.println("Addition: "+obj.add());
		System.out.println("Subtraction: "+obj.sub());
		System.out.println("Multiplication: "+obj.mul());
		System.out.println("Division: "+obj.div());
	}
}
