import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class mathUtilsTest {

	@Test
	public void testMin() {
		int min = MathUtils.min(10, 20);
		Assertions.assertEquals(10, min);
	}

	@Test
	public void testMax() {
		int max = MathUtils.max(10, 20);
		Assertions.assertEquals(20, max);
	}

}
