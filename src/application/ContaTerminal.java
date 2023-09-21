package application;

import entities.ContaBanco;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        ContaBanco conta;

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = entrada.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        String nome = entrada.nextLine();

        Random random = new Random();
        int numeroConta = random.nextInt(999999) + 1;

        System.out.print("Deseja fazer um deposito inicial (y/n)? ");
        char resposta = entrada.next().charAt(0);
        if (resposta == 'y'){
            System.out.print("Entre com o deposito inicial: ");
            double depositoInicial = entrada.nextDouble();
            conta = new ContaBanco(numeroConta, agencia, nome, depositoInicial);
        }else{
            conta = new ContaBanco(numeroConta, agencia, nome);
        }

        System.out.println();
        System.out.println(conta);

        entrada.close();
    }
}
