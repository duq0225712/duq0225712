
import java.util.Scanner;

public class prova2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  //entrada de dados
        double mediaMelhor = 0, mediaPior = 10;  //declaração de variaveis
        String nomeMelhor = "", nomePior = "";

        for (int aluno = 0; aluno < 10; aluno++) { //laço de repetição de 10 alunos.
            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();
            double soma = 0;

            for (int n = 0; n < 4; n++) { //  entrada de 4 notas para cada aluno.
                System.out.println("Digite a nota: ");
                double nota = scanner.nextDouble();
                soma += nota;
            }
            scanner.nextLine(); // Limpa o buffer

            double media = soma / 4; //calculo de media.

            if (media >= 7) { //verifica se aluno possui media maior ou igual 7
                System.out.println("Aprovado!");
            } else if (media >= 5) { //verifica se aluno possui media maior ou igual a 5
                System.out.println("Recuperação!");
            } else {
                System.out.println("Reprovado!"); // se todos os testes anteriores não forem atendidos. 
            }

            if (media > mediaMelhor) { // verifica aluno com  melhor media.
                mediaMelhor = media;
                nomeMelhor = nome;
            }
            if (media < mediaPior) {// verifica aluno com pior media.
                mediaPior = media;
                nomePior = nome;
            }
        }
        //abaixo exibe aluno com melhor e pior media.
        System.out.println("Melhor Aluno foi: " + nomeMelhor);
        System.out.println("Média foi: " + mediaMelhor);
        System.out.println("-----------------------------------------");
        System.out.println("Pior Aluno foi: " + nomePior);
        System.out.println("Média foi: " + mediaPior);
        scanner.close(); // fechar entrada de dados

    }
}
