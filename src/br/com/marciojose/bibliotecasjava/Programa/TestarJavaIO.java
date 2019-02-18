package br.com.marciojose.bibliotecasjava.Programa;

/*
  Aula 4 Alura 3 - Java e suas bibliotecas

 */

import java.io.*;
import java.util.Scanner;

public class TestarJavaIO {

    public String nomeArquivoDeLeitura;
    public String nomeArquivoDeSaida;

    public void lendoArquivoDeDiscoComScanner() throws IOException {

        Scanner sc = new Scanner(new FileInputStream(nomeArquivoDeLeitura));
        PrintStream ps = new PrintStream(nomeArquivoDeSaida);

        while (sc.hasNext()) {
            String linha = sc.nextLine();
            ps.println(linha);
        }
        ps.close();
        sc.close();
    }

    public void lendoArquivoDeDiscoBaixoNivel() throws IOException {

        BufferedReader memoriaDeLeitura = criarLeitorDeArquivosEmDisco(nomeArquivoDeLeitura);
        BufferedWriter memoriaDeEscrita = criarEscritodeArquivoEmDisco(nomeArquivoDeSaida);

        String linha = memoriaDeLeitura.readLine();
        while (linha != null) {
            memoriaDeEscrita.append(linha);
            memoriaDeEscrita.newLine();
            linha = memoriaDeLeitura.readLine();
        }
        memoriaDeLeitura.close();
        memoriaDeEscrita.close();
    }

    public static BufferedWriter criarEscritodeArquivoEmDisco(String nomeArquivoDeSaida) throws IOException {
        //abre um arquivo de leitur atraves de bytes
        OutputStream fluxoDeSaida = new FileOutputStream(nomeArquivoDeSaida);
        //cria um 'escritor' de saida para escrever caracteres e que sejam traduzidos para bytes
        OutputStreamWriter escritorDeSaida = new OutputStreamWriter(fluxoDeSaida);
        //crio uma memoria para escrever string s
        BufferedWriter memoriaDeEscrita = new BufferedWriter(escritorDeSaida);

        return memoriaDeEscrita;
    }
    private static BufferedReader criarLeitorDeArquivosEmDisco(String nomeArquivoDeLeitura) throws IOException {
        //le bytes
        InputStream fluxoDeEntrada = new FileInputStream(nomeArquivoDeLeitura);
        //le caracteres
        InputStreamReader leitorDeFluxoeEntrada = new InputStreamReader(fluxoDeEntrada);
        //crio buffer em memoria para utilizar leitura de disco para não ler caracter por caracter
        //ou para ler linhas
        BufferedReader memoriaDeLeitura = new BufferedReader(leitorDeFluxoeEntrada);

        return memoriaDeLeitura;
    }
}
