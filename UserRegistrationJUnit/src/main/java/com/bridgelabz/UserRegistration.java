package com.bridgelabz;

public class UserRegistration {
	private static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";;
	private static final String LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
	private static final String EMAIL_ID_PATTERN =  "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	private static final String MOBILE_NUMBER_PATTERN =  "^([0-9]{2}\\s)?[6789]{1}[0-9]{9}";
	private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";
	
	
	public boolean validateFirstName(String firstName)
	{
		if(firstName.matches(FIRST_NAME_PATTERN))
			return true;
		else
			return false;
	}
	
	public boolean validateLastName(String lastName)
	{
		if(lastName.matches(LAST_NAME_PATTERN))
			return true;
		else
			return false;
	}
	
	public boolean validateEmailId(String emailId)
	{
		if(emailId.matches(EMAIL_ID_PATTERN))
			return true;
		else
			return false;
	}
	
	public boolean validateMobileNumber(String mobileNumber)
	{
		if(mobileNumber.matches(MOBILE_NUMBER_PATTERN))
			return true;
		else
			return false;
	}
	
	public boolean validatePassword(String password)
	{
		if(password.matches(PASSWORD_PATTERN))
			return true;
		else
			return false;
	}
}
