package hu.soter;

import hu.soter.idomok.FaIdom;
import hu.soter.idomok.Gomb;
import hu.soter.idomok.Hasab;

import java.util.ArrayList;


public class FaIdomokProgram {
    private ArrayList<FaIdom> lista;


    public FaIdomokProgram() {
        this.lista = new ArrayList<>();
    }

    public void ujIdom(Gomb gomb) {
        lista.add(gomb);

    }
    public void ujIdom(Hasab hasab) {
        lista.add(hasab);
    }

    public ArrayList<String> getLista() {
        return new ArrayList<>(lista);
    }

    public double osszSuly(){
        double ossz=0;
        for (FaIdom idom:lista){
            ossz += idom.suly();
        }
        return ossz;
    }

    public double gombokOsszSuly() {
        double ossz=0;
        for (FaIdom idom:lista){
            ossz += idom.suly();
        }
        return ossz;
    }

    public FaIdom minV() {
        int m=0;
        for (int i = 1;i<lista.size();i++){

        }
        return new FaIdom() {
            @Override
            public double terfogat() {
                return 0;
            }
        };
    }

    public FaIdom maxV() {
        return new FaIdom() {
            @Override
            public double terfogat() {
                return 0;
            }
        };
    }
}
