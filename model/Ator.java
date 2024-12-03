package model;

public class Ator{
    private int registro;
    private String filePath = "Ator.txt";

    public Ator(int registro) {
        this.registro = registro;
    }


    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String toString() {
        return "registro = " + registro;
    }

    
}