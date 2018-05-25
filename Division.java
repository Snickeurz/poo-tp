package architectureOO;

public class Division extends CalculatriceAbs {

	public Division() {}
	public Division(double a, double b) {
		super(a, b);
	}

	@Override
	public double operation() throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException(ExceptionCalculatrice.DIVISION_BY_ZERO.getMessage());
			
		}
		return a / b;
		
	}

}
