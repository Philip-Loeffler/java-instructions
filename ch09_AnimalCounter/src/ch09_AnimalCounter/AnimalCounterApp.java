
public class AnimalCounterApp {

	public static void count(Countable c, int maxCount) {

		c.resetCount();
		for (int i = 0; i < maxCount; ++i) {
			c.incrementCount(c.getCountString());

		}

		System.out.println();

	}

	public static void main(String[] args) {
		Alligator a = new Alligator();
		count(a, 3);

		Sheep blackie = new Sheep();
		count(blackie, 2);

		Sheep dolly;
		try {
			dolly = (Sheep) blackie.clone();
			dolly.setName("Dolly");
			count(dolly, 3);
		} catch (CloneNotSupportedException e) {
			System.out.println("erro cloning blackie");
		}
		count(blackie, 1);
	}

}
