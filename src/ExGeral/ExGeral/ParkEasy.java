package ExGeral.ExGeral;

import java.util.Scanner;

public class ParkEasy {

    static Scanner inp = new Scanner(System.in);
    static Veiculos[] veiculos = new Veiculos[10];
    static int nVeiculo;

    public static void main(String[] args) {


        int opcao;

        // ps: breaking lines work, """ """
        do {
            System.out.println("#### Estacionamento ParkEasy ####");
            System.out.println("[1]Entrada de veículo");
            System.out.println("[2] Saída de veículo");
            System.out.println("[3]Imprimir veículos estacionados");
            System.out.println("[4] Imprimir a receita");
            System.out.println("[5] Finalizar");
            System.out.println("#################################\n");
            opcao = inp.nextInt();

            switch (opcao) {
                case 1 -> entradaVeiculo();
                case 2 -> saidaVeiculo();
                case 3 -> imprimeVeiculo();
                case 4 -> imprimeReceita();
                case 5 -> System.out.println("[Programa finalizado]");
                default -> System.out.println("[(?) opcão invalida, tente novamente]");
            }
        } while (opcao != 5);


    }

    private static void entradaVeiculo() {
    }

    private static void saidaVeiculo() {
    }

    private static void imprimeVeiculo() {
    }

    private static void imprimeReceita() {
    }
}
