package edu.estatuas;

import java.util.ArrayList;
import java.util.List;

public class PoolConductores {

    private List<Conductor> poolConductores;

    PoolConductores(List<Conductor> conductores) {
        List<Conductor> poolConductores = new ArrayList<Conductor>();
    }

    public List<Conductor> getPoolConductores() {
        return poolConductores;
    }

}
