package Desafio;

import java.util.Scanner;

public class Loja {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do lote. ");
        double valor = scan.nextDouble();

        Fornecedor peça = new Fornecedor();
        peça.setNome("Aquisição de RTX");

        Fornecedor local = new Fornecedor();
        local.setNome("Tech e Cia");

        ContaPagar conta1 = new ContaPagar(valor);
        conta1.setDescricao("Placas Graficas RTX");
        conta1.setValor();
        conta1.setVencimento("12/05/2022");
        conta1.setFornecedor(local.getNome());

        System.out.println(local.getNome() + " Compra feita no valor de: " + conta1.getValor() +  " sobre: " + conta1.getDescricao() + " para o vencimento de: "
                + conta1.getDataVencimento());


    }
}
