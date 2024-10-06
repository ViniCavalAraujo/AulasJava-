
import java.util.Scanner;

public class Biblioteca {

    public String titulo[] = new String[3];
    public String autor[] = new String[3];
    public int anoPublicacao[] = new int[3];
   

    private static Scanner sc = new Scanner(System.in);


    public Biblioteca(){} //construtor

    public void adicionarLivro(){
        for(int i=0;i<3;i++){
        System.out.println("Título do livro:");
        titulo[i] = sc.nextLine();

        System.out.println("Autor:");
        autor[i] = sc.nextLine();

        System.out.println("Ano de publicação:");
        anoPublicacao[i] = Integer.parseInt(sc.nextLine());
    }

    }

    public void buscarLivro(){
        
        System.out.println("Buscando livros. Nome do autor:");
        String buscandoAutor = sc.nextLine();
        boolean verificarAutor = false; //inicialmente nenhum livro encontrado

        for(int i=0;i<3;i++){
        if(buscandoAutor.equals(autor[i])){
            System.out.println("Livro encontrado:"+titulo[i]);
            verificarAutor = true;
        }

        }

        //verifica se é falso (! sinal de negação) se for falso vira true e imprime
        if(!verificarAutor){
            System.out.println("Livro não encontrado");
        }

    }
    
}
