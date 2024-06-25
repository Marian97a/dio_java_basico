package main;

import banco.Banco;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco("Banco Digital");

        System.out.println("Bem-vindo ao Banco Digital");

        // Criando Conta Corrente
        System.out.print("Insira o nome do cliente para Conta Corrente: ");
        String nomeClienteCC = scanner.nextLine();
        System.out.print("Insira o número da Conta Corrente: ");
        String numeroContaCC = scanner.nextLine();
        System.out.print("Insira o saldo inicial da Conta Corrente: ");
        double saldoInicialCC = scanner.nextDouble();
        System.out.print("Insira o limite da Conta Corrente: ");
        double limiteCC = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha

        Conta contaCorrente = new ContaCorrente(nomeClienteCC, numeroContaCC, saldoInicialCC, limiteCC);
        banco.adicionarConta(contaCorrente);

        // Criando Conta Poupança
        System.out.print("Insira o nome do cliente para Conta Poupança: ");
        String nomeClienteCP = scanner.nextLine();
        System.out.print("Insira o número da Conta Poupança: ");
        String numeroContaCP = scanner.nextLine();
        System.out.print("Insira o saldo inicial da Conta Poupança: ");
        double saldoInicialCP = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha

        Conta contaPoupanca = new ContaPoupanca(nomeClienteCP, numeroContaCP, saldoInicialCP);
        banco.adicionarConta(contaPoupanca);

        // Realizando Operações
        System.out.print("Insira o valor para depositar na Conta Corrente: ");
        double depositoCC = scanner.nextDouble();
        contaCorrente.depositar(depositoCC);

        System.out.print("Insira o valor para sacar da Conta Corrente: ");
        double saqueCC = scanner.nextDouble();
        contaCorrente.sacar(saqueCC);

        System.out.print("Insira o valor para depositar na Conta Poupança: ");
        double depositoCP = scanner.nextDouble();
        contaPoupanca.depositar(depositoCP);

        System.out.print("Insira o valor para sacar da Conta Poupança: ");
        double saqueCP = scanner.nextDouble();
        contaPoupanca.sacar(saqueCP);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        System.out.print("Insira o valor para transferir da Conta Corrente para a Conta Poupança: ");
        double transferencia = scanner.nextDouble();
        contaCorrente.transferir(transferencia, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        scanner.close();
    }
}
