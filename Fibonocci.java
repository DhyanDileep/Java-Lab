import java.io.*;
 class Fib{
 	public static void main(String[] args) throws IOException{
		System.out.println("Enter limit");
		DataInputStream dis=new DataInputStream(System.in);
		int n=Integer.parseInt(dis.readLine());
		int a=0,b=1,sum;
		for(int i=0;i<=n;i++){
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
		}	
  	}
 }
