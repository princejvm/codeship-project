package studentadmission;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

//@ControllerAdvice
public class ExceptionMethods {
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullException(Exception e) {
		return "null";
	}
	@ExceptionHandler(value=IOException.class)
	public String handleIOException(Exception e) {
		return "io";
	}
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String handleException(Exception e) {
		return "exception";
	}

}
