package This;

import java.util.Scanner;

public class Exemplothis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Escola escola = new Escola();

        System.out.println("Informe o nome do colegio: ");
        escola.nome = scan.nextLine();

        System.out.print("Escola que ele estuda: " + escola.nome);
        scan.nextLine();

        System.out.println("Informe a nova escola: ");
        escola.nome = scan.nextLine();

        escola.alterarNome(escola.nome);

        System.out.print("Escola que ele vai estudar: " + escola.nome);

        scan.close();
    }
}
