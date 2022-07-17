
public class HW3 {
public static void main(String[] args) {
	java.util.Scanner scan = new java.util.Scanner(System.in);
		
	System.out.println("please enter the number:");
	int num = scan.nextInt();
	
	for(int i=1;i<=100;i++) {
		int ans = num/i;
		System.out.println(ans);
		if(num%i != 0) {
			if(ans <= 1 || i >= num )
				break;
		}continue;
		
		
	}		
			
		
		
	}

}
