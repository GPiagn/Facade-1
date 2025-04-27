package br.fastfood.model;

public class Burger implements ItemCombo{

    private String nome;
    private double preco;
    private static Burger burger;

    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public static Burger bigCheddar() {
        if (burger == null) {
            burger = new Burger("Cheddar",25.5);
        }
        return burger;
    }

    public static Burger chickenCrispy() {
        if (burger == null) {
            burger = new Burger("Chicken Crispy",32.5);
        }
        return burger;
    }

    public static Burger eggFish(){
        if (burger == null) {
            burger = new Burger("Egg Fish",35.6);
        }
        return burger;
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
