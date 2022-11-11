import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        Cliente tCpf; //para testar o cpf
        String cpf;
        
        System.out.println("Cadastrar cliente");
        System.out.println();
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o endereço: ");
        String end = scanner.nextLine();
        do {
        System.out.print("Digite o cpf: ");
        cpf = scanner.nextLine(); 
        tCpf = new Cliente(cpf); 
        } while (tCpf.validaCPF() != true);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        Cliente c1 = new Cliente(nome, end, cpf , idade);
        System.out.println(c1);
    
        scanner.close();
    }
}
