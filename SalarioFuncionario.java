import java.util.Scanner;

public class SalarioFuncionario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Funcionario func = new Funcionario();

        System.out.println("Aumento salarial(%) :");
        double porcentagem = Double.parseDouble(sc.nextLine());
   

        func.aumentoSalarial(porcentagem);

        
    }
    
}
