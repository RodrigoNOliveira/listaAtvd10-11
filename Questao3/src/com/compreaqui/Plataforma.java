package com.compreaqui;

import java.util.ArrayList;


public class Plataforma {

    private Cliente cliente;
    private ArrayList<Cliente> listaCliente = new ArrayList<>();
    private ArrayList<Produto> listaProdutos = new ArrayList<>();


   


    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }


    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
