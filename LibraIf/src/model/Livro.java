package model;

/**
 * O gerenciamento dos livros serão realizados aqui
 */

public class Livro {
    private String titulo;
    private String ISBN;
    private String autor;
    private boolean disponivel;

    /* Definindo os Getter */
    public String getAutor() {
        return autor;
    }
    
    public String getISBN() {
        return ISBN;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }
    
    /*Definindo os Setters */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
}
