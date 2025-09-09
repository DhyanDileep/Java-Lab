import java.io.*;
class Matrix
{
    public static void main(String args[])throws IOException
    {
        DataInputStream obj = new DataInputStream(System.in);
        System.out.print("Enter the number of rows and column of first array: ");
        int row1 = Integer.parseInt(obj.readLine());
        int col1 = Integer.parseInt(obj.readLine());
        System.out.print("Enter the number of rows and column of second array: ");
        int row2 = Integer.parseInt(obj.readLine());
        int col2 = Integer.parseInt(obj.readLine());
        int array1[][] = new int[row1][col1];
        int array2[][] = new int[row2][col2];
        int i,j,k;
        if(col1 == row2)
        {
            System.out.println("Enter the elements in array1.");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col1;j++)
                {
                    System.out.print("Array1["+i+"]["+j+"] : ");
                    array1[i][j] = Integer.parseInt(obj.readLine());
                }
            }
            System.out.println("Enter the elements in array2.");
            for(i=0;i<row2;i++)
            {
                for(j=0;j<col2;j++)
                {
                    System.out.print("Array2["+i+"]["+j+"] : ");
                    array2[i][j] = Integer.parseInt(obj.readLine());
                }
            }
            int result_array[][] = new int[row1][col2];
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    for(k=0;k<col1;k++)
                    {
                        result_array[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }
            System.out.println("Resultant Matrix.");
            for(i=0;i<row1;i++)
            {
                for(j=0;j<col2;j++)
                {
                    System.out.print(result_array[i][j]+" ");
                }
                System.out.println();
            }

        }
        else
        {
            System.out.println("Matrix multiplication not possible. Columns of first must equal rows of second.");
        } 
    }
}