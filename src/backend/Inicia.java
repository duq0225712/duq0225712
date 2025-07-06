package backend;
import java.util.ArrayList;
import java.util.Scanner;

public class Inicia {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // instancia de lista de vetores do tipo aluno
        ArrayList<Aluno> aluno = new  ArrayList<>();

        //testeando enviar e ver se aparece alguma mudança

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua nota: ");
            double nota = sc.nextDouble();
            aluno.add(new Aluno(nome, nota)); 
            sc.nextLine();        
            
        }
        sc.close();
        
        System.out.println("Lista de Alunos: ");
        for (Aluno a : aluno) {
            if(a.getNota() >= 7){
                System.out.println("Aluno " + a.getNome() + " Nota: "+ a.getNota()+ " aprovado!");
            }
            else{
                System.out.println("Aluno " + a.getNome() + " Nota: "+ a.getNota()+ " reprovado.");
            }
        }


    }

}
