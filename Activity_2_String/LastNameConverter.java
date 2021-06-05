import java.util.Scanner;
public class LastNameConverter {
	 static String convert1(String str)
	    {
	 
	        // Create a char array of given String
	        char ch[] = str.toCharArray();
	        for (int i = 0; i < str.length(); i++) {
	 
	            // If first character of a word is found
	            if (i == 0 && ch[i] != ' ' ||
	                ch[i] != ' ' && ch[i - 1] == ' ') {
	 
	                // If it is in lower-case
	                if (ch[i] >= 'a' && ch[i] <= 'z') {
	 
	                    // Convert into Upper-case
	                    ch[i] = (char)(ch[i] - 'a' + 'A');
	                }
	            }
	 
	            // If apart from first character
	            // Any one is in Upper-case
	            else if (ch[i] >= 'A' && ch[i] <= 'Z')
	 
	                // Convert into Lower-Case
	                ch[i] = (char)(ch[i] + 'a' - 'A');           
	        }
	 
	        // Convert the char array to equivalent String
	        String st = new String(ch);
	        return st;
	    }
static String convert2(String str)
{
	String second;
	second = str.toUpperCase();
	return second;
}
	 
	 
public static void main(String[] args) 
{
	LastNameConverter c1 = new LastNameConverter();
	Scanner input = new Scanner(System.in);
	String string1 = input.next();
	String string2 = input.next();
	String s1 = convert1(string1);
	String s2 = convert2(string2);
	System.out.println(s1.concat(" ").concat(s2));
}
}
