
import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
		
		int n; //numero de alunos
		
		double notas[] = new double[2];
		double media=0;
		
		for(n=1;n<=5;n++) {
			
			media = 0;
			
			System.out.println("\nAluno " +n);
			for(int i = 0;i<notas.length;i++) {
				System.out.print("Nota"+(i+1)+":");
				notas[i] = Double.parseDouble(sc.nextLine());
				media += notas[i];
			}
			
			media = media / notas.length;
			System.out.println("Média: " +media);
            if(media>=6){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }
			
		}
		
		sc.close();
           
        }

    }
    


    
