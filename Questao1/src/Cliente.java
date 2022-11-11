public class Cliente {

    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public Cliente() {
    }

    

    public Cliente(String cpf) {
        this.cpf = cpf;
    }



    public Cliente(String nome, String endereco, String cpf, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public boolean validaCPF(){
        boolean validacao = false;
        if (this.cpf.length() == 11){
            validacao = true;
        } 
        else {
            System.out.println("CPF inválido!");
        }
        return validacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", idade=" + idade + "]";
    }
    


    
}
