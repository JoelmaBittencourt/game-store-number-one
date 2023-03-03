package org.example.produto;

public class CadastroDeJogo {
    public static void main(String[] args) {
        var jogoDoMario = new Produto("jogoDoMario do mario", "\n" +
                "                O jogador controla o principal protagonista da série, Mario. O objetivo do jogoDoMario é\\s\n" +
                "                percorrer o Reino do Cogumelo (Mushroom Kingdom), sobreviver às forças do vilãoprincipal,\\s\n" +
                "                Bowser, e salvar a Princesa Peach (na época conhecida por seu nome americano, Princess Toadstool) \\s\n" +
                "                e seu reino do domínio dos Koopa Troopas.", 50.00);


        System.out.println("Nome do jogoDoMario: " + jogoDoMario.getNome() + "\n" +
                "Descrição: " + jogoDoMario.getDescricao() + "\n" + "Preço: R$" + jogoDoMario.getPreco());

       System.out.println("Valor com desconto: R$" + jogoDoMario.somarTotal());



   var jogoDoSonic = new Produto("Jogo do Sonic",  45.00);

        System.out.println(jogoDoSonic.getNome());
        System.out.println(jogoDoSonic.getPreco());
    }

}