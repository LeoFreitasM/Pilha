package com.mycompany.lifo;

public class Lifo {

    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.inserir(new Contato("Gerson", "1234-55543"));
        lista.inserir(new Contato("Sandra", "4321-78546"));
        lista.inserir(new Contato("Anna", "6543-98768"));
        lista.inserir(new Contato("Mel", "4943-03932"));

        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("-------------");

        System.out.println("Removendo... ");
        lista.remover();
        lista.exibir();

        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("----------");

        System.out.println("Topo da lista: ");
        lista.top();

        System.out.println("----------");

        System.out.println("A lista está vazia ?");
        lista.empty();

    }
}
