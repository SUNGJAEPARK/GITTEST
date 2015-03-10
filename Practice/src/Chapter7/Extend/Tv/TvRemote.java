package Chapter7.Extend.Tv;

public class TvRemote {
	
	boolean power;
	int channel = 10;
	
	void power(){
		if(power){
			power = !power;	
		}else{
			power = !power;
		}
				
	}
	void channelDown(){
		channel = --channel;
	}
	void channelUp(){
		channel = ++channel;
	}	

}


class aa{
	
}