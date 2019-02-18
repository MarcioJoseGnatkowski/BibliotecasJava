package br.com.marciojose.bibliotecasjava;

import br.com.marciojose.bibliotecasjava.Programa.TestarJavaIO;

import java.io.IOException;

public class MainIO {

    public static void main(String[] args) throws IOException {

        TestarJavaIO leitorEscritoEmDisco = new TestarJavaIO();

        leitorEscritoEmDisco.nomeArquivoDeLeitura = "leitura.txt";
        leitorEscritoEmDisco.nomeArquivoDeSaida = "saida.txt";
        leitorEscritoEmDisco.lendoArquivoDeDiscoBaixoNivel();

        leitorEscritoEmDisco.nomeArquivoDeLeitura = "leituraScanner.txt";
        leitorEscritoEmDisco.nomeArquivoDeSaida = "saidaScanner.txt";
        leitorEscritoEmDisco.lendoArquivoDeDiscoComScanner();
    }
}
