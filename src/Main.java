import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        InputNeuron n0 = new InputNeuron(1);
        Neuron n_out = new Neuron(2);


        ArrayList<Neuron> neuronList = new ArrayList<>();
        for(int i = 0;i<10;i++) {
           neuronList.add(new Neuron(1));
        }

        for(Neuron n : neuronList) {
            Neuron.connect(n0, n, 2.0);
            Neuron.connect(n, n_out, 3.0);
        }



        n0.start();
        System.out.println(n_out.getValue());


    }
}
