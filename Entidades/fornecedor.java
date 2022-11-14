/* 1) Implemente em Java uma classe que represente um Fornecedor:
        a)Cada fornecedor possui como atributos, seu CNPJ (uma String), seu telefone (uma String) e o seu nome (uma String).*/

package Entidades;

public class fornecedor {
    private String cnpj;
    private String telefone;
    private String nome;

    // constructers
    public fornecedor() {
    }

    public fornecedor(String cnpj, String telefone, String nome) {
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.nome = nome;
    }

    // Gets e Sets
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return "O fornecedor" + getNome() + " possui CNPJ:" + getCnpj() + "com telefone:" + getTelefone();
    }

}
