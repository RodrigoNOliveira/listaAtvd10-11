import java.util.Locale;
import java.util.Scanner;

import bilheteria.*;

public class App {
    public static void main(String[] args) throws Exception {
       
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Normal normal = new Normal();
        CamaroteInferior camaroteInferior;
        CamaroteSuperior camaroteSuperior;


        System.out.println("Menu");
        System.out.println();
        System.out.println("1- Ingresso Normal");
        System.out.println("2- Ingresso vip");
        System.out.println();
        System.out.print("Insira a opção: ");
        int opcao = scanner.nextInt();
        System.out.println();
        if (opcao == 1){
            normal = new Normal();
            normal.tipoIngresso();
        }
        else if (opcao == 2){
            System.out.println("1- Camarote Superior");
            System.out.println("2- Camarote Inferior");
            System.out.println();
            System.out.print("Insira a opção: ");
            opcao = scanner.nextInt();
            System.out.println();
            if (opcao == 1){
                camaroteSuperior = new CamaroteSuperior();
                System.out.println("Localização: " + camaroteSuperior.getLocalizacao() + "\nValor: "+camaroteSuperior.retorneValor());
                
            } else {
                camaroteInferior = new CamaroteInferior();
                System.out.println("Localização: " + camaroteInferior.getLocalizacao() + "\nValor: "+ camaroteInferior.retorneValor());
            }
        }
        scanner.close();
    
    }
}
