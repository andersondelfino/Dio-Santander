public class ResultadoEscolar {
    public static void main(String[] args) {

        /* Todo texto comentato estão corretos */
        /* exemplo 1 */

        // int nota = 3;

        // if (nota >= 7) {
        // System.out.println("Aprovado");
        // } else if (nota >= 5 && nota < 7) {
        // System.out.println("Recuperação");
        // } else {
        // System.out.println("Reprovado");
        // }

        /* exeplo 2 */

        // int nota = 6;

        // String resultado = nota >=7? "Aprovado" : "Reprovado";

        // System.out.println(resultado);

        /* Exempo 3 */

        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);

    }
}
