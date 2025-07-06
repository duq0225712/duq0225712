package backend.prova2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Begin {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        //Simulador de biblioteca        
        Scanner sc = new Scanner(System.in);
        int opcao, op;
        String [] nomeLivro = new String[5];
        String [] nomeAutor = new String[5];
        //ArrayList<Pessoa> pessoa = new ArrayList<>();
        ArrayList<Livro> livro = new ArrayList<>();
        Queue<Pessoa> filapessoas = new LinkedList<>(); //fila de espera.
        
        


        do { 
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Cadastrar 5 Livros");
            System.out.println("2. Verificar Disponibilidade de Livros");
            System.out.println("3. Cadastrar  5 Usário");  
            System.out.println("4. pegar Livro emprestado");            
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: "); //System.out.print("\n");

            opcao = sc.nextInt();
            sc.nextLine(); //consumir linha.
            switch (opcao) {
                case 1 -> {
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Digite o nome do Livro "+(i+1)+": ");                       
                        nomeLivro[i] =  sc.nextLine(); //passando posição de i dentro da variavel vetor                        
                        System.out.println("Digite o nome do Autor do Livro: ");
                        nomeAutor[i] = sc.nextLine();
                        //instancia um livro com nome do autor na posição do vetor i                        
                        livro.add(new Livro(nomeAutor[i], nomeLivro[i], true));
                        
                        
                    }
                    
                    System.out.println("Lista de Livros: ");
                    for(Livro l: livro){
                        System.out.println("Nome do Livro: "+l.getAutor());
                        System.out.println("Nome do Autor: "+l.getAutor());
                    }
                }
                case 3 -> {
                    while (!livro.isEmpty()) {
                        for (Pessoa p: filapessoas) {                        
                        for(Livro l: livro){
                            System.out.println("Lista de Livros: ");
                    
                            System.out.println("Nome do Livro: "+l.getTitulo());
                            System.out.println("Nome do Autor: "+l.getAutor());

                            if(l.isDisponivel()==false){
                                filapessoas.add(p);                                
                            }

                        
                    

                            if(l.isDisponivel()){
                                l.emprestarLivro(p);
                            }
                               
                                
                        }
                        
                    }
                        
                    }
                }
                case 2 -> {
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Digite o nome da Pessoa "+(i+1)+": ");
                        String nomePessoa = sc.nextLine();
                        filapessoas.add(new Pessoa(nomePessoa));
                    }                    
                }
                case 4 -> {
                    for (Pessoa p: filapessoas) {
                        
                        for(Livro l: livro){
                            if(l.isDisponivel()){
                                l.emprestarLivro(p);
                            }
                               
                                
                        }
                        
                    }
                }
                case 0 -> {
                }
                default -> System.out.println("Opção inválida. Tente Novamente.");
            }

        } while (opcao!=0);


        sc.close();
    }

}
