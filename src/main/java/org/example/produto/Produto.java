package org.example.produto;

public class Produto {

    private String nome;
    private String descricao;
    private double preco;


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

    void informacoesDoProduto() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("preço: " + this.preco);

    }

    public double somarTotal() {
        return aplicarDesconto(this.preco / 100 * 15);
    }

    public double aplicarDesconto(double desconto) {
        return this.preco -= desconto;
    }

    public boolean verificaMaiorDeIdade(int idade) {
        if (idade < 18)
            System.out.println("Precisa ser maior que 18 anos");
        return false;
    }
}

