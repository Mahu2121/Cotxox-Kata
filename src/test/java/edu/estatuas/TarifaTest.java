package edu.estatuas;

import org.junit.Test;

import static edu.estatuas.Tarifa.getCosteTotalEsperado;
import static org.junit.Assert.assertEquals;


public class TarifaTest {

   @Test
   public void getCosteEsperadoMinimoTest(){

       double distancia = 1;
       int tiempo = 1;
       String tarjetaCredito = "4916119711304546";

       Carrera carrera = new Carrera(tarjetaCredito);
       carrera.setDistancia(distancia);
       carrera.setTiempoEsperado(tiempo);

       assertEquals(5.0, getCosteTotalEsperado(carrera),0.01);

   }

    @Test
    public void getCosteEsperadoMaximoTest(){

        double distancia = 6;
        int tiempo = 11;
        String tarjetaCredito = "4916119711304546";

        Carrera carrera = new Carrera(tarjetaCredito);
        carrera.setDistancia(distancia);
        carrera.setTiempoEsperado(tiempo);

        assertEquals(11.95, getCosteTotalEsperado(carrera), 0.01);

    }
}
