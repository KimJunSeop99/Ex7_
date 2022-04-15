package ex3;

public class StarcraftTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 마린 : 키 , 몸무게
		// 기능 : 
		// 걷기 : "걸어가고 있습니다."
		// 총쏘기 : " 총을 쏘고 있습니다."
		// 스팀팩 : "스팀팩을 사용했습니다"
		
		// 파이어뱃 : 키 , 몸무게
		// 기능 : 
		// 걷기 : "걸어가고 있습니다."
		// 불쏘기 : "불을 쏘고 있습니다."

		// 탱크 : 몸무게
		// 기능 : 
		// 운전 : "움직이고 있습니다."
		// 시즈모드 : "시즈모드로 동작하였습니다."
		Taeran taeran = new Taeran();
		Firebat firebat = new Firebat();
		Tank tank = new Tank();
		
		taeran.walk();
		taeran.shot();
		taeran.steampack();
		System.out.println();
		firebat.walk();
		firebat.fire();
		System.out.println();
		tank.drive();
		tank.seez();
		
	}

}
