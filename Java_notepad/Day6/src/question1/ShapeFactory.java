package question1;
import java.util.Scanner;
public class ShapeFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              shape s[]=new shape[10];
              int choice;
              int index=0;
              Scanner sc=new Scanner(System.in);
              do {
            	  //1:Show All 2:add Circle 3:add Rectangle  4:add Square
            	  System.out.println("1:Show All 2:add Circle 3:add Rectangle  4:add Square 5.Exit");
            	  choice =sc.nextInt();
            	  switch(choice) {
            	  case 1: System.out.println("1.Show all");
            	           for(int i=0;i<index;i++) {
            	        	   if(s[i] instanceof circle) {
            	        	       System.out.println(s[i]);
            	        	       System.out.println(s[i].area());
            	        	   }else if(s[i] instanceof rectangle) {
            	        	       System.out.println(s[i]);
            	        	       System.out.println(s[i].area());
            	        	   }else  if(s[i] instanceof square) {
            	        	       System.out.println(s[i]);
            	        	       System.out.println(s[i].area());
            	        	   }
            	           }
            	          break;
            	  case 2: System.out.println("Add Circle");
            	           System.out.println("Enter x,y and radius");
            	           s[index]=new circle(sc.nextInt(),sc.nextInt(),sc.nextInt());
            	           index++;
            	            break;
            	  case 3:System.out.println("Add Rectangle");
            	         System.out.println("Enter x,y ,length and breadth");
            	         s[index++]=new rectangle(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            	         break;
            	  case 4:System.out.println("Add Square");
            	         System.out.println("Enter x,y ,side");
            	          s[index++]=new square(sc.nextInt(),sc.nextInt(),sc.nextInt());
            	          break;
            	   default: System.out.println("Invalid Enter between 1 and 5");
            	            break;
            	  }
              }while(choice!=5);
	}

}
