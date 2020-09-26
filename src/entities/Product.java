/*
Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto
 */
package entities;

/**
 *
 * @author Jean
 */
public class Product {

    public String nome;
    public double preco;
    public int quantidade;

    public Product(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double valorEstoque() {
        return preco * quantidade;

    }

    public void adicionaProduto(int qtd) {
        quantidade += qtd;
    }

    public void retiraProduto(int qtd) {
        quantidade -= qtd;
    }

    @Override
    public String toString() {
        return "Product Data:" + nome + "," + preco + "," + quantidade + ", " + valorEstoque();
    }

}
