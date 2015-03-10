package Chapter7.Extend.Tv;

public class TvCaption extends TvRemote {
		
	void captionView(String text){
		
		if(power){
			System.out.println(text);
		}
		
	}

}


