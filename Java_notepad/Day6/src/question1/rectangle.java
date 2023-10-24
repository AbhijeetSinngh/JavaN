package question1;

public class rectangle extends shape {
	
    private int l;
    private int b;
    rectangle(int x,int y,int l,int b){
    	super(x,y);
    	this.l=l;
    	this.b=b;
    }
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return l*b;
	}
	public String toString() {
		return x+" "+y+" "+l+" "+b;
	}

}
