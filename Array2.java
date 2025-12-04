import java.util.*;
public class Array2 {
    public static void main (String []args)
    {   
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the array size");
        int size=sc.nextInt();


        System.out.println("enter the array elements");
        int numbers[]=new int [size];

        
        for (int i=0; i<size; i++)
        {
            numbers[i]=sc.nextInt();
            
        }
        System.out.println("enter index  :-");
        int x=sc.nextInt();

        for (int i=0; i<numbers.length; i++)
        {
            if (numbers[i]==x){
                System.out.println("your element is the :"+i);
            }else{
                System.out.println("wrong index are used");
            }
        }
    }
    
}
