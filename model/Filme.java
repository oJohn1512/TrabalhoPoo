package model;

public class Filme {
    private int idFilme;
    private String titulo;
    private int classificacao;
    private Genero genero;
    private String status;
    private String filePath = "Filme.txt";

    public Filme(int classificacao, Genero genero, int idFilme, String status, String titulo) {
        this.classificacao = classificacao;
        this.genero = genero;
        this.idFilme = idFilme;
        this.status = status;
        this.titulo = titulo;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String toString() {
        return "idFilme = " + idFilme + ", titulo = " + titulo + ", classificacao = " + classificacao + ", genero = "
                + genero + ", status = " + status;
    }


    
}
