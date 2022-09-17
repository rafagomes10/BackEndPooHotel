package src.model;

public enum EnumTipo {

    BASICO("Basico"),
    MASTER("Master"), 
    PRESIDENCIAL("Suite Presidencial");
    
    private String valor;
    private EnumTipo(String valor){
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
