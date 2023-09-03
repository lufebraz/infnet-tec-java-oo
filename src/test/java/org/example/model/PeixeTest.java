package org.example.model;


import org.junit.Test;

public class PeixeTest {

    @Test
    public void testeDosPeixes() {
        Peixe peixePalhaco = new Peixe("Peixe-palhaço", 2, "Barbatana laranja");
        Peixe salmao = new Peixe("Salmon", 1, "Barbatana dorsal afiada");
        Peixe dourado = new Peixe("Dourado", 3, "Barbatana amarela");

        System.out.println("Detalhes do Peixe-palhaço:");
        System.out.println("Nome: " + peixePalhaco.getNome());
        System.out.println("Idade: " + peixePalhaco.getIdade());
        System.out.println("Tipo de barbatana: " + peixePalhaco.getTipoBarbatana());

        System.out.println("\nDetalhes do Salmon:");
        System.out.println("Nome: " + salmao.getNome());
        System.out.println("Idade: " + salmao.getIdade());
        System.out.println("Tipo de barbatana: " + salmao.getTipoBarbatana());

        System.out.println("\nDetalhes do Dourado:");
        System.out.println("Nome: " + dourado.getNome());
        System.out.println("Idade: " + dourado.getIdade());
        System.out.println("Tipo de barbatana: " + dourado.getTipoBarbatana());

        // Teste de assert
        assert peixePalhaco.getNome().equals("Peixe-palhaço");
        assert peixePalhaco.getIdade() == 2;
        assert peixePalhaco.getTipoBarbatana().equals("Barbatana laranja");

        assert salmao.getNome().equals("Salmon");
        assert salmao.getIdade() == 1;
        assert salmao.getTipoBarbatana().equals("Barbatana dorsal afiada");

        assert dourado.getNome().equals("Dourado");
        assert dourado.getIdade() == 3;
        assert dourado.getTipoBarbatana().equals("Barbatana amarela");

        System.out.println("Teste de Peixe passou com sucesso.");
    }
}