import java.util.*;
 
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
	    System.out.println("enter number for table");
	     int n= sc.nextInt();
	     
	     for(int i=1; i<=10; i++){
	         System.out.println(n +"*" +i + "=" +n*i);
	     }
		
	}
}
