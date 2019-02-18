package br.com.marciojose.bibliotecasjava.Programa;

import br.com.marciojose.bibliotecasjava.modelo.Conta;

public class FazerDeposito implements Runnable {

    private final Conta conta;

    public FazerDeposito(Conta conta){
        this.conta = conta;
    }

    @Override
    public void run() {
        conta.deposita(100.0);
    }
}
