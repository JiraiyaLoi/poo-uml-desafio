package recursos.musica;

public class Ipod implements ReprodutorMusical {
    public void tocar(){

        System.out.println("Tocando Música via classe Ipod");

    }
    public void pausar(){

        System.out.println("Pausando música via classe Ipod");

    }
    public void selecionarMusica(String musica){

        System.out.println("Tocando: " + musica + " via classe Ipod");

    }
}
