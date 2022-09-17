package src.model;

import src.interfaces.ICamareira;

public class Camareira extends Pessoa implements ICamareira{

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
        
    }

    @Override
    public void arrumarACama() {
        System.out.println("Eu sei arrumar a cama");
        System.out.println();
        
        
    }

    @Override
    public void limparQuarto() {
        System.out.println("Eu sei muito bem limpar o quarto");
        System.out.println();
        
    }
    
}
