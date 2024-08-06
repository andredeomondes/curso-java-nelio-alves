/*
Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) throws Exception {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o valor da sua renda: ");
    double renda = sc.nextDouble();
    double imposto;

    if( renda <= 2000 ) {
       imposto = 0.0;
    }  
    else if ( renda <= 3000 ) {
        imposto = (renda - 2000) * 0.08 ;
    }  
    else if ( renda<= 4500 ) {
        imposto = (renda - 3000) * 0.18 + 1000 * 0.08;
    }   
    else {
        imposto = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
    } 
    if (imposto == 0.0) {
        System.out.println("Isento");
    } 
    else {
        System.out.printf("R$: R$ %.2f", imposto);
    }



    sc.close();

    }
}