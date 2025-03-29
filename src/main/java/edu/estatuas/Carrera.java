package edu.estatuas;

public class Carrera {

    private String tarjetaCredito;
    private String origen;
    private String destino;
    private double distancia;
    private int tiempoEsperado;
    private int tiempoCarrera;
    private double costeTotal;
    private int propina;

    private Conductor conductor;

    Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTiempoEsperado(int tiempoEsperado) {
        this.tiempoEsperado = tiempoEsperado;
    }

    public void setTiempoCarrera(int tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public void setCosteTotal(double costeTotal) {
        this.costeTotal = costeTotal;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public int getTiempoEsperado() {
        return tiempoEsperado;
    }

    public int getTiempoCarrera() {
        return tiempoCarrera;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public int getPropina() {
        return propina;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductores.asignarConductor());
    }

    public void realizarPago(double costeEsperado) {
        setCosteTotal(costeEsperado);
        setPropina(getPropina() + 1);

    }

    public void recibirPropina(int propina) {
        setPropina(getPropina() + propina);
    }

}
