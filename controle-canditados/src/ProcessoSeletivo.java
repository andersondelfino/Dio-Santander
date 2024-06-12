// import java.util.concurrent.ThreadLocalRandom;

// public class ProcessoSeletivo {
//     public static void main(String[] args) throws Exception {
//         // analisarCandidato(1900.0);
//         // analisarCandidato(2200.0);
//         // analisarCandidato(2000.0);
//         selecaoCandidatos();
//        //imprimirSelecionados();
//     }

// //     static void imprimirSelecionados() {
// //         String[] candidatos = { "JULIA", "PAULO", "AUGUSTO", "DANIELA", "JORGE" };
// //         System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
// //         for (int indice = 0; indice < candidatos.length; indice++) {
// //             System.out.println("O candidato de n° " + (indice + 1) + " é o " + candidatos[indice]);
// //         }

// //         System.out.println("Forma abreviada de interação for each");
// //         for (String candidato : candidatos) {
// //             System.out.println("O candidato selecionado foi " + candidato);
// //         }
// //     }

// //     static void selecaoCandidatos() {
// //         String[] candidatos = { "MONICA", "FABRICIO", "MIRELA", "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO",
// //                 "DANIELA", "JORGE" };

// //         int candidatosSelecionados = 0;
// //         int candidatosAtual = 0;
// //         double salarioBase = 2000.0;
// //         while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
// //             String candidato = candidatos[candidatosAtual];
// //             double salarioPretendido = valorPretendido();

// //             System.out.println("O candidato " + candidato + "Solicitou este valor de salário " + salarioPretendido);
// //             if (salarioBase >= salarioPretendido) {
// //                 System.out.println("O candidato " + candidato + " foi selecionado para vaga ");
// //                 candidatosSelecionados++;
// //             }

// //             candidatosAtual++;
// //         }
// //     }

// //     static double valorPretendido() {
// //         return ThreadLocalRandom.current().nextDouble(1800, 2200);

// //     }

// //     // static void analisarCandidato(double salarioPretendido) {
// //     // double salarioBase = 2000.0;
// //     // if (salarioBase > salarioPretendido) {
// //     // System.out.println("LIGAR PARA O CANDIDATO");
// //     // } else if (salarioBase == salarioPretendido) {
// //     // System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
// //     // } else {
// //     // System.out.println("AGUARDANDO O RESULTADO DEMAIS CANDIDATO");
// //     // }
// //     // }
// // }

/*Codigo corrigido */

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "MONICA", "FABRICIO", "MIRELA", "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO",
                "DANIELA", "JORGE" };

        String[] candidatosSelecionados = new String[5]; // Array para armazenar os nomes dos candidatos selecionados
        int indiceSelecionado = 0; // Índice para acompanhar o número de candidatos selecionados
        double salarioBase = 2000.0;

        System.out.println("Imprimindo a lista de candidatos selecionados:");
        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados[indiceSelecionado] = candidato; // Adiciona o candidato selecionado ao array
                indiceSelecionado++; // Incrementa o índice

                if (indiceSelecionado == 5) {
                    break; // Sai do loop quando todos os 5 candidatos são selecionados
                }
            }
        }

        // Imprime os nomes dos candidatos selecionados
        for (String candidatoSelecionado : candidatosSelecionados) {
            if (candidatoSelecionado != null) {
                System.out.println("Candidatos selecionados " + candidatoSelecionado);
            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
