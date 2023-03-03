package org.example.produto;

public class CadastroDeVideoGame {

    public static void main(String[] args){
        var psFive = new Produto();

        psFive.setNome("Play Station 5");
        psFive.setPreco(100.00);
        psFive.setDescricao("O PlayStation 5 é a aposta da Sony para a geração de consoles \n" +
              "  de lançados em 2020. O videogame pode ser encontrado em duas versões, uma \n" +
              "  sem leitor de mídia física e outra com entrada para mídia física, sendo \n" +
              "  a primeira a mais barata.");


        psFive.informacoesDoProduto();

    }
}
