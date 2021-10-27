package address;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;

import org.hamcrest.Matcher;
import org.junit.Test;

public class addressTest {
	@Test
	public static void givenFirstNameIsTrue(String firstname) {
		{
			  
	        // Regex to check valid username.
	        String regex = "^[A-Za-z]\\w{5,29}$";
	  
	        // Compile the ReGex
	        Pattern pattern = Pattern.compile(regex);
	  
	        // Pattern class contains matcher() method
	        // to find matching between given username
	        // and regular expression.
	        Matcher matcher = pattern.matcher(firstname);
	  
	        // Return if the username
	        // matched the ReGex
	        AssertTrue(matcher.matches());
	    }
	}

}
