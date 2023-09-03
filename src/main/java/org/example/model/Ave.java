package org.example.model;

public class Ave extends Animal {

    private int envergaduraAsas;

    public Ave(String nome, int idade, int envergaduraAsas) {
        super(nome, idade);
        this.envergaduraAsas = envergaduraAsas;
    }

    @Override
    public void emitirSom() {
        System.out.println(super.getNome() + " emitindo som...");
    }

    @Override
    public void mover() {
        System.out.println(super.getNome() + " voando...");
    }

    public int getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(int envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Envergadura das asas: " + envergaduraAsas + " cm";
    }
}
