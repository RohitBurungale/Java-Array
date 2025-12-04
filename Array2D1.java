import java.util.*;

public class Array2D1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the Array size :");
        int row=sc.nextInt();
        int cols=sc.nextInt();

        int number[][]=new int [row][cols];

       System.out.println(" enter the Array element :");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<cols;j++)
                    {
                        number[i][j]=sc.nextInt();
                    }
            }
            System.out.println(".(enetr the which element idex are the finding::)");
            int x=sc.nextInt();

            for(int i=0;i<row;i++){
                for (int j=0;j<cols;j++)
                {
                    if( number[i][j]==x)
                    {
                        System.out.print("there row index is the::"+i+"   and"+"there element column index is the::"+j);
                    } 
                }
            }


        
    }
}
