package Inicio;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        int nota1, nota2, nota3, media;


        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextInt();

        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextInt();

        media = (nota1+nota2+nota3) / 3;

        System.out.println("Sua média é: " + media);
    }
}
