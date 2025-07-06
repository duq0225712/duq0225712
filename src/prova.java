
import javax.swing.JOptionPane;

public class prova {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        double[][] notas = new double[3][4];
        double[] medias = new double[3];

        String melhorAluno = "", piorAluno = "";
        double melhorMedia = -1, piorMedia = 11;

        for (int i = 0; i < 3; i++) {

            //JOptionPane.showMessageDialog(null, "Digite o nome do aluno " + (i + 1) + ": ");
            //System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do aluno " + (i + 1) + ": ");
            //nomes[i] = input.nextLine();

            double soma = 0;
            for (int j = 0; j < 4; j++) {
                notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (j + 1) + " do aluno " + nomes[i] + ": "));
                //System.out.print("Digite a nota " + (j + 1) + " do aluno " + nomes[i] + ": ");
               // notas[i][j] = input.nextDouble();
                soma += notas[i][j];
            }
            //input.nextLine(); // Limpar o buffer

            medias[i] = soma / 4.0;
            
             JOptionPane.showMessageDialog(null, "Média de "+ nomes[i] +" = "+ medias[i]);
            //System.out.printf("Média de %s: %.2f - ", nomes[i], medias[i]);
            if (medias[i] >= 7) {
                JOptionPane.showMessageDialog(null, "Aprovado");
                //System.out.println("Aprovado");
            } else if (medias[i] >= 5) {
                JOptionPane.showMessageDialog(null, "Recuperação");
                //System.out.println("Recuperação");
            } else {
                JOptionPane.showMessageDialog(null, "Reprovado");
                //System.out.println("Reprovado");
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

           // System.out.println("----------------------------------");
        }

        // Mostrar melhor e pior desempenho

        JOptionPane.showMessageDialog(null, "Aluno com melhor desempenho: " + melhorAluno + " - Média: " + melhorMedia);
        //System.out.println("Aluno com melhor desempenho: " + melhorAluno + " - Média: " + melhorMedia);
        JOptionPane.showMessageDialog(null, "Aluno com pior desempenho: " + piorAluno + " - Média: " + piorMedia);
        //System.out.println("Aluno com pior desempenho: " + piorAluno + " - Média: " + piorMedia);

        //input.close();
    }

}

