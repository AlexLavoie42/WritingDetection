package neuralNetwork;

import neuronMath.NeuronMath;

public abstract class Node {
	protected float value;
	
	public float calcValue(float weight, float bias, float value) {
		return(NeuronMath.sigmoid((weight * value) + bias));
	}
}
