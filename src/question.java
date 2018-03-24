import java.util.Random;
import java.util.Scanner;

public class question {
	public static void main(String[] args) {
		
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("201571030317");
		System.out.println("请输入运算个数：");
		int input = in.nextInt();
		for (int i = 1; i <= input; i++) {
			String question = null;
			int a, b, d, e;
			int c;
			c = r.nextInt(4);
			do {
				a = r.nextInt(100);
				b = r.nextInt(100);
			} while ((c == 3 && b == 0) 
					|| (c == 3 && a % b != 0)
					|| (c == 2 && a * b > 100) 
					|| (c == 1 && a < b)
					|| (c == 0 && a + b > 100));
		
			if (c == 0) {
				question = a + "+" + b + "+" + a + "+" + b + "=";
				
			} else if (c == 1) {
				question = a + "-" + b +  "+" +a + "+" + b + "=";
				
			} else if (c == 2) {
				question = a + "*" + b +  "+" +a + "+" + b + "=";
				
			} else {
				question = a + "/" + b +  "+" +a + "+" + b+ "=";
				
			}
			
			System.out.println(question );

		
		}
		
		in.close();
	}

}