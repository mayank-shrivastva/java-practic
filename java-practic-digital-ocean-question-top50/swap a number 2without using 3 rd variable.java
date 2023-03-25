/* swap a number 2without using 3 rd variable*/
 import java.util.*;
 
 public class Main{
     public static void main (String[] args) {
         
         
         
         Scanner sc = new Scanner(System.in);
         System.out.println("enter a value");
            int a= sc.nextInt();
            System.out.println("enter a value b");
            int b= sc.nextInt();
         
        
        a= a+b;
         b= a-b;
        a = a-b;
        
        System.out.println("value is a:- " +a );
        System.out.println("value b :-"  +b);
        
     }
     
 }
