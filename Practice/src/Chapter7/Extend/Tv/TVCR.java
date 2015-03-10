package Chapter7.Extend.Tv;

class Tv1{
	
	void tvMethod(){
		
		System.out.println("tv메서드입니다dddd.");
		
	}
	
}

class VCR extends Tv1{
	
	void vcrMethod(){
		
		System.out.println("vcr메서드입니다dddd.");
		
	}
	
	
	String textOutput(){
		return "aaa";
	}
	
	
}

class TVCR extends Tv1{
	
	//Tv1 tv = new Tv1();	
	
	public static void main(String[] agrs){
			
		VCR vcr = new VCR();
		vcr.tvMethod();
		vcr.textOutput();
		System.out.println(vcr.textOutput());
		//System.out.println("tv메서드입니다.");		
		
					
	}	
}



