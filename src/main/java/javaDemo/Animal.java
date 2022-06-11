package javaDemo;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal obj = new Animal();
		
		obj.noTalk();
		obj.isCat();
		obj.teeth();
		obj.crawl();
		
		System.out.print("It has ");
		obj.hasLegs(2, 2);
		System.out.println(" legs.");
		
		addStrings("A cat has", " 2 eyes.");
		add(10,20);
		
	}
	
	public void noTalk() {
		
		System.out.println("An animal can not Talk.");
	}
	
	private void isCat() {
		
		System.out.println("A cat is an animal.");
		
	}
	
	void teeth() {
		
		System.out.println("It has sharp teeth.");
	}
	
	protected void crawl() {
		
		System.out.println("It can crawl.");
	}
	
	public int hasLegs(int a, int b) {
		 
		System.out.print(a+b);
		
		  return a+b;
		
	
	}
	
	public static String addStrings(String x, String y) {
		
		System.out.println(x+y);
		return (x+y);
	}
	
	public static int add(int c, int d) {
		 
		System.out.print(c+d);
		
		  return c+d;
}
}