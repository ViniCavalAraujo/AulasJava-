public class RegistroProdutos2 {

    public static void main(String[] args) {
        
        RegistroProdutos[] produto = new RegistroProdutos[10];
        produto[0] = new RegistroProdutos();
        System.out.println(produto[0].calculo());
        produto[1] = new RegistroProdutos();
        System.out.println(produto[1].calculo());
        produto[2] = new RegistroProdutos();
        System.out.println(produto[2].calculo());
       
    }
    
}
