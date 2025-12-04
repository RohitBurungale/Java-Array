import java.util.*;
public class array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(".(enter the row and column:)");
        int rows=sc.nextInt();
        int column=sc.nextInt();
        

        System.out.println(".(eneter the Array elements)");

        int numbers[][]= new int [rows][column];
        //
        //input 
        for(int i=0;i<rows;i++)
          {
            for(int j=0;j<column;j++)
            {
                numbers[i][j]=sc.nextInt();
            
            }
          }
          System.out.println(".(your 2D Array element is )");
          //output 
          for(int i=0;i<rows;i++)
          {
            for(int j=0;j<column;j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
          }

    }
}
