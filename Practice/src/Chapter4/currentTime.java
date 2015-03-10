package Chapter4;

public class currentTime extends timeCount{
	
	public static void main(String[] agrs){
	
	timeCount aa = new timeCount();	
		
	long start = System.currentTimeMillis();
	
	for(long i = 0; i<1000000000; i++){
		
	
		
	}
	
	long end = System.currentTimeMillis();
	
	System.out.println(start);
	System.out.println(end);
	
	System.out.println(end-start);
	
	
	}
}
