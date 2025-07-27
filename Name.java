import java.io.*;
class Name{
    public static void main(String args[]){
        if (args.length!=0){
            String name=args[0];
            String surname=args[1];
            System.out.println("Welcome "+name+" "+surname);
        }
        else{
            System.out.println("Enter name and surname in command line");
        }
    }
}
