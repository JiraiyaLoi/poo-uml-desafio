package recursos.telefone;

public class Telefone implements AparelhoTelefonico {

    public void ligar(String numero){
 
        System.out.println("Ligando para: " + numero + " via classe telefone");

    }
    public void atender(){

        System.out.println("Atendendo via classe telefone");

    }
    public void iniciarCorreioVoz(){

        System.out.println("Correio de voz iniciado via classe telefone");

    }
    
    
}
