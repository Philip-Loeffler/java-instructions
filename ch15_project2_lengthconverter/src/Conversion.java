
public class Conversion {

	private String fromUnit;
	private double fromValue;
	private String toUnit;
	private double conversionRatio;

	public Conversion() {
		fromUnit = "";
		fromValue = 0.0;
		toUnit = "";
		conversionRatio = 0.0;
	}

	public Conversion(String fromUnit, double fromValue, String toUnit, double conversionRatio) {
		super();
		this.fromUnit = fromUnit;
		this.fromValue = fromValue;
		this.toUnit = toUnit;
		this.conversionRatio = conversionRatio;
	}

	public String getFromUnit() {
		return fromUnit;
	}

	public void setFromUnit(String fromUnit) {
		this.fromUnit = fromUnit;
	}

	public double getFromValue() {
		return fromValue;
	}

	public void setFromValue(double fromValue) {
		this.fromValue = fromValue;
	}

	public String getToUnit() {
		return toUnit;
	}

	public void setToUnit(String toUnit) {
		this.toUnit = toUnit;
	}

	public double getConverstionRatio() {
		return conversionRatio;
	}

	public void setConverstionRatio(double converstionRatio) {
		this.conversionRatio = converstionRatio;
	}

	public double getToValue() {
		return fromValue * conversionRatio;
	}

	@Override
	public String toString() {
		return "Conversion [fromUnit=" + fromUnit + ", fromValue=" + fromValue + ", toUnit=" + toUnit
				+ ", conversionRatio=" + conversionRatio + "]";
	}

}
