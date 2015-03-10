public class test1 {

public static void main(String[] agrs){

    String beauty = "아름다운밤이예요";
    String ugly = "추악한방입니다";    
    
    int score = (int)(Math.random()*10)+1;
//    int score = 5;
	
        
	System.out.println("뽑기테스트를시작합니다.");
	System.out.println("당신의점수"+" "+score);
	
	if(score>=5){
	
		System.out.println(beauty);
				
	}else{
		System.out.println(ugly);
	}
	
}	
}
