package com.compreaqui;

import java.util.ArrayList;


public class CarrinhoDeCompra {

    //private Cliente cliente;
    private ArrayList<Produto> listaProduto = new ArrayList<>();

    public CarrinhoDeCompra() {
    }





    public ArrayList<Produto> getListaProduto() {
        return listaProduto;
    }

    public void setListaProduto(ArrayList<Produto> listaProduto) {
        this.listaProduto = listaProduto;
    }
    
}
