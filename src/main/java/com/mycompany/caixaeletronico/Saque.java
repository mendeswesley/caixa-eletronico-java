package com.mycompany.caixaeletronico;

import java.util.Scanner;

public class Saque {
    private int valorSaque;
    
    public int lerSaque(int saldoAtual){
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("Quanto você quer sacar?: ");
            
            if(scanner.hasNextInt()){
                valorSaque = scanner.nextInt();
            
                if(valorSaque <= 0){
                    System.out.println("Não é possivel sacar um valor negativo ou zero. Insira um valor valido!");
                } else if(valorSaque == 1 || valorSaque == 3){
                    System.out.println("Nota inexistente. Digite um valor valido!");
                } else if(valorSaque > saldoAtual){
                    System.out.println("Saldo insuficiente, saque um valor compativel com o seu saldo.");
                } else{
                    return valorSaque;
                }
            } else{
                System.out.println("Digite um valor numerico valido");
                scanner.next();
            }
        }

    }
}
