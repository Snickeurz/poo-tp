package architectureOO;

public enum ExceptionCalculatrice {

	DIVISION_BY_ZERO(1, "Division par 0 interdite");

	ExceptionCalculatrice(final int code, final String message) {
		this.code = code;
		this.message = message;
	}

	private final int code;
	private final String message;

	public int getCode() {
		return this.code;
	}

	public String getMessage() {
		return this.message;
	}

}
