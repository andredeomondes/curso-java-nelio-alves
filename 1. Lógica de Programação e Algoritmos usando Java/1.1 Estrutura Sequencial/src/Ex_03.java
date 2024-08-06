import java.util.Locale;
import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de a, b, c e d: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double diferenca = a * b - c * d;
		System.out.println(diferenca);

		sc.close();


	}
}