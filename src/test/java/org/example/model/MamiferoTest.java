package org.example.model;

import org.junit.Test;


public class MamiferoTest {

    @Test
    public void testingMamifero() {
        Mamifero leao = new Mamifero("Leão", 5, "Pelagem curta");
        Mamifero urso = new Mamifero("Urso", 7, "Pelagem densa");
        Mamifero coelho = new Mamifero("Coelho", 2, "Pelagem macia");

        System.out.println("Detalhes do Leão:");
        System.out.println("Nome: " + leao.getNome());
        System.out.println("Idade: " + leao.getIdade());
        System.out.println("Tipo de pelo: " + leao.getTipoPelo());

        System.out.println("\nDetalhes do Urso:");
        System.out.println("Nome: " + urso.getNome());
        System.out.println("Idade: " + urso.getIdade());
        System.out.println("Tipo de pelo: " + urso.getTipoPelo());

        System.out.println("\nDetalhes do Coelho:");
        System.out.println("Nome: " + coelho.getNome());
        System.out.println("Idade: " + coelho.getIdade());
        System.out.println("Tipo de pelo: " + coelho.getTipoPelo());


        assert leao.getNome().equals("Leão");
        assert leao.getIdade() == 5;
        assert leao.getTipoPelo().equals("Pelagem curta");

        assert urso.getNome().equals("Urso");
        assert urso.getIdade() == 7;
        assert urso.getTipoPelo().equals("Pelagem densa");

        assert coelho.getNome().equals("Coelho");
        assert coelho.getIdade() == 2;
        assert coelho.getTipoPelo().equals("Pelagem macia");

        System.out.println("Teste de Mamífero passou com sucesso.");

    }

}