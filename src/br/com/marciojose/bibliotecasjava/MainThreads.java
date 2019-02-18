package br.com.marciojose.bibliotecasjava;

import br.com.marciojose.bibliotecasjava.Programa.BarraDeProgresso;
import br.com.marciojose.bibliotecasjava.Programa.CopiadorDeArquivos;
import br.com.marciojose.bibliotecasjava.Programa.FazerDeposito;
import br.com.marciojose.bibliotecasjava.modelo.Conta;

public class MainThreads  {

    public static void main (String[] args) throws Exception {

        //execucaoThreadSimples();
        fazerDepositoSincronizado();
    }

    private static void execucaoThreadSimples() {
        BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
        Thread t1 = new Thread(barraDeProgresso);
        t1.start();

        CopiadorDeArquivos copiadodeArquivos = new CopiadorDeArquivos();
        Thread t2 = new Thread(copiadodeArquivos);
        t2.start();
    }

    private static void fazerDepositoSincronizado() throws Exception{
        Conta c1 = new Conta(500.0);
        FazerDeposito acao = new FazerDeposito(c1);
        Thread t1 = new Thread(acao);
        Thread t2 = new Thread(acao);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c1.getSaldo());
    }
}
