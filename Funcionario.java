
import java.util.Scanner;

public class Funcionario {

    public String nome;
    public String cargo;
    public double salario;

    private static Scanner sc = new Scanner(System.in);

    public Funcionario(){

        System.out.println("Informe o salário:");
        salario = Double.parseDouble(sc.nextLine());

    }


    public void aumentoSalarial(double porcentagem){

       

        double aumento = (salario * porcentagem) / 100;
        double novoSalario = salario + aumento;

        System.out.println("Aumento de:"+aumento);
        System.out.println("Novo salário:"+novoSalario);





    }

    
}
