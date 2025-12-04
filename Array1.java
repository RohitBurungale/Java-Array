//write a java program to print array elements.

import java.util.*;

class Array1 {
    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("The marks entered are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        

    
}
}