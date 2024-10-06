
import java.util.Scanner;

public class exercicio3Celcius {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura Cº:");
        double celcius = sc.nextDouble();

        if(celcius >= 30){
            System.out.println("Está pelando");
        }else if(celcius >=20){
            System.out.println("Está quente");
        }else if(celcius >=10){
            System.out.println("Está frio/moderado");
        }else{
            System.out.println("Está congelando T.T ");
        }

        sc.close();
    }
    
}
