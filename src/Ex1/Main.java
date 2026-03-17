package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        MonitorEnergia monitorEnergia = new MonitorEnergia(100);
        monitorEnergia.consumoEnergia(1);
        monitorEnergia.consumoEnergia(3);
        monitorEnergia.consumoEnergia(2);
        monitorEnergia.consumoEnergia(3);
        monitorEnergia.consumoEnergia(2);


        System.out.println("Media: " + monitorEnergia.mediaEnergia());
        System.out.println("Media em um intervalo de dias: " + monitorEnergia.mediaEnergia(2, 4));



    }
}
