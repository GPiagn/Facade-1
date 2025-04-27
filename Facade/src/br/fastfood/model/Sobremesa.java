package br.fastfood.model;

public class Sobremesa implements ItemCombo{
    private String nome;
    private double preco;
    private static Sobremesa sobremesa;

    public Sobremesa(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Sobremesa casquinha() {
        if (sobremesa == null) {
            sobremesa = new Sobremesa("Casquinha",2);
        }
        return sobremesa;
    }

    public static Sobremesa sunday() {
        if (sobremesa == null) {
            sobremesa = new Sobremesa("Sunday",6.5);
        }
        return sobremesa;
    }

    public static Sobremesa tortinha() {
        if (sobremesa == null) {
            sobremesa = new Sobremesa("Tortinha",2.5);
        }
        return sobremesa;
    }

    @Override
    public String getNome() {
        return "";
    }

    @Override
    public double getPreco() {
        return 0;
    }

    @Override
    public String toString() {
        return nome + " R$" + preco;
    }


}
