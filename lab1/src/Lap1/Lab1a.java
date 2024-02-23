package Lap1;
import java.util.Scanner;
public class Lab1a {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		System.out.printf("%s %.1f diem", hoTen, diemTB);
	}

}
