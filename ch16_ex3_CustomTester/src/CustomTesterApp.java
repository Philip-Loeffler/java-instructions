import java.io.IOException;

public class CustomTesterApp {

	TestException t = new TestException();

	public static void main(String[] args) {
		method1();
	}

	public static void method1() {
		method2();
	}

	public static void method2() {
		try {
			method3();
		} catch (TestException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void method3() throws TestException {
		try {
			throw new IOException("Test IO exception");
		} catch (IOException e) {
			throw new TestException(e);
		}
	}
}