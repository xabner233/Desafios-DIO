package Entities;

public class ContaCorrente extends Conta  {


    public ContaCorrente(Cliente cliente, String senha){
        super(cliente, senha);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== EXTRATO CONCTA CORRENTE ====");
        super.imprimirInfoComuns();


    }
}
