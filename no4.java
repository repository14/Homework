package homework2;

public class no4 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=1;j<=9;j++) {
			if((5-i<=j)&&(j<=5+i)) {
				System.out.print("*");
				}else {
				System.out.print(" ");
	
					
				}
				
			}
			System.out.println();
			
		}

	}

}
