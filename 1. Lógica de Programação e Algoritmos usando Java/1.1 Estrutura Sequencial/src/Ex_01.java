import java.util.Locale;
import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B, soma;

        System.out.println("Digite o valor de A:");
		A = sc.nextInt();
        System.out.println("Digite o valor de B:");
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();
	}
}