/*2) Implemente em Java uma classe que represente um Produto:
   a)Um produto tem como atributos um código (um inteiro), um nome (uma String), um valor (um float) e um fornecedor (do tipo Fornecedor implementado na questão anterior) */


package Entidades;

public class Produto {
    private int codigo;
    private float valor;
    private String nome;
    private fornecedor fornecedor;
    
    //construtores
    public Produto() {
    }

   

    public Produto(int codigo, float valor, String nome, Entidades.fornecedor fornecedor) {
        this.codigo = codigo;
        this.valor = valor;
        this.nome = nome;
        this.fornecedor = fornecedor;
    }



    //gets e sets
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    } 

    /* b)Implemente um método atualizarPreco na classe produto que receba como parâmetro um valor (um float) que representa um percentual. O valor passado deve aumentar o valor do produto. 
       Por exemplo, se for passado o valor 10.0, o valor do produto e aumentado em 10.0%. */

    public float atualizarPreco(float porcentagem){
        if( porcentagem <= 0 ){
            System.out.println("Erro.");
        } else {
            this.valor = this.valor * ((porcentagem/100)+1);  
        }   

        return this.valor;
    }
    
}
