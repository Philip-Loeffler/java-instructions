import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ConversionTest {

	@Test
	void testMilesToFeet() {
		Conversion conversion = new Conversion("miles", 1.0, "feet", 5280.0);

		assertEquals(5280.0, conversion.getToValue());
	}

}
