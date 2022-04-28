package EncapsuModifideAcessoPublicEPrivate;

public class Local {

    private String nome;
    private int distancia;

    public Local(int distancia, String nome){
        this.nome = nome;
        this.distancia = distancia;
    }

    public String obterNome(){
        return this.nome;
    }
    public int obterDistancia(){

        return this.distancia;
    }

    public void mudarDistancia(int distancia){

        this.distancia = distancia;
    }

    public void mudarNome(String nome){
        this.nome = nome;
    }


    double longe = distancia - distancia;
}