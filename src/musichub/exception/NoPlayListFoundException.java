package musichub.exception;

import java.lang.Exception;

public class NoPlayListFoundException extends Exception {

	public NoPlayListFoundException (String msg) {
		super(msg);
	}
}