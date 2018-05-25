package architectureOO;

public abstract class CalculatriceAbs implements Calculatrice {
	protected double a;
	protected double b;

	public CalculatriceAbs() {}
	public CalculatriceAbs(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
