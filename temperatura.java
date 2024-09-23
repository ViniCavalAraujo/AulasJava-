import java.util.Scanner;

public class temperatura {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);



        double celcius=0, fah=0;

        System.out.println("Informe a temperatura Fº :");
         fah = Double.parseDouble(sc.nextLine());

        celcius = (fah - 32) * 5/9;

        System.out.println("Temperatura em C° :"+celcius);


        celcius = 0;
        fah = 0;

        System.out.println("Informe a temperatura Cº :");
         celcius = Double.parseDouble(sc.nextLine());

        fah = (celcius * 9/5) + 32;

        System.out.println("Temperatura em F° :"+fah);

        





       
      


    }
    
}
