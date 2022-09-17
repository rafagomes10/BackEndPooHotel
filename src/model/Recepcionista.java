package src.model;

import src.interfaces.IRecepcionista;

public class Recepcionista extends Pessoa implements IRecepcionista {

    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
       
    }

    @Override
    public void atenderOTelefone() {
        System.out.println("Eu sei muito bem atender o telefone");
        System.out.println();
        
    }

    @Override
    public void falarIngles() {
        System.out.println("Eu sei falar ingles fluente");
        System.out.println();
        
    }
    
}
