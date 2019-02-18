package br.com.marciojose.bibliotecasjava.Programa;

import br.com.marciojose.bibliotecasjava.modelo.Conta;

import java.util.*;

public class TestarColecoes {

    private static void EscreverSaldo(Map<String, Conta> contas, String cargo) {
        System.out.println("O saldo do " + cargo + " é " + contas.get(cargo).getSaldo());
    }

    private void AdicionarConta(Collection<Conta> contas, Conta c1) {
        contas.add(c1);
    }

    //Permite trabalhar com chave e valor
    public void TestandoListaComMap() {

        String sCargoDiretor = "Diretor";
        String sCargoGerente = "Gerente";

        Map<String, Conta> contas = new HashMap<String, Conta>();
        Conta c1 = new Conta(200.0);
        Conta c2 = new Conta(500.0);

        contas.put(sCargoDiretor, c1 );
        contas.put(sCargoGerente, c2 );

        EscreverSaldo(contas, sCargoDiretor);
        EscreverSaldo(contas, sCargoGerente);
    }

    //Não possui elementos repetidos,"equals". Não possui indexação.
    public void TestandoListaComHashSet() {

        Set<String> nomes = new HashSet<String>();
        nomes.add("Raquete");
        nomes.add("Márcio");
        nomes.add("Márcio");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        Set<Conta> contas = new HashSet<Conta>();

        Conta c1 = new Conta(200.0);
        Conta c2 = new Conta(200.0);
        AdicionarConta(contas, c1);
        AdicionarConta(contas, c1);
        AdicionarConta(contas, c2);

        for (Conta c : contas) {
            System.out.println(c);
        }
    }

    //permite dados duplicados, possui indexação
    public void TestandoListaComLinkedList() {

        List<String> nomes = new LinkedList<>();
        nomes.add("Raquete");
        nomes.add("Márcio");
        nomes.add("Márcio");

        Collections.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        List<Conta> contas = new LinkedList<>();

        Conta c1 = new Conta(1500.0);
        Conta c2 = new Conta(700.0);
        AdicionarConta(contas, c1);
        AdicionarConta(contas, c2);

        Collections.sort(contas);
        for (Conta c : contas) {
            System.out.println(c);
        }
    }
}
