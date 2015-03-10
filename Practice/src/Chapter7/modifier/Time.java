package Chapter7.modifier;

public class Time {
	
	 int hour;
	 char bb;
	private int minute;
	private int second;
	
	public int getHour(){
		return hour;		
	}
	public void setHour(int hour){
		if(hour<0 || hour>23) return;
		this.hour = hour;
	}
}

class TimeTest1 {
	
	//Time tm = new Time();
	
	public float aa(Time tm){
		return (float)tm.hour;
		//return tm.bb;
	}
}
