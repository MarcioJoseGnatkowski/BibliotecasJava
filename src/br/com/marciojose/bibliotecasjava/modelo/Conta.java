package br.com.marciojose.bibliotecasjava.modelo;

import java.util.Objects;

public class Conta implements Comparable<Conta>{

    private double saldo;
    private double limite;
    private int agencia;
    private int numero;

    public Conta(double saldo) {
        super();
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public synchronized void deposita(double valor){
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta com saldo " + saldo;
    }

    @Override
    public int compareTo(Conta Outra) {
        if (this.saldo < Outra.saldo) return  -1;
        if (this.saldo > Outra.saldo) return   1;
        return 0;
    }

    @Override
    public boolean equals(Object objeto) {
        //se não tiver a verificação a hora que chegar o objeto joao vai dar erro
        if (!(objeto instanceof Conta)) return false;
        Conta outra = (Conta) objeto;
        return  outra.saldo == this.saldo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(saldo);
    }
}
