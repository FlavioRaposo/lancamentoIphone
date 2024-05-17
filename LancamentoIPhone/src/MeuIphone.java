public class MeuIphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {

        System.out.printf("Seja bem vindo ao SO iphone\n");

        ReprodutorMusical Spotify = new MeuIphone();

        Spotify.tocar();
        Spotify.pausar();
        Spotify.selecionarMusica();


        AparelhoTelefonico chamadas = new MeuIphone();
        chamadas.ligar();
        chamadas.atender();
        chamadas.usarCorreioVoz();

        NavegadorInternet crhome = new MeuIphone();
        crhome.exibirPagina();
        crhome.adicionarAba();
        crhome.atualizarPagina();
    }

    public void tocar() { System.out.println("Tocando musica");  }
    public void pausar() {
        System.out.println("musica pausada");
    }
    public void selecionarMusica() {
        System.out.println("modificando faixas");
    }


    public void ligar() { System.out.println("fazendo ligação");   }
    public void atender() { System.out.println("atedendo ligação");   }
    public void usarCorreioVoz() { System.out.println("guardando mensagens de voz"); }


    public void exibirPagina() { System.out.println("exibindo pagina"); }
    public void adicionarAba() { System.out.println("adicionando pagina"); }
    public void atualizarPagina() {System.out.println("atualizando pagina"); }


}