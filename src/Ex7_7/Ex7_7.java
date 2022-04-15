package Ex7_7;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water(); 에러
		fe2 = (FireEngine)car;
		fe2.water();
		
	}

}
