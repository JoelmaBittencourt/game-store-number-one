package org.example.produto;

public class Produto {

    private String nome;
    private String descricao;
    private double preco;

    public Produto(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double somarTotal() {
        return aplicarDesconto(this.preco / 100 * 15);
    }

    public double aplicarDesconto(double desconto) {
        return this.preco -= desconto;
    }

    void informacoesDoProduto() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("preço: " + this.preco);

    }

}

