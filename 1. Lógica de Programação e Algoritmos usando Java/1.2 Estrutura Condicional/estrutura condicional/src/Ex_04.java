/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar 
uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
indicando se os valores lidos são múltiplos entre si. 
Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
*/


import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        b = sc.nextInt();

        if (b > a && b % a == 0 || a > b && a % a == 0 ){
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
        sc.close();
    }

    }
