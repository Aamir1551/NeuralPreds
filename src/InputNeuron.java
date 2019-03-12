public class InputNeuron extends Neuron{

    public InputNeuron(double initialVal) {
       super(initialVal);
    }

    public void start() {
        this.receiveSignal(1);
    }


}
