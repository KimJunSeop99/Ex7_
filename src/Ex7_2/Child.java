package Ex7_2;

public class Child extends Parent{
	int x = 20;
	
	public void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("spuer.x = " + super.x);
	}
}	
