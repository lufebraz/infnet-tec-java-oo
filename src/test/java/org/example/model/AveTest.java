package org.example.model;

import org.junit.Test;

public class AveTest {

    @Test
    public void testeDasAves() {
        Ave aguia = new Ave("Águia", 3, 180);
        Ave pinguim = new Ave("Pinguim", 4, 30);
        Ave coruja = new Ave("Coruja", 2, 60);

        System.out.println("Detalhes da Águia:");
        System.out.println("Nome: " + aguia.getNome());
        System.out.println("Idade: " + aguia.getIdade());
        System.out.println("Envergadura das asas: " + aguia.getEnvergaduraAsas() + " cm");

        System.out.println("\nDetalhes do Pinguim:");
        System.out.println("Nome: " + pinguim.getNome());
        System.out.println("Idade: " + pinguim.getIdade());
        System.out.println("Envergadura das asas: " + pinguim.getEnvergaduraAsas() + " cm");

        System.out.println("\nDetalhes da Coruja:");
        System.out.println("Nome: " + coruja.getNome());
        System.out.println("Idade: " + coruja.getIdade());
        System.out.println("Envergadura das asas: " + coruja.getEnvergaduraAsas() + " cm");

        // Teste de assert
        assert aguia.getNome().equals("Águia");
        assert aguia.getIdade() == 3;
        assert aguia.getEnvergaduraAsas() == 180;

        assert pinguim.getNome().equals("Pinguim");
        assert pinguim.getIdade() == 4;
        assert pinguim.getEnvergaduraAsas() == 30;

        assert coruja.getNome().equals("Coruja");
        assert coruja.getIdade() == 2;
        assert coruja.getEnvergaduraAsas() == 60;

        System.out.println("Teste de Ave passou com sucesso.");
    }

}