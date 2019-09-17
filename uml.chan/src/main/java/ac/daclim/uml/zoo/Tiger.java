package ac.daclim.uml.zoo;

public class Tiger extends Animal {
	
	public Tiger() {
		cry = new TigerCry();
		fly = new FlyNoway();
	}
	
	@Override
	public void display() {
		System.out.println("호랑이");
	}
	
	public void cry() {
		System.out.println(cry);
	}
	
}
