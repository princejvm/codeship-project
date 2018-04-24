package studentadmission;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class NameValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return Studnt.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		Studnt s1 = (Studnt)arg0;
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "studentName","e1", "Name is empty");
		if(s1.getStudentAddress().getCountry().length()<3)
			arg1.rejectValue("stdentName","e","length less than 3");
		
	}
	

}
