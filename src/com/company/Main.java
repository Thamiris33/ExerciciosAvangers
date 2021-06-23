package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int anos;
        int meses;
        int dias;

        System.out.println("Digite quantos anos: ");
        anos = entrada.nextInt();
        System.out.println("Digite quantos meses: ");
        meses = entrada.nextInt();
        System.out.println("Digite quantos dias: ");
        dias = entrada.nextInt();
        
        int idade;

        System.out.println("idade em dias= " + ((anos * 365) + (meses * 30) + dias));

    }
}
