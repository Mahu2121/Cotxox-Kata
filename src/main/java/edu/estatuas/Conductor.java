package edu.estatuas;


import java.util.ArrayList;

public class Conductor {

    private String nombre;
    private String modelo;
    private String matricula;
    private double valoracionMedia;
    private boolean ocupado = true;
    private ArrayList<Byte> valoraciones;

    Conductor() {

    }

    Conductor(String nombre){
        this.nombre = nombre;
        this.valoraciones = new ArrayList<>();
        this.ocupado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }


    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
    }

    public double getValoracion() {
        return valoraciones.get(0);
    }

    public int getNumeroValoraciones() {
        return valoraciones.size();
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isOcupado() {
        return ocupado;
    }




}
