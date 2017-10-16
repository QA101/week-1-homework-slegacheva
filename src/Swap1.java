
public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {10, 5};
		swap(data, 0, 1);
		 System.out.println(data[0] + " " + data[1]);
		 
	}

public static void swap(int[] list, int i, int j) {
	 int temp = list[i];
	 list[i] = list[j];
	 list[j] = temp;
	 }


	}


