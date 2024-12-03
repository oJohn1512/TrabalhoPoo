package service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CrudGenerico<T> {
    public String arquivo;

    public CrudGenerico(String arquivo) {
        this.arquivo = arquivo;
    }
    public CrudGenerico() {
        this.arquivo = "";
    }


    public String caminhoArquivo(String arquivo) {
        return "C:\\Users\\João Otávio\\Desktop\\TrabalhoPoo\\dados\\" + arquivo;
    }

    public void cadastrar(T criarObjeto, String arquivo) {
        try  {
            FileWriter fw = new FileWriter(caminhoArquivo(arquivo), true);
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(criarObjeto.toString());
            writer.newLine();
            System.out.println("Criado com sucesso");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<String> listar(String arquivo){
        try {
            FileReader fr = new FileReader(caminhoArquivo(arquivo));
            BufferedReader reader = new BufferedReader(fr);
            String linha;
            List<String> listaObjetos = new ArrayList<>();
            while ((linha = reader.readLine()) !=null){
                listaObjetos.add(linha);
            }
            reader.close();
            return listaObjetos;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String consultar(int id, String arquivo) {
        try {
            FileReader fr = new FileReader(caminhoArquivo(arquivo));
            BufferedReader reader = new BufferedReader(fr);
            String linha;
            List<String> listaObjetos = new ArrayList<>();
            while ((linha = reader.readLine()) !=null){
                listaObjetos.add(linha);
            }
            reader.close();
            System.out.println(listaObjetos.get(id - 1));
            return listaObjetos.get(id - 1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public void editar(int id,T novoObjeto, String arquivo){
        try { FileReader fwReader = new FileReader(caminhoArquivo(arquivo));
        BufferedReader reader = new BufferedReader(fwReader);
        FileWriter fwWriter = new FileWriter(caminhoArquivo(arquivo));
        BufferedWriter writer = new BufferedWriter(fwWriter);
        String linha;
        boolean atualizado = false;
        while ((linha = reader.readLine()) != null) {
            if (linha.startsWith(id + ",")) {
                writer.write(novoObjeto.toString());
                atualizado = true;
            } else {
                writer.write(linha);
            }
            writer.newLine();
        }
            reader.close();
            writer.close();
            System.out.println("Atualizado com sucesso");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

        /*
        public String consultar(String arquivo, int id) {
        try {
        List<String> listaObjetos = listar(arquivo);
        System.out.println(listaObjetos.get(id));
        return listaObjetos.get(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
*/




