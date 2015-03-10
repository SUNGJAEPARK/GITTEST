package Chapter7.modifier;

public class TimeTest {	
	
	public static void main(String[] args) {

		Time time = new Time();
		TimeTest1 time1 = new TimeTest1();	
		time.setHour(23);
		//time.hour = 23;
		System.out.println(time.getHour());	
		System.out.println(time1.aa(time));

	}

}
