package HW_0724;

public class HW1 {
	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		
		int[] num = {10,20,30,40,50,60,70,80,90,100};
		
		System.out.println("Please enter any number:");
		int guess = scan.nextInt();
		
		for(int i = 0;i <= num.length;i++) {
			if(guess != num[i]) {
				System.out.println("no this number");
				
			}else if(i >= num.length)
				break;
			else {
				System.out.println("number " + i +" in index " + "is " + num[i]);
				break;
			}
				
					
		}
	}

}
