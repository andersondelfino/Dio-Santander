public class TiposVariaveis {
   
    public static void main(String[] args) throws Exception {
        
        /*representação de Strings */
        String meuNome = "Anderson";
        
        double salarioMinimo = 2500;

        short numeroCurto =1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        /*A variavel vai ser aletrada normalmente */
        numero = 10;

        System.out.println(numero);

        final double VALOR_DE_PI =3.14;
        /*O valor de PI nao vai ser aletrado, pois a variavel foi declarada com "final" */
        
    
    }
}
