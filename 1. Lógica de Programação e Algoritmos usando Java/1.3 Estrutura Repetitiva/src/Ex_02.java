/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
indeterminada de pontos no sistema cartesiano.

Para cada ponto escrever o quadrante a que ele pertence.

O algoritmo será encerrado quando pelo menos uma de duas coordenadas
for NULA (nesta situação sem escrever mensagem alguma).
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a coordenada X: ");
        int x = sc.nextInt();
        System.out.println("Digite a coordenada Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0 ) {
            if (x > 0 && y > 0) {
                System.out.println("Q1");
            }
            else if (x > 0 && y < 0) {
                System.out.println("Q2");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Q3");
            }
            else {
                System.out.println("Q4");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}
