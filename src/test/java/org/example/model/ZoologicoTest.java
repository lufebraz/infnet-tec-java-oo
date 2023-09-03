package org.example.model;

import org.example.exceptions.AnimalException;
import org.junit.Assert;
import org.junit.Test;

public class ZoologicoTest {

    @Test
    public void zooTest() throws AnimalException {
        Proprietario donoZoo = new Proprietario("João", "123.123.123-23", "Joao.silva@gmail.com");
        Zoologico zoo = new Zoologico("Zootopia", donoZoo);

        Mamifero leao = new Mamifero("Leão", 5, "Pelagem curta");
        Ave aguia = new Ave("Águia", 3, 180);
        Peixe peixePalhaco = new Peixe("Peixe-palhaço", 2, "Barbatana laranja");

        zoo.adicionarAnimal(leao);
        zoo.adicionarAnimal(aguia);
        zoo.adicionarAnimal(peixePalhaco);

        System.out.println("Animais no zoológico:");
        zoo.listarAnimais();

        System.out.println("\nProprietário do zoológico: " + zoo.getProprietario().getNome());
        System.out.println("Nome do zoológico: " + zoo.getNome());

        Assert.assertEquals("Zootopia", zoo.getNome());

    }

}