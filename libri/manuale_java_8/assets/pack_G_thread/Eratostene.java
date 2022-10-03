package pack_G_thread;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Eratostene{

    private Set<Integer> setPrimi;
    private Long nLimit;

    ////////////////////////
    public Long getLimit(){return nLimit;}
    public Set<Integer> getSet(){return setPrimi;}
    ////////////////////////

    public Eratostene(Long nLimit){
        this.nLimit = nLimit;
        setPrimi = new HashSet<Integer>();
        build();
        removeSquares();
    }
    private void build(){
        for(int k=3 ; k <=nLimit ; k=k+2){
            setPrimi.add(new Integer(k));
        }
    }

    private void removeSquares() {
    }
}