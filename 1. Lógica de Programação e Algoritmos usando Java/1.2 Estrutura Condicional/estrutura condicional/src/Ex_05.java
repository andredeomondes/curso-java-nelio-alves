/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo
que o mesmo pode começar em um dia e terminar em outro, tendo uma 
duração mínima de 1 hora e máxima de 24 horas.
*/


import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a hora inicial do jogo: ");
        int horaInicial = sc.nextInt();
        System.out.println("Digite a hora final do jogo: ");
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;

        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O seu jogo durou " + duracao + " Hora(s)");
        sc.close();
        
    }

    }
