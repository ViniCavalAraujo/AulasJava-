
import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nomes[] = new String[3];
        double mediaSalario=0;
        int qtdeFilhos=0;
        double maiorSalario=0;
        int qtdePessoas=0;
        double menos150=0;
        double porcentagem=0;
        double salario;
        int filhos;
        

        for(int i=0;i<nomes.length;i++){


            System.out.print("Informe seu nome:");
            nomes[i]=sc.nextLine();

            System.out.print("Informe o salário:");
            salario = Double.parseDouble(sc.nextLine());

            System.out.print("Quantidade de filhos:");
            filhos = Integer.parseInt(sc.nextLine());


            mediaSalario += salario;
            qtdeFilhos += filhos;
            qtdePessoas++;
            
            if(salario > maiorSalario){
                maiorSalario = salario;
            }
            if(salario<150){
                menos150++;
            }
        }

        porcentagem = (menos150 / qtdePessoas) * 100;

        mediaSalario = mediaSalario / qtdePessoas;
        
        double mediaFilhos = qtdeFilhos / qtdePessoas;

        System.out.println("Nomes inseridos:");
        for(int i=0;i<nomes.length;i++){
            System.out.println("Nome:"+nomes[i]);

        }

        System.out.println("\n");
       
        System.out.println("Média salário:"+mediaSalario);
        System.out.println("Média número de filhos:"+mediaFilhos);
        System.out.println("Maior salário:"+maiorSalario);
        System.out.println("Percentual de pessoas com salário menos de 150: "+porcentagem+"%");
    }
    }
    

