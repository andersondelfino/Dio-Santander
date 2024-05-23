public class CaixaEletronico {
    public static void main(String[] args) {
        
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
