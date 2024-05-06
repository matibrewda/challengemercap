import java.time.DayOfWeek;

import java.time.LocalDateTime;
import java.time.Month;

public class LlamadaLocal implements Llamada {

    private LocalDateTime diahora;
    private int duracion;

    public LlamadaLocal(LocalDateTime diahora, int duracion) {
        this.diahora = diahora;
        this.duracion = duracion;
    }

    @Override
    public float calcularCosto() {
        float costo;
       DayOfWeek dia = diahora.getDayOfWeek();
       int hora = diahora.getHour();
       if(dia.getValue() >= 1 && dia.getValue() <= 5 && hora >= 8 && hora <=20){
            costo = (float) (duracion * 0.2);
       } else{
           costo = (float) (duracion * 0.1);
       }
        return costo;
    }

    @Override
    public int Anio() {
        return diahora.getYear();
    }

    @Override
    public int Mes() {
        return diahora.getMonth().getValue();
    }

    @Override
    public String detalle() {
        return "Llamada local  Duracion: "+duracion;
    }
}
