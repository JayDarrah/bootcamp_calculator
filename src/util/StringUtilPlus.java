package util;

/* I was going to use this to create a table
 * however it was easier to just type it out
 * in a WYSIWYG fashion.
 * 
 * Anyway, this modifies the pad method from ch13
 * so that you can pad a line out with whatever
 * character you wish.
 * 
 * I added a trivial application of this class in the "Bye" section...
 */

public class StringUtilPlus {
	
	public static String pad(String s, int length, String str) {
		if (s.length() < length) {
			//append character of type c until the string is the specified length
			StringBuilder sb = new StringBuilder(s);
			while (sb.length() < length) {
				sb.append(str);
			}
			return sb.toString();
		} else {
			//truncate the string to the specified length
			return s.substring(0,length);
		}
	}
}
