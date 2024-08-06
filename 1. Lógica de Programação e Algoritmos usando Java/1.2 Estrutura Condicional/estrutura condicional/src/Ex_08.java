/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) throws Exception {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor da coordenada X: " );
    double eixoX = sc.nextDouble();
    System.out.println("Digite o valor da coordenada Y: " );
    double eixoY = sc.nextDouble();

    if(eixoX == 0 & eixoY == 0) {
        System.out.println("Origem");
    } else if (eixoX > 0 & eixoY > 0) {
        System.out.println("Q1");
    } else if (eixoX > 0 & eixoY < 0) {
        System.out.println("Q2");
 
    } else if (eixoX < 0 & eixoY < 0) {
        System.out.println("Q3");
    } else {
        System.out.println("Q4");
    }

    sc.close();

    }
}