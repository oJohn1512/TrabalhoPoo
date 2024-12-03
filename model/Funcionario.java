package model;

import java.sql.Date;
import java.time.LocalDate;

public class Funcionario {
    private int matricula;
    private LocalDate horarioTrabalho;
    private String filePath = "Funcionario.txt";
    
    public Funcionario(int matricula, LocalDate horarioTrabalho) {
        this.matricula = matricula;
        this.horarioTrabalho = horarioTrabalho;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getHorarioTrabalho() {
        return horarioTrabalho;
    }

    public void setHorarioTrabalho(LocalDate horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String toString() {
        return "matricula = " + matricula + ", horarioTrabalho = " + horarioTrabalho;
    }
}
