package exceptions;

public class ColorNotFoundException extends Exception{
 

	public ColorNotFoundException(String data) {
		super("Color '" + data + "' not found.");
	}

}
