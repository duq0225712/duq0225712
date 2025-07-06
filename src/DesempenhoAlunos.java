import java.util.Scanner;

public class DesempenhoAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[3];
        double[][] notas = new double[3][4];
        double[] medias = new double[3];

        String melhorAluno = "", piorAluno = "";
        double melhorMedia = -1, piorMedia = 11;



        for (int i = 0; i < 3; i++) {

            while (true) { 
                System.out.print("Digite o nome do aluno " + (i + 1) + ": \u001B[34m");
                String nomeDigitado = input.nextLine();
                System.out.print("\u001B[0m"); // Reseta a cor

                // Verifica se contém apenas letras e espaços
                if (nomeDigitado.matches("[a-zA-ZÀ-ÿ\\s]+")) {
                    nomes[i] = nomeDigitado;
                    break; // nome válido, sai do while
                } else {
                    System.out.println("Nome inválido! Digite apenas letras.");
                }
            }
           // System.out.print("Digite o nome do aluno " + (i + 1) + ": \u001B[34m");            
            //nomes[i] = input.nextLine();
                
            

            double soma = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("\u001B[0m Digite a nota " + (j + 1) + " do aluno \u001B[1m\u001B[34m"+ nomes[i] + "\u001B[0m: ");
                notas[i][j] = input.nextDouble();
                soma += notas[i][j];
            }
            input.nextLine(); // Limpar o buffer

            medias[i] = soma / 4.0;

            System.out.printf("Média de \u001B[34m%s\u001B[0m: %.2f - ", nomes[i], medias[i]);
            if (medias[i] >= 7) {
                System.out.println("\u001B[32m\u001B[1mAprovado\u001B[0m");
            } else if (medias[i] >= 5) {
                System.out.println("\u001B[33m\u001B[1mRecuperação\u001B[0m");
            } else {
                System.out.println("\u001B[31m\u001B[1mReprovado\u001B[0m");
            }

            // Atualizar melhor e pior aluno
            if (medias[i] > melhorMedia) {
                melhorMedia = medias[i];
                melhorAluno = nomes[i];
            }

            if (medias[i] < piorMedia) {
                piorMedia = medias[i];
                piorAluno = nomes[i];
            }

            System.out.println("----------------------------------");
        }

        // Mostrar melhor e pior desempenho
        System.out.println("\u001B[32m Aluno com melhor desempenho: " + melhorAluno + " - Média: " + melhorMedia);
        System.out.println("\u001B[31m Aluno com pior desempenho: " + piorAluno + " - Média: " + piorMedia+"\u001B[0m");

        input.close();
    }
}