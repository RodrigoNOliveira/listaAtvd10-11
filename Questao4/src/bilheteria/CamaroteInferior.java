package bilheteria;

public class CamaroteInferior extends Vip{
    
    private String localizacao = "Camarote inferior";


    

    public CamaroteInferior() {
        super();
    }



    public CamaroteInferior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.valor = valor;
        this.localizacao = localizacao;
    }



    public String getLocalizacao() {
        return localizacao;
    }




    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

}
