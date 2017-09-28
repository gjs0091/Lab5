
public class Lab5 {

	public Lab5() {
		
	}
	/**
	 * 
	 * @param expr String and substring to check if it is a palindrome
	 * @return returns a boolean that is true if the input is a palindrome
	 */
	public static boolean isaPalindrome(String expr) {
		String str = expr.toLowerCase();
		
		if (str.equals("")) return true;
		if (str.length() == 1) return true;
		int end = str.length();
		if(str.charAt(0) == str.charAt(end - 1)) return isaPalindrome(str.substring(1, end - 1));
		else return false;
	}
	public static void main(String[] args) {
		String str1 = "Able was I ere I saw Elba";
		System.out.println(isaPalindrome(str1));
		String str2 = "The dog ate the food";
		System.out.println(isaPalindrome(str2));
		String str3 = "1881";
		System.out.println(isaPalindrome(str3));
	}

}
