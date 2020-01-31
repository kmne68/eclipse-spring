package CourseCodeConstraintValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.kmne68.validation.CourseCode;




public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	
	private String coursePrefix;
	
	
	@Override
	public void initialize(CourseCode courseCode) {
		
		coursePrefix = courseCode.value();
	}
	
	
	@Override
	public boolean isValid(String userCode, ConstraintValidatorContext constraintValidatorContext) {

		boolean result = userCode.startsWith(coursePrefix);		
		
		return result;
	}
	
	

}
