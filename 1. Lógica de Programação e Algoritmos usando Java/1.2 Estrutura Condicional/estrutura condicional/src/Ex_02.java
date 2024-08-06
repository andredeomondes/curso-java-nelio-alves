/*
Fazer um programa para ler um número inteiro, 
e depois dizer se este número é negativo ou não.
*/


import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Digite um número: ");
        x = sc.nextInt();

    if (x < 0) {
        System.out.println("NEGATIVO");
    } else {
        System.out.println("NÃO NEGATIVO");

    }
    sc.close();
    }
}