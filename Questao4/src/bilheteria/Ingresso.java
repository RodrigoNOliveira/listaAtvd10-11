package bilheteria;

public class Ingresso {
    
    protected double valor = 10.00;


    public Ingresso() {
    }

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimeValor(){
        System.out.println("Valor do ingresso: " + this.valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }



}
