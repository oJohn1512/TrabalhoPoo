package model;

public class TipoAssento {
    private int idTipoAssento;
    private String descricao;
    private String status;
    private String filePath = "TipoAssento.txt";
    
    public TipoAssento(int idTipoAssento, String descricao, String status) {
        this.idTipoAssento = idTipoAssento;
        this.descricao = descricao;
        this.status = status;
    }

    public int getIdTipoAssento() {
        return idTipoAssento;
    }

    public void setIdTipoAssento(int idTipoAssento) {
        this.idTipoAssento = idTipoAssento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return "idTipoAssento = " + idTipoAssento + ", descricao = " + descricao + ", status = " + status;
    }
}
