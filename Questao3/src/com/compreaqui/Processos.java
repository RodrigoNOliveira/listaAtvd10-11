package com.compreaqui;

import java.util.Scanner;

public class Processos {

    private Scanner scanner = new Scanner(System.in);
    private String cpf;
    private Plataforma plataforma = new Plataforma();
    private Cliente cliente = new Cliente();
    private Produto produto = new Produto();
    private int qtdContas; // qtd de contas criadas

    public Processos() {
    }

    public Processos(Scanner scanner, String cpf, Plataforma plataforma, Cliente cliente, Produto produto) {
        this.scanner = scanner;
        this.cpf = cpf;
        this.plataforma = plataforma;
        this.cliente = cliente;
        this.produto = produto;
    }

    public void cadastrarCliente() {
        System.out.println("Cadastro de clientes");
        System.out.print("Insira o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Insira o email: ");
        String email = scanner.nextLine();
        do {
            System.out.print("Digite o cpf: ");
            cpf = scanner.nextLine();
        } while (validaCPF(cpf) != true);
        System.out.print("Insira o endereço: ");
        String end = scanner.nextLine();
        Cliente cliente = new Cliente(nome, email, cpf, end);
        plataforma.getListaCliente().add(cliente);
        qtdContas++;
    }

    public void cadastrarProduto() {
        System.out.println("Cadastro de Produtos");
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a quantidade: ");
        int qtd = scanner.nextInt();
        scanner.nextLine();
        Produto produto = new Produto(nome, valor, qtd);
        plataforma.getListaProdutos().add(produto);
    }

    public Cliente buscarCliente(String nome) {
        Cliente teste = new Cliente();
        teste = null;
        for (int i = 0; i < plataforma.getListaCliente().size(); i++) {
            if (plataforma.getListaCliente().get(i).getNome().equals(nome)) {
                teste = plataforma.getListaCliente().get(i);
            }
        }
        return teste;
    }

    public Produto buscarProduto(String nome) {
        for (int i = 0; i < plataforma.getListaProdutos().size(); i++) {
            if (plataforma.getListaProdutos().get(i).getNome().equals(nome)) {
                return plataforma.getListaProdutos().get(i);
            }
        }
        return null;
    }

    public void adcProdutoNoCarrinho() {
        System.out.print("Insira o nome do cliente: ");
        String nome = scanner.nextLine();
        cliente = buscarCliente(nome);
        if (cliente != null) {
            System.out.print("Insira o nome do produto: ");
            nome = scanner.nextLine();
            produto = buscarProduto(nome);
            if (produto != null) {
                System.out.print("Insira a quantidade desejada: ");
                int quantidade = scanner.nextInt();
                double preco = produto.getPreco();
                Produto pdt = new Produto(nome, preco, quantidade);
                produto = pdt;
                cliente.getCarrinho().getListaProduto().add(produto);
            }
        }
    }

    public void rmvProdutoNoCarrinho() {
        System.out.print("Insira o nome do cliente: ");
        String nome = scanner.nextLine();
        cliente = buscarCliente(nome);
        if (cliente != null) {
            System.out.print("Insira o nome do produto: ");
            nome = scanner.nextLine();

            for (int i = 0; i < cliente.getCarrinho().getListaProduto().size(); i++) {
                if (cliente.getCarrinho().getListaProduto().get(i).getNome().equals(nome)) {
                    produto = cliente.getCarrinho().getListaProduto().get(i);
                    cliente.getCarrinho().getListaProduto().remove(produto);
                }
            }
        }
    }

    public void notaFiscal() {
        double valorTotal = 0, valorItem = 0;
        System.out.print("Insira o nome do cliente: ");
        String nome = scanner.nextLine();
        cliente = buscarCliente(nome);
        if (cliente != null) {
            StringBuilder msg = new StringBuilder();
            msg.append("");
            msg.append("\n ----------------- NOTA FISCAL ---------------\n");
            msg.append("\nCliente: " + cliente.getNome());
            msg.append("\nCPF: " + cliente.getCpf());
            msg.append("\n\nProduto ---- Valor ---- Quantidade ---- Total\n\n");
            for (int i = 0; i < cliente.getCarrinho().getListaProduto().size(); i++) {
                if (cliente.getCarrinho().getListaProduto().get(i) != null) {
                    valorItem = (cliente.getCarrinho().getListaProduto().get(i).getPreco()
                            * (double) cliente.getCarrinho().getListaProduto().get(i).getQuantidade());
                    msg.append("\n" + cliente.getCarrinho().getListaProduto().get(i).getNome() + " ------ "
                            + cliente.getCarrinho().getListaProduto().get(i).getPreco() + " ----- "
                            + cliente.getCarrinho().getListaProduto().get(i).getQuantidade() + " ----- " + valorItem);
                    valorTotal += valorItem;
                }
            }
            msg.append("\n---------------------------------------------\n");
            msg.append("\n\nValor total da compra: " + valorTotal);
            msg.append("\n---------------------------------------------\n");
            System.out.println(msg.toString());
        }
    }

    public boolean validaCPF(String cpf) {
        boolean validacao = false;
        if (cpf.length() == 11) {
            validacao = true;
        } else {
            System.out.println("CPF inválido!");
        }
        return validacao;
    }

    public void iniciar() {
        int opcao = 0;
        do {
            System.out.println();
            System.out.println();
            System.out.println(" ----- Menu -----");
            System.out.println();
            System.out.println("1- Cadastro de cliente");
            System.out.println("2- Cadastro de produto");
            System.out.println("3- Buscar cliente");
            System.out.println("4- Adicionar Produto no carrinho de compras");
            System.out.println("5- Excluir produto do carrinho de compras");
            System.out.println("6- Nota Fiscal");
            System.out.println("0- Encerrar programa");
            System.out.println();
            System.out.print("Insira a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarProduto();
                    break;
                case 3:
                    System.out.print("Insira o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.println(buscarCliente(nome));
                    break;
                case 4:
                    adcProdutoNoCarrinho();
                    break;
                case 5:
                    rmvProdutoNoCarrinho();
                    break;
                case 6:
                    notaFiscal();
                    break;
                case 0:
                    System.out.println("Sistema encerrado!");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        } while (opcao != 0);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtdContas() {
        return qtdContas;
    }

    public void setQtdContas(int qtdContas) {
        this.qtdContas = qtdContas;
    }

}
