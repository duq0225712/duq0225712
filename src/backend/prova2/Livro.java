package backend.prova2;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel;
    private Pessoa emprestadoPara;



    public Livro(String nomeAutor, String nomeLivro, boolean disponivel) {
        this.autor = nomeAutor;        
        this.titulo = nomeLivro;
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestarLivro(Pessoa pessoa){   //metodo passando para false tornando não acessivel
        this.disponivel = false;
    }
    

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Livro{");
        sb.append("titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", disponivel=").append(disponivel);
        sb.append('}');
        return sb.toString();
    }

}
