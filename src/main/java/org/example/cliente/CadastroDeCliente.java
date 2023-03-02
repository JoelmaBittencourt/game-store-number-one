package org.example.cliente;

public class CadastroDeCliente {
    public static void main(String[] args) {
        Cliente joana = new Cliente();

        joana.setNome("joana");
        joana.setCpf("2458748");
        joana.setEmail("joana@example.com");

        joana.informacoesDoCliente();
        joana.verificaCadastro();


    }
}