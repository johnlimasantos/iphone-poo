public class Main {
    public static void main(String[] args) {
        // Criando um objeto iPhone
        iPhone iphone = new iPhone();

        // Usando o ReprodutorMusical
        iphone.selecionarMusica("Let it be");
        iphone.tocar();
        iphone.pausar();

        // Usando o AparelhoTelefonico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Usando o NavegadorInternet
        iphone.exibirPagina("https://www.apple.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
