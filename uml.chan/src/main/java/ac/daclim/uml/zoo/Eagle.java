package ac.daclim.uml.zoo;

public class Eagle extends Animal{

	public Eagle() {
		cry = (ICry) new BirdCry();
		fly = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("독수리");
	}
	
	
	public void cry() {
		System.out.println(cry);
	}
	
	public void performCry() {
		cry.cry();	
	}
	public void performFly() {
		fly.fly();
	}
}
