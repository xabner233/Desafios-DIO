package Entities;

import Interface.IConta;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO= 1;
    private static int SEQUENCIAL=1;
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
    private  String senha;

    public  Conta(Cliente cliente, String senha){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = this.cliente;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Foi depositado: " +valor +" na conta de: " + this.cliente.getNome());
    }

    @Override
    public void sacar(double valor) {
        if (valor> this.saldo){
            System.out.println("Saldo insuficiente para saque ou deposito");
        } else {
            this.saldo -= valor;
            System.out.println("Foi sacado: " + valor + " na conta de: " + this.cliente.getNome());
        }
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void imprimirInfoComuns(){
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public boolean verificaSenha(String senha) {
        if (senha.length() == 6) {
            for (int i = 0; i < senha.length(); i++) {
                if (!Character.isDigit(senha.charAt(i))) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", cliente=" + cliente +
                '}';
    }
}
