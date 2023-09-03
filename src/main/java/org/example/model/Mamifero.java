package org.example.model;

public class Mamifero extends Animal {

    private String tipoPelo;

    public Mamifero(String nome, int idade, String tipoPelo) {
        super(nome, idade);
        this.tipoPelo = tipoPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println(super.getNome() + " emitindo som...");
    }

    @Override
    public void mover() {
        System.out.println(super.getNome() + " se movendo...");
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Tipo de pelo: " + tipoPelo;
    }
}
