package org.example.model;

public class Peixe extends Animal {

    private String tipoBarbatana;

    public Peixe(String nome, int idade, String tipoBarbatana) {
        super(nome, idade);
        this.tipoBarbatana = tipoBarbatana;
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som...");
    }

    @Override
    public void mover() {
        System.out.println(super.getNome() + " nadando...");
    }

    public String getTipoBarbatana() {
        return tipoBarbatana;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Tipo de barbatana: " + tipoBarbatana;
    }

}
