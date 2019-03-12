
public class Main {

    public static void main(String[] args) {

        InputNeuron n1 = new InputNeuron(1);
        Neuron n2 = new Neuron(2);

        Neuron.connect(n1, n2, 3.0);

        n1.start();
        System.out.println(n2.getValue());


    }
}
