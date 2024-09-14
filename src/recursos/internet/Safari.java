package recursos.internet;

public class Safari implements NavegadorInternet {

    public void exibirPagina(String url) {

        System.out.println("Exibindo Página: " + url + " via classe Safari");

    }

    public void adcionarNovaAba() {

        System.out.println("Adicionando nova aba via classe Safari");

    }

    public void atualizarPagina() {

        System.out.println("Atualizando Página via classe Safari");

    }

}
