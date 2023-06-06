package Entities;

import Interface.IConta;

public class ContaPoupanca extends Conta  {
    public ContaPoupanca(Cliente cliente, String senha){
        super(cliente, senha);


    }


    @Override
    public void imprimirExtrato() {
        System.out.println("==== EXTRATO CONCTA POUPANÇA ====");
        super.imprimirInfoComuns();

    }
}


