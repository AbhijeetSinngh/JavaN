package question1;
import java.util.*;
//2. Circle -- x,y,radius
//Concrete overriding Method --public double area() : ret area of circle
//public String toString() : ret x, y & radius
public class circle extends shape {
     private int r;
     circle(int x,int y,int r){
    	 super(x,y);
    	 this.r=r;
     }
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*r*r;
	}
	public String toString() {
		return x+" "+y+" "+r;
	}

	
}