package JavaBeans;

public class LocalBean {
// precisa de um construtor default
    private String nome;
    private int ano;

    public LocalBean(){

    }

    // setter ( para modificar, atributo de configuranção ele recebe o argumento para define
    // e getter ( para recuperar, retorna o tipo de dado )

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAno() {
        return  ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
}
