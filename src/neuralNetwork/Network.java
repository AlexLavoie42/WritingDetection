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
	            if(l == 0) {
	                nodeLayer[l][i] = new LayerNode(inputs);
	            } else {
	                nodeLayer[l][i] = new LayerNode(nodeLayer[l - 1]);
	            }
	        }
	    }
	    
	    for(int i = 0; i < OUTPUT_SIZE; i++) {
	        outputs[i] = new LayerNode(nodeLayer[LAYER_SIZE - 1]);
	    }
	}
	
	public void run() {
	    for(int l = 0; l < LAYERS; l++) {
	        for(LayerNode n : nodeLayer[l]) {
	            n.getConnections();
	        }
	    }
	    for(LayerNode n : outputs) {
	        n.getConnections();
	    }
	    
	    printOutputsToConsole();
	}
	
	private void setInputs(float values[]) {
	    for(int i = 0; i < inputs.length; i++) {
	        inputs[i].setInput(values[i]);
	    }
	}
	
	public void printOutputsToConsole() {
	    for(LayerNode n : outputs) {
            System.out.println(n.value);
        }
	}
}
