package Lab2;
import java.util.Scanner;
public class Lab2a {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("cho phuong trinh ax+b=0");
		System.out.println("nhap a:");
		float a = scanner.nextFloat();
		System.out.println("nhap b:");
		float b = scanner.nextFloat();
		if( a==0){
			if(b==0) {
				System.out.print("Phương trình vô số nghiệm");
			}else
			{
				System.out.print("Phương trình vô nghiệm");
			}
			
		}else
		{
			double x = -b/a;
			System.out.printf("gia tri cua x la:" +x);
		}
	}
}