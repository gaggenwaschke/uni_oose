
public class SortDoubles {
	public static void main(String[] args) {
		double[] a = {2,5,7,7,3,4,5,134,5,87,443,2,1,45,46};
		double[] sorted_a = sortDouble(a);
		
		System.out.print("[");
		for (double d: sorted_a) {
			System.out.print(d + ", ");
		}
		System.out.println("]");
	}
	
	public static double[] sortDouble(double[] a) {
		double[] temp = new double[a.length];
		System.arraycopy(a, 0, temp, 0, a.length );
		
		for(int i = 0; i < a.length-1; i++) {
			int i_smallest = i;
			double smallest = temp[i];
			
			// find smallest remainder
			for (int j = i+1; j < a.length; j++) {
				if (temp[j] < smallest) {
					smallest = temp[j];
					i_smallest = j;
				}
			}
			
			// switch with first
			temp[i_smallest] = temp[i];
			temp[i] = smallest;
		}
		
		return temp;
	}
}
