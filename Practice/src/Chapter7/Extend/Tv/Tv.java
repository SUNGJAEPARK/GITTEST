package Chapter7.Extend.Tv;

public class Tv extends TvCaption{	
		
	
	public static void main(String[] agrs){
				
		int channel =0 ;
		TvCaption ctv = new TvCaption();
		System.out.println(ctv.channel);
		ctv.channelDown();
		System.out.println(ctv.channel);
		ctv.channelUp();
		System.out.println(ctv.channel);
		ctv.power();
		//ctv.power = true;
		ctv.captionView("test");
	}
}




