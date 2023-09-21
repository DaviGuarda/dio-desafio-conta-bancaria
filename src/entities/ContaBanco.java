package entities;

import exceptions.ContaException;

public class ContaBanco {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBanco(){
    }

    public ContaBanco(int numeroConta, String agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
    }

    public ContaBanco(int numeroConta, String agencia, String nomeCliente, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        depositar(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if (saldo < valor){
            throw new ContaException("Saldo insuficiente para sacar R$" + valor);
        }
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return "Olá "
                +nomeCliente
                +", obrigado por criar uma conta em nosso banco, sua agência é "
                +agencia
                +", conta "
                +numeroConta
                +" e seu saldo R$"
                +String.format("%.2f", saldo)
                +" já está disponível para saque.";
    }
}
