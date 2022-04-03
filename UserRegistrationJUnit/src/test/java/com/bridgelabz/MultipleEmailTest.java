package com.bridgelabz;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MultipleEmailTest {

	private String inputEmailId;
	private String expectedResult;
	private UserRegistration multipleTest; 


	public MultipleEmailTest(String inputEmailId, String expectedResult) {
		this.inputEmailId = inputEmailId;
		this.expectedResult = expectedResult;
	}
	@Before
	public void initialize() {
		multipleTest = new UserRegistration();
	}
	@Parameters
	public static Collection emails() {
		String array[][] = {{"abc@yahoo.com","true"},{"abc.@gmail.com","true"},{"abc@abc@gmail.com","false"},{"abc@gmail.com.1","true"},
				{"abc-100@yahoo.com","true"},{"abc.100@yahoo.com","true"},
				{"abc111@abc.com","true"},{"abc-100@abc.net","true"},{"abc.100@abc.com.au","true"},
				{"abc@1.com","true"},{"abc@gmail.com.com","true"},{"abc+100@gmail.com","true"},
				{"abc –","false"},{"abc@.com.my","true"},{"abc123@gmail.a","true"},
				{"abc123@.com","true"},{"abc123@.com.com","true"},{".abc@abc.com","true"},
				{"abc()*@gmail.com","false"},{"abc@%*.com","false"},{"abc..2002@gmail.com","true"},
				{"abc@.com.my","true"}};
		return Arrays.asList(array);
	}
	@Test
	public void testMultipleEmailsTest() {
		assertEquals("Email", Boolean.parseBoolean(expectedResult), multipleTest.validateEmailId(inputEmailId));
		System.out.println(inputEmailId);
		System.out.println(Boolean.parseBoolean(expectedResult));
	}
}
