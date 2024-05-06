import java.time.LocalDateTime;
import java.time.Month;

public class LlamadaLejana implements Llamada  {
    private Destino destino;
    private int duracion;
    private LocalDateTime diahora;

    public LlamadaLejana(Destino destino, int duracion, LocalDateTime diahora) {
        this.destino = destino;
        this.duracion = duracion;
        this.diahora = diahora;
    }

    @Override
    public float calcularCosto() {
        return (destino.getCostoXMinuto()*duracion);
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
        return "Llamada de larga Distancia  destino:" + destino.getNombreDestino() + " Duracion: "+ duracion;
    }

}
