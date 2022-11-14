/*3) Crie uma classe TesteProduto com um método main. No método main desta classe, instancie três produtos e dois fornecedores, de acordo com o esquema em anexo (Figura 01). */

package Entidades;

public class testeProduto {
    public static void main(String[] args) {
        System.out.println("Fornecedores e Produtos");

        //Fornecedores:
        fornecedor fornecedor01 = new fornecedor("147852369", "(81)9.85478569", "Bernardo Soares");
        fornecedor fornecedor02 = new fornecedor("102585696", "(81)9.84712569", "Priscila Silva");
        
        //Produtos
        Produto produto01 = new Produto (1,8.50,"pastel de forno",fornecedor01);
        Produto produto02 = new produto (2, 5.00, "coxinha de frango", fornecedor02);
        Produto produto03 = new produto (3, 4.00, "Agua mineral", fornecedor01);
    }
    
}
