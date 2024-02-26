package Lap1;
import java.util.Scanner;
public class Lap1d {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap a:");
		float a = scanner.nextFloat();
		System.out.print("nhap b:");
		float b = scanner.nextFloat();
		System.out.print("nhap c:");
		float c = scanner.nextFloat();
		double Delta = Math.pow(b, 2) - 4 * a * c;
		double Can = Math.sqrt(Delta);
		System.out.printf("Delta là :%.2f", Delta);
		System.out.printf("Căn Delta là:%.2f", Can);

	}

}
