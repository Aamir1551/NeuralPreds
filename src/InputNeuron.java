public class InputNeuron extends Neuron{

    public InputNeuron() {
       super();
    }

    public void start() {
        this.sendSignal(1, this.lecherIdMaps.values());
    }


}
