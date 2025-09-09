import java.io.*;
class Palindrome{
    public static void main(String args[]) throws IOException {
        System.out.println("Enter a string");
        DataInputStream obj=new DataInputStream(System.in);
        String str=obj.readLine().toUpperCase();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str+" is Palindrome");
        }
        else{
            System.out.println(str+" is not a Palindrome");
        }
    }
}