package com.mycompany.caixaeletronico;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        SaldoAtual leitor = new SaldoAtual();
        int saldo = leitor.lerSaldo();
        
        Saque saque = new Saque();
        int valorSaque = saque.lerSaque(saldo);

    }
}
