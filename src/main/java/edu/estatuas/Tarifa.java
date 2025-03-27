package edu.estatuas;

public class Tarifa {

    final static double COSTE_MILLA = 1.35;
    final static double COSTE_MINUTO = 0.35;
    final static double COSTE_MINIMO = 5.0;
    final static byte PORCENTAJE_COMISION = 20;

    public static double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(int tiempo) {
        return tiempo * COSTE_MINUTO;
    }

    public static double getCosteTotalEsperado(Carrera carrera) {

        return Math.max(getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado()), COSTE_MINIMO);
    }

}
