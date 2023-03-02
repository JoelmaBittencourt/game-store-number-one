package org.example.produto;

public class CadastroDeProduto {
    public static void main(String[] args) {
        var jogo = new Produto();


        jogo.setNome("Mario");
        jogo.setDescricao("""
                O jogador controla o principal protagonista da série, Mario. O objetivo do jogo é\s
                percorrer o Reino do Cogumelo (Mushroom Kingdom), sobreviver às forças do vilãoprincipal,\s
                Bowser, e salvar a Princesa Peach (na época conhecida por seu nome americano, Princess Toadstool) \s
                e seu reino do domínio dos Koopa Troopas.""");
        jogo.setPreco(20.00);


        System.out.println("nome " + jogo.getNome());
        System.out.println("Descrição " + jogo.getDescricao());
        System.out.println("Preço " + jogo.getPreco());
        System.out.println("Total " + jogo.somarTotal());


    }
}