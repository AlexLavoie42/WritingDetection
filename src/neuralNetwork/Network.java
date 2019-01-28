package neuralNetwork;

public class Network {
    
	private final int INPUT_SIZE = 28*28;
	private final int OUTPUT_SIZE = 26;
	private final int LAYERS = 3;
	private final int LAYER_SIZE = 255;
	
	private InputNode[] inputs;
	private LayerNode[][] nodeLayer;
	private LayerNode[] outputs;
	
	public Network() {
	    inputs = new InputNode[INPUT_SIZE];
	    nodeLayer = new LayerNode[LAYERS][LAYER_SIZE];
	    outputs = new LayerNode[OUTPUT_SIZE];
	    
	    for(int i = 0; i < INPUT_SIZE; i++) {
	        inputs[i] = new InputNode();
	    }
	    
	    for(int l = 0; l < LAYERS; l++) {
	        for(int i = 0; i < LAYER_SIZE; i++) {
	            if(i == 0) {
	                nodeLayer[l][i] = new LayerNode(inputs);
	            } else {
	                nodeLayer[l][i] = new LayerNode(nodeLayer[l - 1]);
	            }
	        }
	    }
	}
}
