
public class Sheep extends Animal implements Cloneable {

	String name;

	public Sheep() {
		name = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getCountString() {
		return getCount() + name;
	}

}
