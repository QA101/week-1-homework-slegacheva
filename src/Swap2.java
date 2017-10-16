
public class Swap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] data = {2.5, 7.5};
		swap(data, 0, 1);
		 System.out.println(data[0] + " " + data[1]);
		 
	}

public static void swap(double[] list, int i, int j) {
	 double temp = list[i];
	 list[i] = list[j];
	 list[j] = temp;
	 }

	}


