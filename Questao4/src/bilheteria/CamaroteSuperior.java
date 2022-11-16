package bilheteria;

public class CamaroteSuperior extends Vip{
   
    private String localizacao = "Camarote Superior";
    private double adicional = 10;
    
    public CamaroteSuperior() {
        super();
    }

    

    public CamaroteSuperior(double valor, double valorAdicional, String localizacao, double adicional) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
        this.adicional = adicional;
    }


    @Override
    public final double retorneValor() {
        super.retorneValor();
        return this.valor += adicional;
    }


    public String getLocalizacao() {
        return localizacao;
    }



    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }



    public double getAdicional() {
        return adicional;
    }



    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }



    public void locIngresso(){
        System.out.println(localizacao);
    }


}
