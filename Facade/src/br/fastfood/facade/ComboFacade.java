package br.fastfood.facade;

import br.fastfood.model.Combo;

public class ComboFacade {

    private Combo combo=null;

    public void criarCombo(int x){
        switch (x){
            case 1:
                combo=Combo.getItensCombo1();
                break;
            case 2:
                combo=Combo.getItensCombo2();
                break;
            case 3:
                combo=Combo.getItensCombo3();
                break;
            default:
                System.out.println("Combo não existente");
                break;
        }
    }

    public void exibirItens() {
        if(combo!=null)
            System.out.println(combo);
        else
            System.out.println("Combo Inválido");
    }

    public double getPrecoTotal(){
        if(combo!=null)
            return combo.getPrecoTotal();
        else
            return 0;
    }
}


