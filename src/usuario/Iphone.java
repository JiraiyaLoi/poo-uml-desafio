package usuario;

import multifucional.Ios;
import recursos.internet.Safari;
import recursos.musica.Ipod;
import recursos.telefone.Telefone;

public class Iphone {
    public static void main(String[] args) {
        
        //USANDO VIA CLASSES 
        Safari navegar = new Safari();

        navegar.adcionarNovaAba();
        navegar.atualizarPagina();
        navegar.exibirPagina("Google.com");

        Ipod escutar = new Ipod();

        escutar.tocar();
        escutar.pausar();
        escutar.selecionarMusica("Horizonte Azul - Leonardo");

        Telefone telefoneGeral = new Telefone();

        telefoneGeral.ligar("24872874");
        telefoneGeral.atender();
        telefoneGeral.iniciarCorreioVoz();



        //Usando via multifuncional (Ios- Iphone)
        //Tudo vindo de um só lugar

        Ios navegarIphone = new Ios();

        navegarIphone.adcionarNovaAba();
        navegarIphone.atualizarPagina();
        navegarIphone.exibirPagina("Google.com");
      


        Ios iphoneIpod = new Ios();

        iphoneIpod.tocar();
        iphoneIpod.pausar();
        iphoneIpod.selecionarMusica("Horizonte Azul - Leonardo");



        Ios telefoneIphone = new Ios();

        telefoneIphone.ligar("42878274");
        telefoneIphone.atender();
        telefoneIphone.iniciarCorreioVoz();


      




    }
}
