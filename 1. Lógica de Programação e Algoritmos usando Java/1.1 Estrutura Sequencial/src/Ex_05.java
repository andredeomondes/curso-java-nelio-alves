import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

				int cod1, cod2, qte1, qte2;
			double preco1, preco2, total;

			System.out.println("Digite o código do produto: ");
			cod1 = sc.nextInt();

			System.out.println("Digite a quantidade: ");
			qte1 = sc.nextInt();

			System.out.println("Digite o valor do produto: ");
			preco1 = sc.nextDouble();

			System.out.println("Digite o código do segundo produto: ");
			cod2 = sc.nextInt();

			System.out.println("Digite a quantidade do segundo produto: ");
			qte2 = sc.nextInt();

			System.out.println("Digite o valor do segundo produto: ");
			preco2 = sc.nextDouble();

			total = preco1 * qte1 + preco2 * qte2;
			System.out.printf("VALOR TOTAl: R$ %.2f%n", total);
			

			sc.close();

	}
}