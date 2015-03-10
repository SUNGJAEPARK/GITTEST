package Chapter4;

public class switch_test {
	
	public static void main(String[] agrs){
		
		int score = (int)(Math.random()*10)+1;
		
		
		
		System.out.println(score);
		
		switch(score*100){		
		
		
		
		    case 100 :
				
				System.out.println("aaa");
			
//				break;
				
			case 200 :
				
				System.out.println("bbb");
			
//				break;
				
			case 300 :
		
				System.out.println("ccc");
			
			default :
				
				System.out.println("해당사항없음");

//	break;
		
		
		}
	}

}
