package Ex1;

public class MonitorEnergia {
    int indice;
    double[] consumoDiario;

    public MonitorEnergia(int n) {
        this.consumoDiario = new double[n];
    }

    public void consumoEnergia(double valor) {
        if (indice < consumoDiario.length) {
            consumoDiario[indice] = valor;
            indice++;
        }
    }

    public double mediaEnergia() {
        double media = 0;

        for (int i = 0; i < indice; i++) {
            media += consumoDiario[i];
        }
        return media / indice;
    }


    public double mediaEnergia(int i, int f) {
        double media = 0;

        for (int j = i-1; j < f; j++) {
            media += consumoDiario[j];
        }
        return media / (f-i+1);
    }

}
