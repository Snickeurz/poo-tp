package architectureOO;

public class Addition extends CalculatriceAbs {

	public Addition() {}
	public Addition(double a, double b) {
		super(a, b);
	}

	@Override
	public double operation() {
		return a + b;
	}

}
