import java.util.Locale;
import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			double a, b, c, pi, trianguloRetangulo, circulo, trapezio, quadrado, retangulo;
			
			System.out.println("Digite o valor de A: ");
			a = sc.nextDouble();

			System.out.println("Digite o valor de B: ");
			b = sc.nextDouble();
			
			System.out.println("Digite o valor de C: ");
			c = sc.nextDouble();


			pi = 3.14159;
			trianguloRetangulo = a * c / 2 ;
			circulo = pi * c * c;
			trapezio = (a + b) * c / 2 ;
			quadrado = b * b ;
			retangulo = a * b;

			System.out.printf("Área do Triangulo: %.3f%n", trianguloRetangulo);
			System.out.printf("Área do Círculo: %.3f%n", circulo);
			System.out.printf("Área do Trapézio: %.3f%n", trapezio);
			System.out.printf("Área do Quadrado: %.3f%n", quadrado);
			System.out.printf("Área do Retângulo: %.3f%n", retangulo);
	
			sc.close();

	}
}