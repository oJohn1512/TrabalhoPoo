package model;

import java.time.LocalDate;

public class Sessao {
    private int idSessao;
    private LocalDate dataHoraSessao;
    private Filme filme;
    private Sala sala;
    private Funcionario funcionario;
    private String status;
    private String filePath = "Sessao.txt";
    
    
    public Sessao(int idSessao, LocalDate dataHoraSessao, Filme filme, Sala sala, Funcionario funcionario,
            String status) {
        this.idSessao = idSessao;
        this.dataHoraSessao = dataHoraSessao;
        this.filme = filme;
        this.sala = sala;
        this.funcionario = funcionario;
        this.status = status;
    }

    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public LocalDate getDataHoraSessao() {
        return dataHoraSessao;
    }

    public void setDataHoraSessao(LocalDate dataHoraSessao) {
        this.dataHoraSessao = dataHoraSessao;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
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
        return "idSessao = " + idSessao + ", dataHoraSessao = " + dataHoraSessao + ", filme = " + filme + ", sala = "
                + sala + ", funcionario = " + funcionario + ", status = " + status;
    }    
}
