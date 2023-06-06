import Entities.Cliente;
import Entities.Conta;
import Entities.ContaCorrente;
import Entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        List<Conta> contas = new ArrayList<>();
        int numeroContaDesejada;
        int numeroContaDesejada2;


        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu Bancario:");
            System.out.println("1. para Cadastrar Cliente 1");
            System.out.println("2. Deposito 2");
            System.out.println("3. Saque");
            System.out.print("4. Transferncia ");
            System.out.print("5. Sair ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção 1");

                    System.out.println("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite o CPF: ");
                    String cpf = scanner.nextLine();
                    Cliente cliente = new Cliente(nome, cpf);

                    System.out.println("Digite uma senha de 6(seis) digitos unicamente numericas:");
                    String senha = scanner.nextLine();
                    boolean senhaConfirm = false;
                    while (senhaConfirm = false) {
                        if (senha.matches("\\d{6}")) {
                            System.out.println("Senha criada com sucesso!");
                            senhaConfirm = true;
                        } else {
                            System.out.println("Senha inválida. A senha deve conter 6 dígitos numéricos.");
                        }
                    }

                    System.out.println("Escolha o tipo de conta: ");
                    System.out.println("Caso digite uma opção inválida. A conta será criada como Conta Corrente por padrão.");
                    System.out.println("1. Conta Corrente");
                    System.out.println("2. Conta Poupança");
                    int escolha = scanner.nextInt();

                    if (escolha == 1) {
                        Conta conta = new ContaCorrente(cliente, senha);
                    } else if (escolha == 2) {
                        Conta conta = new ContaPoupanca(cliente, senha);
                    } else {
                        System.out.println("Opção inválida. A conta será criada como Conta Corrente por padrão.");
                        Conta conta = new ContaCorrente(cliente, senha);
                    }
                    break;

                case 2:
                    System.out.println("Você escolheu a opção de deposito");
                    System.out.println("Digite o numero da conta: ");
                    numeroContaDesejada = scanner.nextInt();
                    for (Conta conta : contas) {
                        if (conta.getNumero() == numeroContaDesejada) {
                            System.out.println("Digite o valor a ser depositado: ");
                            double valorDeposito = scanner.nextDouble();
                            conta.depositar(valorDeposito);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Você escolheu a opção de saque");
                    System.out.println("Digite o numero da conta: ");
                    numeroContaDesejada = scanner.nextInt();
                    for (Conta conta : contas) {
                        if (conta.getNumero() == numeroContaDesejada) {
                            System.out.println("Digite o valor a ser sacado: ");
                            double valorSaque= scanner.nextDouble();
                            conta.sacar(valorSaque);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Você escolheu a opção de trasnferencia");
                    System.out.println("Digite o numero da conta: ");
                    numeroContaDesejada = scanner.nextInt();
                    for (Conta conta : contas) {
                        if (conta.getNumero() == numeroContaDesejada) {
                            System.out.println("Digite o valor a ser sacado: ");
                            double valorSaque = scanner.nextDouble();
                            conta.sacar(valorSaque);
                        }
                    }

                    System.out.println("Digite o numero da conta que recebera a transferencia: ");
                    numeroContaDesejada = scanner.nextInt();
                    for (Conta conta : contas) {
                        if (conta.getNumero() == numeroContaDesejada) {
                            System.out.println("Digite o valor a ser depositado: ");
                            double valorDeposito = scanner.nextDouble();
                            conta.depositar(valorDeposito);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }

}