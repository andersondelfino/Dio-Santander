public class SistemaMedida {
    public static void main(String[] args) {

        /* EXEMPLO DE IF ELSE */

        // String sigla = "A";

        // if(sigla == "P"){
        // System.out.println("PEUQENO");
        // }else if (sigla == "M"){
        // System.out.println("MEDIO");
        // }else if (sigla == "G") {
        // System.out.println("GRANDE");
        // }else{
        // System.out.println("INDEFINIDO");
        // }

        /* TRANSFORMANDO EM SWITCH CASE */

        String sigla = "P";
        switch (sigla) {
            case "P":
                System.out.println("PEQUENO");
                break;
            case "M":
                System.out.println("MEDIO");
                break;
            case "G":
                System.out.println("GRANDE");
                break;
            default:
                System.out.println("INDEFINIDO");
                break;
        }
    }
}
