package Chapter7.casting;

public class SuperCar {

	public static void main(String[] args) {
		
/*		Car car = null;
		FireCar fe = new FireCar();
		FireCar fe2 = null;
		
		fe.Water();
		car = fe;
		//car.Water();
		fe2 = (FireCar)car;
		fe2.Water();*/
		
		
		
		
	    Car car = new Car();
		Car car2 = null;
		
		FireCar fire = new FireCar();
		FireCar fire2 = null;
		
		
		car2 = fire;
		fire2 = (FireCar)car2;
		
		car2.Bbang();
		fire2.Bbang();
		fire2.run();
		
		
	}

}
