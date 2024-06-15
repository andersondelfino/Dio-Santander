public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos da interface ReprodutorMusical
    
    public void tocar() {
        System.out.println("Iniciando reprodução musical...");
    }

 
    public void pausar() {
        System.out.println("Música pausada.");
    }


    public void parar() {
        System.out.println("Reprodução musical parada.");
    }


    public void avancar() {
        System.out.println("Avançando para a próxima música...");
    }


    public void retroceder() {
        System.out.println("Retrocedendo para a música anterior...");
    }

    // Métodos da interface AparelhoTelefonico

    public void ligar(String telefone) {
        System.out.println("Discando para " + telefone + "...");
    }


    public void desligar() {
        System.out.println("Desligando chamada.");
    }


    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.println("Enviando mensagem para " + destinatario + ": " + mensagem);
    }


    public void receberChamada(String remetente) {
        System.out.println("Recebendo chamada de " + remetente);
    }

    // Métodos da interface NavegadorInternet

    public void abrirURL(String url) {
        System.out.println("Abrindo página: " + url);
    }


    public void fechar() {
        System.out.println("Fechando navegador.");
    }

    // Exemplo de método específico do iPhone
    public void usarFaceTime(String contato) {
        System.out.println("Iniciando chamada FaceTime com " + contato);
    }

    // Método main para teste
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone();

        // Exemplo de uso das interfaces
        meuiPhone.tocar();
        meuiPhone.avancar();
        meuiPhone.ligar("123456789");
        meuiPhone.enviarMensagem("987654321", "Olá! Tudo bem?");
        meuiPhone.abrirURL("https://www.apple.com");
    }


    @Override
    public String toString() {
        return "iPhone []";
    }
}
