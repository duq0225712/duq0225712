import java.util.Scanner;

public class otimizado {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] nomes = new String[3];
        double[][] notas = new double[3][4];
        double[] medias = new double[3];

        String melhorAluno = "", piorAluno = "";
        double melhorMedia = -1, piorMedia = 11;

        for (int i = 0; i < 3; i++) {

            // Leitura e validação do nome
            while (true) {
                System.out.print("Digite o nome do aluno " + (i + 1) + ": \u001B[34m");
                String nomeDigitado = input.nextLine();
                System.out.print("\u001B[0m"); // Reseta a cor

                if (nomeDigitado.matches("[a-zA-ZÀ-ÿ\\s]+")) {
                    nomes[i] = nomeDigitado;
                    break;
                } else {
                    System.out.println("\u001B[31mNome inválido! Digite apenas letras.\u001B[0m");
                }
            }

            double soma = 0;

            // Leitura e validação das notas
            for (int j = 0; j < 4; j++) {
                while (true) {
                    System.out.print("\u001B[0mDigite a nota " + (j + 1) + " do aluno \u001B[1m\u001B[34m" + nomes[i] + "\u001B[0m: ");

                    if (input.hasNextDouble()) {
                        double nota = input.nextDouble();
                        if (nota >= 0 && nota <= 10) {
                            notas[i][j] = nota;
                            soma += nota;
                            break;
                        } else {
                            System.out.println("\u001B[31mNota inválida! Digite um valor entre 0 e 10.\u001B[0m");
                        }
                    } else {
                        System.out.println("\u001B[31mEntrada inválida! Digite um número.\u001B[0m");
                        input.next(); // consome a entrada inválida
                    }
                }
            }

            input.nextLine(); // Limpar o buffer

            // Cálculo da média
            medias[i] = soma / 4.0;

            // Exibição do resultado
            System.out.printf("Média de \u001B[34m%s\u001B[0m: %.2f - ", nomes[i], medias[i]);
            if (medias[i] >= 7) {
                System.out.println("\u001B[32m\u001B[1mAprovado\u001B[0m");
            } else if (medias[i] >= 5) {
                System.out.println("\u001B[33m\u001B[1mRecuperação\u001B[0m");
            } else {
                System.out.println("\u001B[31m\u001B[1mReprovado\u001B[0m");
            }

            // Atualização de melhor e pior aluno
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

        // Exibição final
        System.out.println("\u001B[32mAluno com melhor desempenho: " + melhorAluno + " - Média: " + melhorMedia);
        System.out.println("\u001B[31mAluno com pior desempenho: " + piorAluno + " - Média: " + piorMedia + "\u001B[0m");

        input.close();
    }
}