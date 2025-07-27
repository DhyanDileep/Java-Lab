import java.io.*;
class Product{
    public static void main(String arg[]) throws IOException {
        System.out.println("Enter two numbers");
        DataInputStream obj=new DataInputStream(System.in);
        int a=Integer.parseInt(obj.readLine());
        int b=Integer.parseInt(obj.readLine());
        int product=a*b;
        System.out.println("Product = "+product);
    }
}
