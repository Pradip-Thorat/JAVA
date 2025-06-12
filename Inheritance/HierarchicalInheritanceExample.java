package Inheritance;

public class HierarchicalInheritanceExample {
	
	public static void main(String[] args) {
		
		AC ac = new AC();
		ac.id=1;
		ac.start();
		ac.temperatureDecrease();
		ac.stop();
		
		Television television = new Television();
		television.id=2;
		television.start();
		television.volumeIncrease();
		television.stop();
	}

}
