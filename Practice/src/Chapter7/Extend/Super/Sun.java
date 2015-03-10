package Chapter7.Extend.Super;

public class Sun extends Father{

	Sun(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	int z;	
	
	void Point(int x, int y, int z){
		
		this.x = x;
		this.y = y;
		this.z = z;
		
		System.out.println(x+y+z);
		
	}
	
	public static void main (String[] agrs){
	
		int x = 1;
		
		int y =2;
		
		Sun s = new Sun( x,  y);
		
		s.Point(1,2,3);
		s.Print();
	}	
}
