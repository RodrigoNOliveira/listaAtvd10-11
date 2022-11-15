package bilheteria;

public class Normal extends Ingresso{

    

    public Normal() {
    }

    public Normal(double valor) {
        super(valor);
    }

    public void tipoIngresso(){
        System.out.println("Ingresso Normal: " + valor);
    }

}
