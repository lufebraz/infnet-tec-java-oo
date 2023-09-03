package org.example.model;

import org.example.exceptions.AnimalException;
import org.example.exceptions.ProprietarioNaoAutorizadoException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zoologico {

    private String nome;
    private List<Animal> animais; // feature 03
    private Proprietario proprietario;
    private Animal[] vetorAnimais;
    private Set<Animal> setAnimais;

    public Zoologico(String nome, Proprietario proprietario) {
        this.nome = nome;
        this.proprietario = proprietario;
        this.animais = new ArrayList<>();
        this.vetorAnimais = new Animal[100];
        this.setAnimais = new HashSet<>();
    }

    public void adicionarAnimal(Animal animal) throws AnimalException {

        if (animal == null) {
            throw new AnimalException("Animal não pode ser nulo.");
        }
        animais.add(animal);
    }

    public void listarAnimais() {
        System.out.println("Animais no zoológico " + nome + ":");
        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade());
        }
    }

    public void realizarOperacaoConfidencial(Proprietario proprietario) throws ProprietarioNaoAutorizadoException {
        if (!this.proprietario.equals(proprietario)) {
            throw new ProprietarioNaoAutorizadoException("Proprietário não autorizado para esta operação.");
        }
        System.out.println(proprietario.getNome() + " realizou operação confidencial do proprio zoologico");
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "nome='" + nome + '\'' +
                ", animais=" + animais +
                ", proprietario=" + proprietario +
                '}';
    }
}
