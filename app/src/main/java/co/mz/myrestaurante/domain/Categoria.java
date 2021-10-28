package co.mz.myrestaurante.domain;

import java.io.Serializable;

public class Categoria implements Serializable {

    private String id;
    private String Cor;
    private String nome;

    public Categoria() {
    }

    public Categoria(String cor, String nome) {
        Cor = cor;
        this.nome = nome;
    }

    public Categoria(String id, String cor, String nome) {
        this.id = id;
        Cor = cor;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", Cor='" + Cor + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
