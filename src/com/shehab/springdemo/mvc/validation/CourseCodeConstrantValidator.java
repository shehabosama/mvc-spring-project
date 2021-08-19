package com.shehab.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstrantValidator implements ConstraintValidator<CourseCode, String> {

	/**
	* <h1>Note about the multiable check </h1>
	* You should use one case of the validation 
	* either first one that check one word e.g word start with LUV only
	* or TOPS AND LUV 
	* <p>
	* @author Shehab
	* @version 1.0
	* @since 2020-08-17
	* </p>
	*/
	
	// for single check
	private String coursePrefix;
	//for multiable chick
	private String[] coursePrefixes;
	
	@Override
	public void initialize(CourseCode theCourseCode) {
		// TODO Auto-generated method stub
		this.coursePrefix = theCourseCode.value();
		
		this.coursePrefixes = theCourseCode.values();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		boolean result ;
		if(theCode!=null ) {
			result = theCode.startsWith(coursePrefix);
			for (String tempPrefix : coursePrefixes) {
                result = theCode.startsWith(tempPrefix);
                
                // if we found a match then break out of the loop
                if (result) {
                    break;
                }
			}
			
			}else 
			{
			result = true;
		}
		return result;
	}

}
