package br.com.marciojose.bibliotecasjava;

import br.com.marciojose.bibliotecasjava.Programa.TestarColecoes;

public class MainColecoes {
    public static void main(String[] args) {
        TestarColecoes testeColecoes = new TestarColecoes();

        testeColecoes.TestandoListaComLinkedList();
        testeColecoes.TestandoListaComHashSet();
        testeColecoes.TestandoListaComMap();
    }

}
