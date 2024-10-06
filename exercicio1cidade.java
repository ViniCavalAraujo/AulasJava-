import java.util.Scanner;

public class exercicio1cidade {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double mediaSalario=0;
        int qtdeFilhos=0;
        double maiorSalario=0;

        double salario;
        int filhos;

        for(int i=0;i<10;i++){

            System.out.print("Informe o salário:");
            salario = Double.parseDouble(sc.nextLine());

            System.out.print("Quantidade de filhos:");
            filhos = Integer.parseInt(sc.nextLine());

            mediaSalario += salario;
            qtdeFilhos += filhos;

            
            if(salario > maiorSalario){
                maiorSalario += salario;
            }

        }

        mediaSalario = mediaSalario / 10;
        int mediaFilhos = qtdeFilhos / 10;
       
        System.out.println("Maior salário:"+maiorSalario);
    }


}