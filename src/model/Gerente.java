package src.model;

import src.interfaces.ICamareira;
import src.interfaces.IRecepcionista;

public class Gerente extends Pessoa implements ICamareira, IRecepcionista{

    public Gerente(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
       
    }

    @Override
    public void atenderOTelefone() {
       System.out.println("Sei atender o telefone mais ou menos");
       System.out.println();
    }

    @Override
    public void falarIngles() {
        System.out.println("Sei falar ingles mais ou menos");
        System.out.println();
    }
    

    @Override
    public void arrumarACama() {
        System.out.println("Sei arrumar a cama mais ou menos, mas vamo!");
        System.out.println();
        
    }

    @Override
    public void limparQuarto() {
        System.out.println("Sei limpar o quarto mais ou menos tb, mas boora");
        System.out.println();
        
    }
    
}
