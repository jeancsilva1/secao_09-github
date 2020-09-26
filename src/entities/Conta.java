/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Scanner;

public class Conta {

    private int numero;
    private String nome_titular;
    private double saldo;

    public Conta(int numero, String nome_titular, double saldo) {
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }

    public Conta(int numero, String nome_titular) {
        this.numero = numero;
        this.nome_titular = nome_titular;
    }

    Scanner sc = new Scanner(System.in);

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void realizarDeposito(double valorDeposito) {
        saldo += valorDeposito;

    }

    public void realizarSaque(double valorSaque) {
        saldo = saldo - valorSaque - 5;

    }

    @Override
    public String toString() {
        return "Conta: " + numero + ", Titular:" + nome_titular + ", Saldo:" + saldo;
    }

}
