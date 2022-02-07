package homework2;

public class no7 {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=1;j<=35;j++) {
			if((18-i<=j)&&(j<=18+i)) {
				System.out.print("*");
				}else {
				System.out.print(" ");
	
					
					}
				}
			System.out.println();
		}
		
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<=9;j++) {
			if((5-i<=j)&&(j<=5+i)) {
				System.out.print("*");
				}else {
				System.out.print(" ");
	
					
					}
				}
			for(int k=10;k<=26;k++) {
				if((14-i<=k)&&(k<=22+i)) {
					System.out.print("*");
					}else {
					System.out.print(" ");
	
			
					}
				}
			for(int l=27;l<=35;l++) {
				if((31-i<=l)&&(l<=31+i)) {
					System.out.print("*");
					}else {
					System.out.print(" ");
	
			
					}
				}
			System.out.println();
			}

	}

}
