
public class Swap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {10, 5, 12};
		swap(data, 0, 1, 2);
		 System.out.println(data[0] + " " + data[1] + " " + data[2]);
		 
	}

public static void swap(int[] list, int i, int j, int h) {
	 int temp = list[i];
	 list[i] = list[h];
	 list[h] = temp;
	 list[h] = list[j];
	 list[j] = temp;
	 }


	}


