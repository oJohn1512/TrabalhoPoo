package model;

public class Assento extends SalaAssento{
    private int idAssento;
    private TipoAssento tipoAssento;
    private String filePath = "Assento.txt";
    
    public Assento(int idSalaAssento, Assento assento, Sala sala, int idAssento, TipoAssento tipoAssento) {
        super(idSalaAssento, assento, sala);
        this.idAssento = idAssento;
        this.tipoAssento = tipoAssento;
    }

    public int getIdAssento() {
        return idAssento;
    }

    public void setIdAssento(int idAssento) {
        this.idAssento = idAssento;
    }

    public TipoAssento getTipoAssento() {
        return tipoAssento;
    }

    public void setTipoAssento(TipoAssento tipoAssento) {
        this.tipoAssento = tipoAssento;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String toString() {
        return "idAssento = " + idAssento + ", tipoAssento = " + tipoAssento;
    }

    
}
