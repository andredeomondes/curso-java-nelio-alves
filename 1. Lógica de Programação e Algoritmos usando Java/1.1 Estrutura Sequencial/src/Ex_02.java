import java.util.Locale;
import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		System.out.println("Bem-vindo ao programa de cálculo de área de um círculo");
		System.out.println("Digite o valor do raio: ");
		
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double pi = 3.14159; 
		double areaCircle = pi * raio * raio;

		System.out.printf("Área do círculo: %.4f%n", areaCircle);
		sc.close();

	}
}