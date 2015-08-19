package danielsxavier.com.github.exceptions;


@SuppressWarnings("serial")
public class NotFilled extends RuntimeException {

    private String message;

    public NotFilled(String message) {
	super(message);
	this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
