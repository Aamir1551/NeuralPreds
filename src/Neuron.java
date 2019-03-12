import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Neuron {

    protected static int numberOfNeurons = 0;
    protected int id = 0;

    protected HashMap<Integer, Neuron> lecherIdMaps = new HashMap<>(); //these neurons are the ones that will be fed
    protected HashMap<Integer, Neuron> feederIdMaps = new HashMap<>(); //these neurons are the ones that will be feeding
    protected HashMap<Integer, Double> weights = new HashMap<>();



    protected double feederCount = 0;
    protected double value = 0;

    public Neuron() {
        this.id = numberOfNeurons;
        numberOfNeurons++;


    }

    public static void connect (Neuron feeder, Neuron lecher, Double w){
        feeder.lecherIdMaps.put(lecher.id, lecher);
        lecher.feederIdMaps.put(feeder.id, feeder);
        feeder.weights.put(lecher.id, w);
    }

    public void feedAll() {

        for( Integer id : lecherIdMaps.keySet()) {
            this.lecherIdMaps.get(id).eat(this.weights.get(id) * this.value);

        }

        this.sendSignal(1, lecherIdMaps.values());

    }

    public void eat(double val) {
        this.value += val;
        this.feederCount++;

    }

    public void reset() {
        this.value = 0;
    }

    protected void sendSignal(Integer s, Collection<Neuron> neurons) {
        for(Neuron n : neurons) {
            n.receiveSignal(s);
        }

    }

    private void receiveSignal(Integer s) {
        if(s == 1) {
             if(feederCount == this.feederIdMaps.size()) {
                this.feedAll();
             }
        }

    }


}
