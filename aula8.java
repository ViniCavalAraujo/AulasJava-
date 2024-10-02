import java.util.Scanner;

public class aula8 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String nomes[] = new String[6];

        

        for(int i=0;i<nomes.length;i++){

            System.out.print("Informe o nome:");
            nomes[i] = sc.nextLine();
        }

        for(int i=1;i<nomes.length;i+=2){
       // if(i%2==0){
            System.out.println("Nomes posição par:"+nomes[i]);
        //}
        }

        sc.close();

    }

   
}
