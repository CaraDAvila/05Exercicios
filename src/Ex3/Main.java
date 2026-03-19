package Ex3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);
    static BilheteUnico[] bilhete = new BilheteUnico[3];

    static int n;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n--------MENU--------");
            System.out.println("1- cadastrar bilhete");
            System.out.println("2- carregar bilhete");
            System.out.println("3- consultar saldo");
            System.out.println("4- passar na catraca");
            System.out.println("5- FINALIZAR");
            System.out.println("--------------------\n");

            opcao = inp.nextInt();

            switch (opcao) {
                case 1 -> cadastrar();
                case 2 -> carregar();
                case 3 -> consultarSaldo();
                case 4 -> passarNaCatraca();
                case 5 -> System.out.println("[Programa finalizado]");
                default -> System.out.println("[(?) opcão invalida, tente novamente]");
            }
        } while (opcao != 5);
    }


    private static void cadastrar() {
        String nome;
        long cpf;
        String tipoTarifa;

        if (n < bilhete.length) {
            System.out.print("nome do usuario: ");
            nome = inp.next();
            System.out.print("cpf do usuario: ");
            cpf = inp.nextLong();
            System.out.print("tipo de tarifa (estudante - professor - comum): ");
            tipoTarifa = inp.next();

            bilhete[n] = new BilheteUnico(new Usuario(nome, cpf, tipoTarifa));

            n++;
        } else {
            System.out.println("[(!)Procure um posto de atendimento]");
        }
    }

    public static BilheteUnico pesquisar() {
        long cpf;
        System.out.print("CPF para pesquisar: ");
        cpf = inp.nextLong();

        for (int i = 0; i < n; i++) {
            if (bilhete[i].usuario.cpf == cpf) {

                return bilhete[i];
            }
        }
        System.out.printf("CPF não enccontrado, tente novamente.");
        return null;
    }

    private static void carregar() {
        double valor;

        BilheteUnico bilheteUnico = pesquisar();

        if (bilheteUnico != null) {
            System.out.println("Valor a ser carregado: ");
            valor = inp.nextDouble();

            bilheteUnico.carregar(valor);
        }


    }

    private static void consultarSaldo() {
        DecimalFormat df = new DecimalFormat("0.00");
        BilheteUnico bilheteUnico = pesquisar();

        if (bilheteUnico != null) {
            System.out.println("Saldo:  " + df.format(bilheteUnico.saldo));
        }

    }

    private static void passarNaCatraca() {
        DecimalFormat df = new DecimalFormat("0.00");

        BilheteUnico bilheteUnico = pesquisar();

        if (bilheteUnico != null) {
            if (!bilheteUnico.passarNaCatraca()) {
                System.out.println("[(!)Saldo insuficiente]");

            }
            System.out.println("Saldo atual:    R$" + df.format(bilheteUnico.saldo));
        }

    }

}
