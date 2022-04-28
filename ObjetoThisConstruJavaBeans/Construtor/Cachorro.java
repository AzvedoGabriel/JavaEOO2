package Construtor;

import java.util.Scanner;

public class Cachorro {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        Raça cachorro = new Raça("Luck");

        System.out.println("Nome: \"" + cachorro.nome + "\" tem " + cachorro.idade + " anos.");

        System.out.println("----------------------------------------------------------------");

        Raça cadela = new Raça("Mel", 2);

        System.out.println("Nome: \"" + cadela.nome + "\" tem " + cadela.idade + " anos.");

    }
}
