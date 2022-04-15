package ex4;

public class Main {
	int customerId;
	String name;
	String grade;
	
	public void draw() {
		System.out.println("여러분은 동성쇼핑몰 고객입니다.");
	}
	
	public void show() {
		System.out.println(customerId + " " + name + " " + grade);
	}
	
	public void set(int customerId, String name, String grade) {
		this.customerId = customerId;
		this.name = name;
		this.grade = grade;
	}
}
