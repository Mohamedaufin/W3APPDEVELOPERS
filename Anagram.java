package strings;
import java.util.*;
public class Anagram {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
	        String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

	        if(str1.length() != str2.length()) {
	            System.out.println("Not anagrams");
	            return;
	        }

	        char[] a = str1.toCharArray();
	        char[] b = str2.toCharArray();
	        Arrays.sort(a);
	        Arrays.sort(b);

	        if(Arrays.equals(a, b))
	            System.out.println("Anagrams");
	        else
	            System.out.println("Not anagrams");
	    }
	}


