package ex4;

public class CustomerTest {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VIP , Gold , Silver
		// 속성 : 고객 ID , 고객이름 , 고객등급
		// 기능 : show() : 고객ID , 고객이름, 고객등급 출력
		// 		: draw() : 여러분은 동성쇼핑몰 고객입니다.
		// 위의 고객들을 생성하고 기능을 출력하세요.
		
		// show() : 최초에 가입한 당신은 동성쇼핑몰 고객입니다.
		// 기능 : show() : 고객ID , 고객이름, 고객등급 출력
		// 고객ID : 1, 2, 3
		// 고객이름 : "홍길동" , "이순신" "브래드"
		// 고객등급 : "VIP" , "Gold" , "Silver" , "일반"
		
		VIP vip = new VIP();
		Gold gold = new Gold();
		Silver silver = new Silver();
		New n = new New();
	
		
		vip.draw();
		vip.set(1, "브래드", "VIP");
		vip.show();
		
		gold.set(2, "홍길동", "Gold");
		gold.show();
		
		silver.set(3, "이순신", "Silver");
		silver.show();
	
		n.draw();
		n.set(4, "일반", "일반");
		n.show();
	}

}
