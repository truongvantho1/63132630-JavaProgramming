package Lap1;
import java.util.Scanner;
public class Lap1c {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("canh:");
		float Canh = scanner.nextFloat();
		double thetich = (Canh)*Canh*Canh;
				System.out.printf("the tich cua khoi lap phuong la:%.2f", thetich);
	}

}
