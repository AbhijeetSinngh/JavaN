package question1;
import java.util.*;

//1. Create abstract class Shape --state :  x,y 
//Abstract Method --public double area();
//public String toString() : to ret x & y
//
//Why will area() be abstract in Shape class ?????????
public abstract class shape {
    int x,y;
    shape(int x,int y){
    	this.x=x;
    	this.y=y;
    }
    public abstract double area();
    public String toString() {
    	return x+" "+y;
    }
}
