package br.fastfood.model;

public class Combo {
    private ItemCombo burger;
    private ItemCombo bebida;
    private ItemCombo sobremesa;
    private static Combo icombo;

    public Combo(ItemCombo burger, ItemCombo bebida, ItemCombo sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public static Combo getItensCombo1() {
        if (icombo == null) {
            icombo = new Combo(Burger.bigCheddar(),Bebida.coca(),Sobremesa.casquinha());
        }
        return icombo;
    }

    public static Combo getItensCombo2() {
        if (icombo == null) {
            icombo = new Combo(Burger.chickenCrispy(),Bebida.suco(), Sobremesa.tortinha());
        }
        return icombo;
    }

    public static Combo getItensCombo3() {
        if (icombo == null) {
            icombo = new Combo(Burger.eggFish(),Bebida.Milkshake(),Sobremesa.sunday());
        }
        return icombo;
    }

    public double getPrecoTotal(){
        return burger.getPreco()+bebida.getPreco()+sobremesa.getPreco();
    }

    @Override
    public String toString() {
        return "Burger: " + burger + "\nBebida: " + bebida + "\nSobremesa: " + sobremesa;
    }
}
