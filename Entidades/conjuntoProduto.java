/*4) Implemente em Java uma classe chamada ConjuntoProdutos que contenha um ArrayList que possa guardar produtos (classe implementada na questão anterior) e forneça métodos que permitam inserir, remover, atualizar, mostrar produtos e atualizar o preço dos produtos por porcentagem. 
   Obs.: O conjunto não deve permitir que produtos com o mesmo código sejam cadastrados no conjunto. */

package Entidades;

import java.util.ArrayList;

public class conjuntoProduto {
    private ArrayList<Produto> produtos;


    public void ConjuntoProdutos() {
        this.produtos = new ArrayList<Produto>();
    }

    public boolean adicionar(Produto produto) {
        return this.produtos.add(produto);
    }

    public boolean remover(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return this.produtos.remove(produto);
            }
        }
        return false;
    }

    public String mostrar() {

        String produtosExibidos = "";

        if (this.produtos.size() == 0) {
            return "Nenhum produto adicionado!";
        } else {
            for (Produto produto : produtos) {
                produtosExibidos += produto.toString() + "\n";
            }
            return produtosExibidos;
        }
    }

    public boolean atualizar(Produto produto) {
        for (Produto prod : produtos) {
            if (prod.getCodigo() == produto.getCodigo()) {
                this.produtos.set(this.produtos.indexOf(prod), produto);
                return true;
            }
        }
        return false;
    }

    public boolean atualizarPrecoPorcentagem(double percentual) {

        for (Produto prod : produtos) {
            prod.atualizarPreco((float)percentual);
        }
        return true;
    }
}
