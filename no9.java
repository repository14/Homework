package homework2;

public class no9 {

	public static void main(String[] args) {
		for(int i=0;i<7;i++) {
			for(int j=0;j<=i;j++) {
				if((j==0)||(j==i)) {
					System.out.print("*");
				}else {
					System.out.print("@");
				}
	
			
			}
			System.out.println();
			
		}
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				if((j==0)|(j==i)) {
					System.out.print("*");
				}else {
					System.out.print("@");
				}
			
		}
				System.out.println();
	}
	}

}
