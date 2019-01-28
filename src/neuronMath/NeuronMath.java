package neuronMath;

public class NeuronMath {
    //TODO: Make efficient
	public static float sigmoid(float k) {
		return (float) (1 / (1 + Math.pow(Math.E, -k)));
	}
}
