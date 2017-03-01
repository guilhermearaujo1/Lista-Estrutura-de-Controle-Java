import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Tabuada de qual numero?");
		int i = input.nextInt();

		for (int j = 1; j <= 10; j++) {
			System.out.println(i + " x " + j + " = " + i * j);
		}
	}
}
