package br.com.marciojose.bibliotecasjava.modelo;

public class GuardadorDeObjetos {

    private Object[] contas;
    private int posicaoLivre;

    public GuardadorDeObjetos() {
        super();
        contas = new Object[100];
        posicaoLivre = 0;
    }

    public void adicionarConta(Object novaConta) {
        contas[posicaoLivre] = novaConta;
        posicaoLivre++;
    }

    public Object pega(int posicao) {
        return  contas[posicao];
    }
}
