package backend;

public class Aluno {
    
    private String nome;
    private double nota;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }


}
