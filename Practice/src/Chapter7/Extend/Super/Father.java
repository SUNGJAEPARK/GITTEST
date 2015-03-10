package Chapter7.Extend.Super;

public class Father {

	int x;
	int y =1;
	

	
	Father(){
		
	}
	
	Father(int x, int y){	
	    this.x = x;
	    this.y = y;	
		
	}
	
	 void Print(){

		 this.y = 4;
		 this.y = 5;
	    	System.out.println("프린트결과물"+x+y);
	 }
	
}
