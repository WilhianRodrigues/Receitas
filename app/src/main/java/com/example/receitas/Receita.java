package com.example.receitas;

public class Receita {
    private String nome;
    private String ingredientes;
    private String instrucoes;
    private int imagem;

    public Receita(String nome, String ingredientes, String instrucoes, int imagem) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.instrucoes = instrucoes;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getImagem() {
        return imagem;
    }
}