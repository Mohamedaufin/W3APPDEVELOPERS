package strings;
import java.util.*;

public class Count {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase(); 
        int vowels = 0, consonants = 0;

        for(char ch : str.toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                if("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

}
