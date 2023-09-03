package org.example.exceptions;

public class ProprietarioNaoAutorizadoException extends Exception {
    public ProprietarioNaoAutorizadoException(String mensagem) {
        super(mensagem);
    }

    public ProprietarioNaoAutorizadoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
