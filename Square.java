import java.io.*;
class Square{
    public static void main(String args[]){
        if (args.length!=0){
            int num=Integer.parseInt(args[0]);
            int square=num*num;
            System.out.println("Square = "+square);
        }
        else{
            System.out.println("Please provide number in command line");
        }
    }
}
