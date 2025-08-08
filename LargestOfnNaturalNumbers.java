import java.io.*;
class LargestOfnNaturalNumbers{
	public static void main(String args[]) throws IOException {
		DataInputStream obj=new DataInputStream(System.in);
		System.out.println("Enter value of N");
		int n= Integer.parseInt(obj.readLine());
		int[] arr=new int[n];
		System.out.println("Enter natural numbers");
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(obj.readLine());
		}
		int max=arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}	
		}
		System.out.println("Largest number is "+max);
	}
}
