package br.com.marciojose.bibliotecasjava.Programa;

import br.com.marciojose.bibliotecasjava.modelo.Cliente;
import br.com.marciojose.bibliotecasjava.modelo.Conta;
import br.com.marciojose.bibliotecasjava.modelo.GuardadorDeObjetos;

public class TestarJavaLang {

    public void testarComString(){

        String curso = "fj11";
        //strings são imutaveis sempre tem que atribuir, ela retorna um valor
        //esse métoso manipulam o valor da string mas nunca ela será alterada
        //sempre tem ue atribuir ou atribuir a outra variavel
        //curso.replace("j", "k");
        curso = curso.replace("j", "k");

        System.out.println(curso);
    }

    public void testarContasMatematicas() {
        double pi = 3.14;

        long numeroArredondado = Math.round(pi);
        System.out.println(numeroArredondado);

    }

    public void testarComObjetos() {
        Conta c1 = new Conta(500.0);
        Conta c2 = new Conta(500.0);

        GuardadorDeObjetos armario = new GuardadorDeObjetos();
        armario.adicionarConta(c1);
        armario.adicionarConta(c2);

        Cliente joao = new Cliente();
        armario.adicionarConta(joao);

        //terei que fazer cast (responsabiliade do desenvolvedor é perigoso fazer isso)
        Conta c1NoArmario = (Conta) armario.pega(0);
        System.out.println(c1NoArmario.toString());

        if (c1 == c2){
            System.out.println("São Iguais");
        } else {
            System.out.println("São diferentes");
        }

        //se não reescrever o equals vai dar que são diferente, pois estou comparaando objeto com objeto
        //e não os valores
        if (c1.equals(c2)){
            System.out.println("São Iguais");
        } else {
            System.out.println("São diferentes");
        }

        if (c1.equals(joao)){
            System.out.println("São Iguais");
        } else {
            System.out.println("São diferentes");
        }
    }
}
