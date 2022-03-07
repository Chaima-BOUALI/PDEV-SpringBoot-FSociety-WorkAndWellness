package tn.esprit.spring.entities.validation.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import tn.esprit.spring.entities.payload.PasswordResetRequest;
import tn.esprit.spring.entities.validation.annotation.MatchPassword;



public class MatchPasswordValidator implements ConstraintValidator<MatchPassword, PasswordResetRequest>{
	  private Boolean allowNull;

	    @Override
	    public void initialize(MatchPassword constraintAnnotation) {
	        allowNull = constraintAnnotation.allowNull();
	    }

	    @Override
	    public boolean isValid(PasswordResetRequest value, ConstraintValidatorContext context) {
	        String password = value.getPassword();
	        String confirmPassword = value.getConfirmPassword();
	        if (allowNull) {
	            return null == password && null == confirmPassword;
	        }
	        return password.equals(confirmPassword);
	    }
}
