package com.compreaqui;


public class Cliente {
    protected String nome;
    protected String email;
    protected String cpf;
    protected String endereco;
    private CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

    
    public Cliente() {
    }


    
    public Cliente(String cpf) {
        this.cpf = cpf;
    }


    public Cliente(String nome, String email, String cpf, String endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    

    

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", endereco=" + endereco + "]";
    }



    public CarrinhoDeCompra getCarrinho() {
        return carrinho;
    }



    public void setCarrinho(CarrinhoDeCompra carrinho) {
        this.carrinho = carrinho;
    }




}
