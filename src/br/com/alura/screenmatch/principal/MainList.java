package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MainList {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1999);
        meuFilme.avalia(5);
        Filme outroFilme = new Filme("Avatar",2002);
        outroFilme.avalia(7);
        var filmeDoJoao = new Filme("Homem - Aranha 2",2001);
        filmeDoJoao.avalia(10);
        Serie lost = new Serie("Lost",2000);


        ArrayList<Titulo> list = new ArrayList<>();
        list.add(meuFilme);
        list.add(outroFilme);
        list.add(filmeDoJoao);
        list.add(lost);
        for (Titulo item :list) { // foreach usado para percorrer todos os elementos de uma lista, sem a necessidade de se preocupar com indices  ou o tamanho dela
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("João Miguel");
        buscaPorArtista.add("Sidnéia");
        buscaPorArtista.add("Marcos");
        buscaPorArtista.add("Ana luíza");

        System.out.println(buscaPorArtista);
        //Ordenando a lista
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        //Collections.sort(list); // não funciona por que o collection é algo do String, mas vamos fazer um contrato com comparable

        Collections.sort(list);
        System.out.println(list);
    }
}
