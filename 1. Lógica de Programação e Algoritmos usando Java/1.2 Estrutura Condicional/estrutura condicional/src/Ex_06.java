/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) throws Exception {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int codigo, quantidade;
    double total;

    System.err.println("Digite o código do produto: ");
    codigo = sc.nextInt();

    System.err.println("Digite a quantidade: ");
    quantidade = sc.nextInt();

        
    if (codigo == 1) {
        total =  4.00 * quantidade;
    } 
    else if (codigo == 2) {
        total =  4.50 * quantidade;
    }
    else if (codigo == 3) {
        total =  5.00 * quantidade;
    }
    else if (codigo == 4) {
        total = 2.00 * quantidade;
    }
    else {
        total =  1.50 * quantidade;
    }

    System.out.printf("Total: R$ %.2f", total);

    sc.close();
        
    }
}