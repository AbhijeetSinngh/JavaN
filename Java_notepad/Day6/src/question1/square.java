package question1;

public class square extends shape{
	private int side;
	square(int x,int y,int side){
		super(x,y);
		this.side=side;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}
	public String toString() {
		return x+" "+y+" "+side;
	}
}
//someshdahotre
//totally-somesh