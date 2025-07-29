package com.mycompany.caixaeletronico;

import java.util.Scanner;

public class SaldoAtual {
    
    public int lerSaldo(){
        Scanner scanner = new Scanner(System.in);
        int saldoAtual;
        
        while(true){
            System.out.print("Digite o seu saldo: ");
            
            if (scanner.hasNextInt()){
                saldoAtual = scanner.nextInt();
            
            if (saldoAtual <= 0 || saldoAtual == 1 || saldoAtual == 3){
                System.out.println("Saldo invalido. Digite um valor valido maior que 3.");
            } else{
                return saldoAtual;
            }
        } else{
            System.out.println("Entrada invalida. Digite um numero inteiro.");
            scanner.next();
        }
    }
   }

}
