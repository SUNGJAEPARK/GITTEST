package Chapter7.parameter;

import Chapter7.modifier.Time;

public class ParameterTest {
	
	//Time tm = new Time();
	
	public Time paramTest(Time tm){
		
		return tm;	
		
	}


	public static void main(String[] args) {

		Time tm = new Time();
		
		System.out.println(tm);

	}

}
