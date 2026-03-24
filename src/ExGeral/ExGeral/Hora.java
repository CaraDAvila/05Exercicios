package ExGeral.ExGeral;

import java.time.Duration;
import java.time.LocalTime;

public class Hora {
    Veiculos veiculos;

    String inicioStr;
    String fimStr;

    LocalTime inicio = LocalTime.parse(inicioStr);
    LocalTime fim = LocalTime.parse(fimStr);

    long minutos = Duration.between(inicio, fim).toMinutes();
}
