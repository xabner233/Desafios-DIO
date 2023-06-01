package DesafioContador;

import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        boolean repetir = true;

        while (repetir) {
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm;
            try {
                parametroUm = Integer.parseInt(terminal.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: O valor digitado não é um número inteiro válido.");
                continue;
            }

            System.out.println("Digite o segundo parâmetro:");
            int parametroDois;
            try {
                parametroDois = Integer.parseInt(terminal.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: O valor digitado não é um número inteiro válido.");
                continue;
            }

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Deseja realizar outra contagem? (S/N)");
            String opcao = terminal.nextLine().toUpperCase();
            repetir = opcao.equals("S");
        }

        System.out.println("Programa encerrado.");
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
}
