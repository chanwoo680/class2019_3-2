package ac.daclim.uml.zoo;

public class Zoo {
	static Animal tiger;
	static Animal eagle;
	static Animal pigeon;
	static Animal turtle;
	public static void main(String[] args ) {
		tiger = new Tiger();
		eagle = new Eagle();
		pigeon = new Pigeon();
		turtle = new Turtle();
		
		tiger.dispaly();
		tiger.performCry();
		tiger.perfromFly();
		
		eagle.dispaly();
		eagle.performCry();
		eagle.perfromFly();
		
		pigeon.dispaly();
		pigeon.performCry();
		pigeon.perfromFly();
		
		turtle.dispaly();
		turtle.performCry();
		turtle.perfromFly();
		
		
		
	}
}
