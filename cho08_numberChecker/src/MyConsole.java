
public class MyConsole extends Console {

	public int intInput;

	public MyConsole() {
		super();
		intInput = 0;

	}

	public void setIntInput(int intInput) {
		this.intInput = intInput;
		if (intInput % 2 == 0) {
			System.out.println("The given number " + intInput + " is Even ");
		} else {
			System.out.println("The given number " + intInput + " is Odd ");
		}
	}

	public int getntInput() {
		return intInput;
	}

}
