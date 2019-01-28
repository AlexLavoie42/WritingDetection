package neuralNetwork;

public abstract class Node {
	protected float value;
	
	public float calcValue(float weight, float bias, float value) {
		return(weight * value + bias);
	}
	
	public float getValue() {
		return value;
	}
}
