public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner 
        
        //Exibir as mensagens para o nosso usuario 

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada

        double saldo = 15;
        double valorSolicidado = 22;

        

        if ( saldo > valorSolicidado){
            saldo = saldo - valorSolicidado;
        } else{
            System.out.println("Saldo insuficiente");
        }
        System.out.println(saldo);
    }
}
