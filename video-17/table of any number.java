  import java.util.*;
  
  public class Main{
       public static void main (String[] args) {
           Scanner sc = new Scanner(System.in);
           int i;
            System.out.println("enter number of table");
            int n= sc.nextInt();
            for(i=1; i<=10; i++){
                System.out.println(n+"*"+i+"="+n*i);
            }
           
       }
  }
