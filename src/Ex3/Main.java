package Ex3;

import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);
    static BilheteUnico[] bilhete = new BilheteUnico[3];

    static int n;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("--------MENU--------");
            System.out.println("1- cadastrar bilhete");
            System.out.println("2- carregar bilhete");
            System.out.println("3- consultar saldo");
            System.out.println("4- passar na catraca");
            System.out.println("5- FINALIZAR");
            System.out.println("--------------------");

            System.out.printf(" ");
            opcao = inp.nextInt();

            switch (opcao) {
                case 1 -> cadastrar();
//                case 2 ->
//                case 3 ->
//                case 4 ->
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
            nome = inp.nextLine();
            System.out.print("cpf do usuario: ");
            cpf = inp.nextLong();
            System.out.print("tipo de tarifa (estudante - professor - comum): ");
            tipoTarifa = inp.next();

            bilhete[n] = new BilheteUnico(new Usuario(nome, cpf, tipoTarifa));

            n++;
        } else {
            System.out.println("[ERRO]Procure um posto de atendimento");
        }
    }

    public BilheteUnico pesquisar() {
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
}
