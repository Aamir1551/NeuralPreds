
public class Main {
    public static void Main() {

        InputNeuron n1 = new InputNeuron();
        Neuron n2 = new Neuron();

        Neuron.connect(n1, n2, 3.0);

        n1.start();


    }
}
    