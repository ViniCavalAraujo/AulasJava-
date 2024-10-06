
import java.util.Scanner;
import java.time.LocalDateTime;



public class Fabricamoto {

    public String marca;
    public String cor;
  
    public int ano;
    public String nome;


    //método
    public void andar(){
        System.out.println("Moto de nome está andando");

    }
    

    //construtor
    public Fabricamoto(){
        Scanner leitura = new Scanner(System.in);
        this.nome = leitura.nextLine();


        System.out.println("Digite a marca da moto:");
        this.nome = leitura.nextLine();
        System.out.println("Digite a cor da moto:");
        this.cor = leitura.nextLine();




        while(true){
            try{
                Scanner temp = new Scanner(System.in);
                System.out.println("Digite ano da moto:");
                this.ano = temp.nextInt();
                temp.close();
                break;
            }
            catch(Exception e){
                System.out.println("Digite um valor valido:");
                continue;
            }
        }
    }

   
    
    
}


