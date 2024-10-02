public class elseif {


    public static void main(String[] args) {
        int nota = 85; // Alterar valor para testar

        if (nota >= 70) { // Início do primeiro if
            System.out.println("Nota suficiente."); // Linha 1
            
        if (nota >= 90) { // Início do segundo if
                System.out.println("Você tirou um A."); // Linha 2
                
        if (nota == 100) { // Início do terceiro if
                    System.out.println("Parabéns, nota máxima!"); // Linha 3
        } // Fim do terceiro if
        } else if (nota >= 80) { // Início do else if
                    System.out.println("Você tirou um B."); // Linha 4
        if (nota >= 85) { // Início do quarto if
                    System.out.println("Muito bom, quase um A!"); // Linha 5
        } // Fim do quarto if
        } else { // Início do else
                    System.out.println("Você tirou um C."); // Linha 6
        } // Fim do else
        } else { // Início do else
            System.out.println("Nota insuficiente."); // Linha 7
        } // Fim do primeiro if
    } // Fim do método main
} // Fim da classe
    

