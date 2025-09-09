import java.io.*;
class Ascending{
    public static void main(String args[]) throws IOException {
        DataInputStream obj = new DataInputStream(System.in);
        System.out.println("Enter the limit");
        int limit = Integer.parseInt(obj.readLine());
        String str[] = new String[limit];
        System.out.println("Enter your name");
        for (int i=0;i<limit;i++){
            str[i]=obj.readLine().toUpperCase();
        }
        for(int i=0;i<limit-1;i++){
            for(int j=i+1;j<limit;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("Ascending order: ");
        for(int i=0;i<limit;i++){
            System.out.println(str[i]);
        }
    }
}