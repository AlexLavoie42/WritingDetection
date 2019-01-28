package neuronMath;

/***************************
 * Code mostly taken from https://web.archive.org/web/20100827010909/http://users.computerweekly.net/robmorton/projects/neural/sigmoid.htm
 * Modified to work with Java
 */
public class NeuronMath {
	private static float k;
	private static float r;
	private static int accuracy;
	private static float[] sigTab;
	
	public static void genSigmoidTable(float r, int accuracy) {
		sigTab = new float[accuracy];
		float multiple = r / accuracy;
		
		
	}
	
	public static float sigmoid(float k) {
		boolean neg = false;
		if(k < 0) {
			neg = true;
			k *= -1;
		}
	}
}
