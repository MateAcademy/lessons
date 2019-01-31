package lesson10.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author spasko
 */
public class MainPattern {

	public static void main(String[] args) {
		String contentStr = "This is example class for Java course";

		String patternStr = ".*java.*";

		boolean isMatch = Pattern.matches(patternStr, contentStr);
		System.out.println("The text contains 'Java'? " + isMatch);

		// IgnoreCase
		Pattern pattern = Pattern.compile(patternStr, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(contentStr);
		isMatch = matcher.matches();
		System.out.println("The text contains 'Java'? " + isMatch);

		// Find positions of substring
		contentStr = "ZZZ AA PP AA QQQ AAA ZZ";

		patternStr = "AA";
		pattern = Pattern.compile(patternStr);
		matcher = pattern.matcher(contentStr);

		while (matcher.find()) {
			System.out.println("Found at: " + matcher.start() + " - " + matcher.end());
		}

		System.out.println(Pattern.matches("tom", "Tom")); // False

		// Returns true if the string matches exactly "tom" or "Tom"
		System.out.println(Pattern.matches("[Tt]om", "Tom")); // True

		// Returns true if the string matches exactly "tim" or "Tim" or "jin" or "Jin"
		System.out.println(Pattern.matches("[tT]im|[jJ]in", "Tim"));// True
		System.out.println(Pattern.matches("[tT]im|[jJ]in", "jin"));// True

		// Returns true if the string contains "abc" at any place

		System.out.println(Pattern.matches(".*abc.*", "deabcpq"));// True

		// Returns true if the string does not have a number at the beginning
		System.out.println(Pattern.matches("^[^\\d].*", "123abc")); // False
		System.out.println(Pattern.matches("^[^\\d].*", "abc123")); // True

		// Returns true if the string contains of three letters
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aPz"));// True
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aAA"));// True
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "apZx"));// False

		// Returns true if the string contains 0 or more non-digits
		System.out.println(Pattern.matches("\\D*", "abcde")); // True
		System.out.println(Pattern.matches("\\D*", "abcde123")); // False

		// Boundary Matchers ^ denotes start of the line $ denotes end of the line
		System.out.println(Pattern.matches("^This$", "This is Chaitanya")); // False
		System.out.println(Pattern.matches("^This$", "This")); // True
		System.out.println(Pattern.matches("^This$", "Is This Chaitanya")); // False

	}

}
