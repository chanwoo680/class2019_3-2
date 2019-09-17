package ac.daclim.uml.zoo;

public class Turtle extends Animal{
	public Turtle() {
		cry = new CryNoWay();
		fly = new FlyNoway();
	}
	
	@Override
	public void display() {
		System.out.println("거북이");
	}
}
