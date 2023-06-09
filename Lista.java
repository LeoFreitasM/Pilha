/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lifo;

/**
 *
 * @author Leonardo Freitas
 */
public class Lista {

    private Elemento inicio, atual, aux;
    private Elemento tamanho, ultimo, proximo;

    public boolean verificar() {
        return inicio == null;
    }

    public void inserir(Object objeto) {
        if (verificar()) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null, aux);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void exibir() {
        Elemento e = inicio;
        while (e != null) {
            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }

    public void top() {
        Elemento e = atual;
        System.out.println(e.getObjeto());
    }

    public boolean empty() {
        Elemento e = inicio;
        boolean b = false;
        if (e == null) {
            System.out.println(true);
        } else {
            System.out.println(b);
        }
        return b;
    }

    public Elemento buscar(int id) {
        Elemento e = inicio;
        Contato c;
        while (e != null) {
            c = (Contato) e.getObjeto();
            if (id == c.getId()) {
                return e;
            }
            e = e.getProx();
        }
        return null;
    }

    public void remover() {
        Elemento e = null;
        e = atual;

        if (e != null) {
            if (e == atual) {//Remoção do ultimo elemento
                atual = e.getAnt();
                e.setAnt(null);
                atual.setProx(null);
            } else {
                e.getAnt().setProx(e.getProx());
                e.setProx(null);
            }
        }
    }

    public int tamanho() {
        Elemento e = inicio;
        int cont = 0;
        while (e != null) {
            cont++;
            e = e.getProx();
        }
        return cont;
    }
}
