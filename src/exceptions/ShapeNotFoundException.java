package exceptions;

public class ShapeNotFoundException extends Exception {

	public ShapeNotFoundException() {
		super("Shape not found.");
	}

	public ShapeNotFoundException(char data) {
		super("Shape '" + data + "' not found.");
	}

}
