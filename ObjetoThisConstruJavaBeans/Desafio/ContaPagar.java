package Desafio;

public class ContaPagar {

    private double valor;
    private String descricao;
    private String dataVencimento;

    private String fornecedor;

    public ContaPagar(double valor) {
        this.valor = valor;
    }

    public String getDescricao(){
        return descricao;
    }
    public String getFornecedor(){

        return null;
    }

    public double getValor() {
        return valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double setValor(){
        this.valor = valor;
        return valor;
    }

    public void setVencimento(String dataVencimento){
        this.dataVencimento = dataVencimento;
    }

    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }
}
