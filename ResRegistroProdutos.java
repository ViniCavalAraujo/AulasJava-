public class ResRegistroProdutos {

    public static void main(String[] args) {
        
        RegistroProdutos produto = new RegistroProdutos();

        
        double total = produto.calculo();
        for(int i=0;i<10;i++){
        System.out.println("Nome inserido:"+produto.nome[i]);
        System.out.println("Valor inserido:"+produto.preco[i]);
        System.out.println("Quantidade:"+produto.quantidade[i]);
        System.out.println("\n");
    }
        System.out.println("Valor total:"+total);

        int registro = produto.totalRegistro();
        System.out.println("Total de registros:"+registro);

    }
    
}
