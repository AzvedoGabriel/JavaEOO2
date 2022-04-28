package This;

public class Escola {

    String nome;
    String bairro;
    String Cidade;

    int ano = 0;
    int serie = 0;

    void alterarNome(String nome){
        if(nome != null){
            this.nome = nome;
        }
    }
}
