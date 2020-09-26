/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicattion;

import entities.Conta;
import java.util.Scanner;

/**
 *
 * @author Jean
 */
public class Conta_main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o numero da Conta:");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Entre com o nome do Titular:");
        String nomeTitular = sc.nextLine();
        Conta conta;
        System.out.println("Realizará o deposito inicial? (S/N)");
        char resposta = sc.next().charAt(0);
        if (resposta == 'S' || resposta == 's') {
            System.out.print("Entre com o valor do deposito:");
            double vlDeposito = sc.nextDouble();
            conta = new Conta(numeroConta, nomeTitular, vlDeposito);
        } else {
            conta = new Conta(numeroConta, nomeTitular);
        }
        System.out.println(conta);

        System.out.println("");
        System.out.print("Entre com o valor do deposito: ");
        double vldep = sc.nextDouble();
        conta.realizarDeposito(vldep);
        System.out.println("Valores atualizados...");
        System.out.println(conta);

        System.out.println("");
        System.out.print("Entre com o valor do saque: ");
        double vlsaq = sc.nextDouble();
        conta.realizarSaque(vlsaq);
        System.out.println("Valores atualizados...");
        System.out.println(conta);

    }

}
