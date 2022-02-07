package homework2;

public class no6 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=1;j<=9;j++) {
			if((5-i<=j)&&(j<=5+i)) {
				System.out.print("*");
				}else {
				System.out.print(" ");
	
					
					}
				}
			for(int k=10;k<=19;k++) {
				if((5+10-i<=k)&&(k<=5+10+i)) {
					System.out.print("*");
					}else {
					System.out.print(" ");
	
			
					}
				}
			System.out.println();
			}
		for(int i=3;i>=0;i--) {
			for(int j=1;j<=9;j++) {
			if((5-i<=j)&&(j<=5+i)) {
				System.out.print("*");
				}else {
				System.out.print(" ");
	
					
				}
				
			}
			for(int k=10;k<=19;k++) {
				if((5+10-i<=k)&&(k<=5+10+i)) {
					System.out.print("*");
					}else {
					System.out.print(" ");
		
			
					}
				}
			System.out.println();
			
		}
	}

}
