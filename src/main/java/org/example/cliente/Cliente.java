package org.example.cliente;

public class Cliente {

    private String nome;
    private String email;
    private String cpf;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
        System.out.println("ola");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    boolean informacoesDoCliente() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("email: " + this.email);

        return false;
    }

    void verificaCadastro() {
        if (this.cpf == null) {
            System.out.println("CPF não cadastrado, informação: " + this.cpf);
        }
    }
}
