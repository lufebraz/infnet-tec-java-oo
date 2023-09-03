package org.example.model;

import org.junit.Test;

public class ProprietarioTest {

    @Test
    public void proprietarioTeste() {
        Proprietario proprietario = new Proprietario("João", "123.123.123-32", "joaozin@gmail.com");

        System.out.println("Detalhes do Proprietário:");
        System.out.println("Nome: " + proprietario.getNome());
        System.out.println("CPF: " + proprietario.getCpf());

        // Teste de assert
        assert proprietario.getNome().equals("João");
        assert proprietario.getCpf().equals("123.123.123-32");

        System.out.println("Teste de Proprietario passou com sucesso.");

    }

}