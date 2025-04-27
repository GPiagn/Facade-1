package br.fastfood.model;

public class Bebida implements ItemCombo{

    private String nome;
    private double preco;
    private static Bebida bebida;

    public Bebida(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Bebida coca() {
        if (bebida == null) {
            bebida = new Bebida("Coca",5.5);
        }
        return bebida;
    }

    public static Bebida Milkshake() {
        if (bebida == null) {
            bebida = new Bebida("Milkshake",5.5);
        }
        return bebida;
    }

    public static Bebida suco() {
        if (bebida == null) {
            bebida = new Bebida("Suco",6.5);
        }
        return bebida;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " R$" + preco;
    }
}
