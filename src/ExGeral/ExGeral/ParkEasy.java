package ExGeral.ExGeral;

import java.util.Scanner;

public class ParkEasy {

    static Scanner inp = new Scanner(System.in);
    static Veiculos[] veiculos = new Veiculos[10];
    static int nVeiculo;
    static int nRegistro;
    static Hora[] registro = new Hora[20];

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

    private static Veiculos pesquisar() {
        String placa;
        System.out.printf("Placa do veículo:    ");
        placa = inp.next().toUpperCase();

        for (int i = 0; i < nVeiculo; i++) {
            if (veiculos[i].placa.equals(placa)) {
                return veiculos[i];
            }
        }
        System.out.println("[(?) Veículo não encontrado]");
        return null;
    }

    private static void entradaVeiculo() {
        String nome;
        long cpf;
        String marca, modelo, placa;
        String horaEntrada;

        Veiculos veiculoEncontrado = pesquisar();

        if (veiculoEncontrado == null) {
            System.out.printf("Nome do proprietário:    ");
            nome = inp.next();
            System.out.printf("Cpf: ");
            cpf = inp.nextLong();

            System.out.printf("Marca: ");
            marca = inp.next();
            System.out.printf("Modelo: ");
            modelo = inp.next();
            System.out.printf("Placa: ");
            placa = inp.next().toUpperCase();

            Proprietario proprietario = new Proprietario(nome, cpf);
            veiculos[nVeiculo] = new Veiculos(marca, modelo, placa, proprietario);

            nVeiculo++;
        } else {
            System.out.printf("Hora de entrada:    ");
            horaEntrada = inp.next();

            registro[nRegistro] = new Hora();
        }

    }

    private static void saidaVeiculo() {
    }

    private static void imprimeVeiculo() {

        for (int i = 0; i < nRegistro; i++) {
            System.out.println(registro[i].veiculos.placa);
            System.out.println(registro[i].veiculos.marca);
            System.out.println(registro[i].veiculos.modelo);

        }
    }

    private static void imprimeReceita() {
    }
}
