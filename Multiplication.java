package architectureOO;

public class Multiplication extends CalculatriceAbs {

	public Multiplication() {
	}

	public Multiplication(double a, double b) {
		super(a, b);
	}

	@Override
	public double operation() {
		return a * b;
	}

}
