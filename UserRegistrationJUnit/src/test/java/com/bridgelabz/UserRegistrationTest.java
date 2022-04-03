package com.bridgelabz;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();
	@Test
	public void givenFirstName_WhenProperShouldReturnTrue() {
		assertEquals("Proper First Name", true , userRegistration.validateFirstName("Suman"));
	}

	@Test
	public void givenFirstName_WhenImProperShouldReturnFalse() {
		assertEquals("Improper Name", false, userRegistration.validateFirstName("suman"));
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue_ElseFalse() {

		assertEquals("Proper Last Name", true , userRegistration.validateLastName("Chandragiri"));
		assertEquals("Improper Last Name", false, userRegistration.validateLastName("chandragiri"));

	}

	@Test
	public void givenEmailId_WhenProper_ShouldReturnTrue_ElseFalse() {

		assertEquals("Proper Email ID", true , userRegistration.validateEmailId("csumn13@gmail.com"));
		assertEquals("Improper Email ID", false, userRegistration.validateEmailId("@gmail.com"));

	}

	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue_ElseFalse() {

		assertEquals("Proper Mobile Number", true , userRegistration.validateMobileNumber("91 7777777777"));
		assertEquals("Improper Mobile Number", false, userRegistration.validateMobileNumber("91 71717"));
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue_ElseFalse() {

		assertEquals("Proper Password", true , userRegistration.validatePassword("Healup13@"));
		assertEquals("Improper Password", false, userRegistration.validatePassword("google"));
	}
}
