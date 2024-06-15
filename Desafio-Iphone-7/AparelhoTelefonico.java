public interface AparelhoTelefonico {
    void ligar(String telefone);
    void desligar();
    void enviarMensagem(String destinatario, String mensagem);
    void receberChamada(String remetente);
}
