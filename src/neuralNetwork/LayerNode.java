package neuralNetwork;

import java.util.ArrayList;

public class LayerNode extends Node{
	private float bias;
	private float weight;
	private final float ACC = 1024;
	private ArrayList<Node> connections;

	public LayerNode(float bias, float weight) {
		this.bias = bias;
		this.weight = weight;
	}
	
	public void getConnections() {
		float rawVal = 0;
		for(Node n : connections) {
			rawVal += calcValue(n.value);
		}
		
	}
	
	public float calcValue(float value) {
		return(calcValue(weight, bias, value));
	}
	
	public void shiftNode(float biasDiff, float weightDiff) {
		bias += biasDiff;
		weight += weightDiff;
	}
	
	public void createConnection(Node ... nodes) {
		for(Node n : nodes) {
			connections.add(n);
		}
	}
}
