package EncapsuModifideAcessoPublicEPrivate;

import java.util.Scanner;

public class TesteEncapsu {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Informe a distancia: ");
        int distancia = scan.nextInt();


        Local ambiente = new Local(distancia, nome);

        System.out.println("Nome: " + "" + nome + " mora a: " + ambiente.obterDistancia() + "Km da roça da familia");

        System.out.println(ambiente.obterNome());

        System.out.println(ambiente.obterDistancia());


        System.out.println("-------------------------------------------------");

        System.out.println("Informe a nova distancia para onde ira morar: ");
        double novaDistancia = scan.nextDouble();
        ambiente.mudarDistancia((int) novaDistancia);

        System.out.println(ambiente.obterDistancia());

        System.out.println(nome + " vai se mudar a: " + novaDistancia + "km de seus familiares");


    }
}
