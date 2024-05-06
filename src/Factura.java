public class Factura {
    private Cliente cliente;
    private float tarifaFija = 10;
    private int anio;
    private int mes;


    public void imprimirFactura(){
        float total = tarifaFija;
        System.out.println("Cliente: "+ cliente.getIdCliente()+" Mes: "+mes+" Año: "+anio);
        System.out.println("Tarifa Fija ________________ $: "+ tarifaFija);
        for (Llamada llamada : cliente.getLlamadas()){
        if (llamada.Mes()==mes && llamada.Anio()==anio){
            System.out.println(llamada.detalle()+" $:"+llamada.calcularCosto());
            total+=llamada.calcularCosto();
        }
        }
        System.out.println("Total ___________________ $: "+ total);
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
}

