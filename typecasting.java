package project1;

public class typecasting {

	public static void main(String[] args) {
		int num = 10;
        double doubleNum = num;  // int to double (automatic)
        System.out.println("Widening Conversion:");
        System.out.println("Integer value: " + num);
        System.out.println("Converted to double: " + doubleNum);

        // ✅ Type Casting (Narrowing Conversion - manual)
        double price = 99.99;
        int castedPrice = (int) price; // double to int (manual casting)
        System.out.println("\nNarrowing Conversion:");
        System.out.println("Double value: " + price);
        System.out.println("Converted to int: " + castedPrice);

        // ✅ Example: char to int (implicit)
        char ch = 'A';
        int ascii = ch;
        System.out.println("\nChar to int conversion:");
        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + ascii);

        // ✅ Example: int to char (explicit)
        int code = 66;
        char letter = (char) code;
        System.out.println("\nInt to char conversion:");
        System.out.println("Int value: " + code);
        System.out.println("Converted to char: " + letter);

        // ✅ Type casting float to int
        float f = 12.56f;
        int i = (int) f;
        System.out.println("\nFloat to int conversion:");
        System.out.println("Float value: " + f);
        System.out.println("Converted to int: " + i);
   

	}

}
