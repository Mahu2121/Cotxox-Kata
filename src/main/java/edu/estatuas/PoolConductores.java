package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class PoolConductores {

    private List<Conductor> poolConductores;

    PoolConductores(List<Conductor> conductores) {
        this.poolConductores = conductores;
    }

    public List<Conductor> getPoolConductores() {
        return poolConductores;
    }

    public Conductor asignarConductor() {
       return getPoolConductores().get(0);
    }

}
