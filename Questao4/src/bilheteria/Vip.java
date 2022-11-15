package bilheteria;

public class Vip extends Ingresso{

    private double valorAdicional = 5;

    public Vip() {
        super();
    }

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valor = retorneValor();
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void imprimeValor() {
        super.imprimeValor();
    }
    
    public double retorneValor(){
        
        return this.valor = this.valor + valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }


}
