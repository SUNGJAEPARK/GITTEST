package Chapter4;

public class ninexnine {

	public static void main(String[] agrs){
				
		for (int i = 2; i <=9; i++) {
			if(i==2){
				System.out.println("2단입니다");
				
			}else if(i==3){
				
				System.out.println("3단입니다");				
				
			}else{
				System.out.println("그외입니다");
			}
			
			for (int j = 1; j<=9; j++) {				
					System.out.println(i*j);								
			}
			
		}		
	}	
}
