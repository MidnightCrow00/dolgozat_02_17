package hu.soter;

import hu.soter.idomok.FaIdom;
import hu.soter.idomok.Gomb;
import hu.soter.idomok.Hasab;

import java.util.ArrayList;
import java.util.List;

public class FaIdomokProgram {
    private List<FaIdom> lista;

    public FaIdomokProgram() {
        lista = new ArrayList<>();
        lista.add(new Gomb(1));
        lista.add(new Hasab(1,1,1));
    }

    public void ujIdom(Gomb gomb) {

    }

    public ArrayList<String> getLista(FaIdom faIdom) {
        return new ArrayList<>();
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
