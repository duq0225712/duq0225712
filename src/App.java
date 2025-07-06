import java.util.Scanner;

public class App {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
       // JOptionPane.showMessageDialog(null, "Dig din dig din"); //impressão na tela
        //JOptionPane.showInputDialog("Digite algo: "); //entrada de dados 

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];
        double[][] notas = new double[3][2];
        double[] medias = new double[3];

        // Coletando os dados dos alunos
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o nome do aluno " + (i + 1) + "° :");
            nomes[i] = scanner.nextLine();

            for (int j = 0; j < 2; j++) {
                System.out.println("Digite a nota " + (j + 1) + "ª de " + nomes[i] + ":");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Limpa o buffer
        }

        // Calculando e exibindo as médias
        System.out.println("\n--- Médias dos Alunos ---");
        for (int i = 0; i < 3; i++) {
            medias[i] = (notas[i][0] + notas[i][1]) / 2;
            System.out.println(nomes[i] + " - Média: " + medias[i]);
        }

        scanner.close();
        
        
    }
}
