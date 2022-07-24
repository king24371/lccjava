package HW_0724;

public class HW2 {
	public static void main(String[] args) {
		
		Sort();
		
	}
	
	
	static int[] Sort() {
		int[] data = {8,6,1,10,5,3,9,2,7,4};
		int inst;
		
		for(int l = 0; l < data.length;l++) {
			for(int i = l+1;i < data.length;i++) {
				if(data[i] < data[i+1]) {
					inst = data[i];
					data[i] = data[i+1];
					data[i+1] = inst;
				}
			}
		}
			return data;
		
	}

}
