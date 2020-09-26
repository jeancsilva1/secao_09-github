package aplicattion;

import entities.Product;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o nome do Produto: ");
        String name = sc.nextLine();
        System.out.print("Entre com o preco do Produto: ");
        double preco = sc.nextDouble();
        System.out.print("Entre com a qtd do Produto: ");
        int qtd = sc.nextInt();

        Product product = new Product(name, preco, qtd);

        System.out.println(product);
        System.out.println("Adicionando produtos...");
        product.adicionaProduto(10);
        System.out.println(product);
        System.out.println("Retirando produtos...");
        product.retiraProduto(5);
        System.out.println(product);
    }

}
