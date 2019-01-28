package neuralNetwork;

import java.util.Random;

public class LayerNode extends Node{
	private float bias;
	private Node[] connections;
	private float[] weights;

	public LayerNode(Node[] connections) {
	    Random r = new Random();
		this.connections = connections;
		weights = new float[connections.length];
		
		bias = r.nextFloat();
		for(float f : weights) {
		    f = r.nextFloat();
		}
		
	}
	
	public void getConnections() {
		for(int i = 0; i < connections.length; i++) {
			value = calcValue(connections[i].value, i);
		}
		
	}
	
	private float calcValue(float value, int i) {
		return(calcValue(weights[i], bias, value));
	}
	
	public void shiftNode(float biasDiff, float weightDiff, int index) {
		bias += biasDiff;
		weights[index] += weightDiff;
	}
}
