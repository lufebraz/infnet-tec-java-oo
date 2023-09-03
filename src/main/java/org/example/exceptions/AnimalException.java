package org.example.exceptions;

public class AnimalException extends Exception {
    public AnimalException(String mensagem) {
        super(mensagem);
    }

    public AnimalException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
