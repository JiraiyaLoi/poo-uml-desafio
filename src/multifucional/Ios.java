package multifucional;
import recursos.internet.NavegadorInternet;
import recursos.musica.ReprodutorMusical;
import recursos.telefone.AparelhoTelefonico;

public class Ios implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    
    public static void main(String[] args) {
    



    }

    @Override
    public void ligar(String numero) {       
        System.out.println("Ligando para: " + numero + " via classe telefone via IOS - Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo IOS - Iphone");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz via IOS - Iphone");
       
    }

    @Override
    public void tocar() {
        System.out.println("Tocando IOS - Iphone");
       
    }

    @Override
    public void pausar() {
        System.out.println("Pausando via iphone");
       
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando Musica " + musica + " via Ios - Iphone");
        
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página via Ios - Iphone");
        
    }

    @Override
    public void adcionarNovaAba() {
        System.out.println("Adicionando Página via Ios - Iphone");
       
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Página: " + url +  " via Ios - Iphone");
       
    }
}
