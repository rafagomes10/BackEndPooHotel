import java.util.ArrayList;

import src.model.Camareira;
import src.model.Cliente;
import src.model.EnumTipo;
import src.model.Gerente;
import src.model.Quarto;
import src.model.Recepcionista;

public class App {
    public static void main(String[] args) {
        System.out.println("Hotel Java");
        System.out.println();


        // Recepcionista recepcionista1 = new Recepcionista("Andreia","21-3322-1443", "223.343.343-23");

        // recepcionista1.atenderOTelefone();
        // recepcionista1.falarIngles();

        // Camareira camareira1 = new Camareira("Joana", "21-33331235332", "234.434.434-34");

        // camareira1.arrumarACama();
        // camareira1.limparQuarto();

        // Gerente gerente1 = new Gerente("Fabio", "21-24222-34343", "155.334.976-98");

        // gerente1.atenderOTelefone();
        // gerente1.falarIngles();
        // gerente1.arrumarACama();
        // gerente1.limparQuarto();

        // Quarto quarto1 = new Quarto();
        // quarto1.setNumero("207B");
        // quarto1.setValor(100.0);
        // quarto1.setTipo(EnumTipo.BASICO);

        // Quarto quarto2 = new Quarto();
        // quarto2.setNumero("1037B");
        // quarto2.setValor(100.0);
        // quarto2.setTipo(EnumTipo.PRESIDENCIAL);

        // System.out.println(quarto2.getTipo());
        // System.out.println(quarto2.getTipo().getValor());


        Cliente cliente1 = new Cliente("Manoel da Silva", "21-3331334343", "122.453.234-56", 42);
        Cliente cliente2 = new Cliente("Fulano de tal", "21-3111334343", "678.453.234-56", 21);
        Cliente cliente3 = new Cliente("Ciclano Silva", "21-343334343", "188.453.234-56", 36);
        Cliente cliente4 = new Cliente("julao Costa", "21-3355343", "333.453.234-56", 56);

        ArrayList <Cliente> clientes = new ArrayList<Cliente>();

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        

  

        
    }
    
}
  