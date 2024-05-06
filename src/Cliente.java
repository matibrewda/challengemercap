import java.util.ArrayList;

public class Cliente {
    private int idCliente;
    private ArrayList <Llamada> llamadas;

    public Cliente(int idCliente, ArrayList<Llamada> llamadas) {
        this.idCliente = idCliente;
        this.llamadas = llamadas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public void agregarLlamadaLocal(LlamadaLocal llamada){

        llamadas.add(llamada);
    }

    public void agregarLlamadaLejana(LlamadaLejana llamada){
        llamadas.add(llamada);
    }
}

