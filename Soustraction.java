package architectureOO;

public class Soustraction extends CalculatriceAbs {

	public Soustraction() {}
	public Soustraction(double a, double b) {
		super(a,b);
	}

	@Override
	public double opertion() {
		return a - b;
	}

}
