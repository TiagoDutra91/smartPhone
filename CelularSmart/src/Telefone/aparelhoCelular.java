package Telefone;

public class aparelhoCelular implements telefone{

    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atendendo Ligação");
    }

    
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz");
    
    }
    
}
