import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			int numeroFuncionario;
		double valorHora, salario, horasTrabalhadas;	

		System.out.println("Digite o número do funcionário: ");
		numeroFuncionario = sc.nextInt();

		System.out.println("Digite o número de horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();

		System.out.println("Digite o valor que recebe por hora: ");
		valorHora = sc.nextDouble();

		salario = horasTrabalhadas * valorHora;

		System.out.println("NUMBER = " +  numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n",  salario);

			sc.close();

	}
}